package transliteration;

import mapping.CharacterMapping;
import mapping.HindiMapping;
import mapping.ItransAsciiMapping;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by kosh on 3/14/14.
 */
public class TransliterationEngine {

    public String transliterate(String data, String sourceLanguage, String targetLanguage)
    {
        if (!(sourceLanguage.equals("english") && targetLanguage.equals("hindi")))
        {
            return "Source and/or target language  combination not implemented";
        }

        CharacterMapping englishMapping = new ItransAsciiMapping();
        CharacterMapping hindiMapping = new HindiMapping();
        return transliterateHelper(data, englishMapping, hindiMapping);
    }

    private String transliterateHelper(String data, CharacterMapping englishMapping, CharacterMapping hindiMapping) {
        int maxTokenLength = computeMaxTokenLength(englishMapping);
        int inputLength = data.length();
        boolean hadConsonant = false;
        StringBuilder buffer = new StringBuilder(inputLength);
        String tokenBuffer = "";

        HashMap<String, String> tokenMap = createTokenMap(englishMapping, hindiMapping);
        HashMap<String, String[]> englishTokenGroups = englishMapping.getMapping();
        HashMap<String, String[]> hindiTokenGroups = hindiMapping.getMapping();


        for(int i = 0; i < inputLength || !tokenBuffer.isEmpty(); i++){

            if (i < inputLength) {
                char currentChar = data.charAt(i);
                int difference = maxTokenLength - tokenBuffer.length();
                if(difference > 0 && i < inputLength) {
                    tokenBuffer += currentChar;
                    if (difference > 1) {
                        continue;
                    }
                }
            }

            // match token substrings
            for(int j = 0; j < maxTokenLength; j++) {
                int tokenLength = maxTokenLength - j;
                tokenLength = (tokenLength > tokenBuffer.length()) ? tokenBuffer.length() : tokenLength;
                String token = tokenBuffer.substring(0, tokenLength);
                String tempLetter = tokenMap.get(token);
                if (tempLetter != null) {
                    if (hadConsonant) {
                        String vowelMark = "!";
                        if (vowelMark != null) {
                            buffer.insert(0, vowelMark);
                        } else if (!token.equals("a")) {
                            buffer.insert(0, hindiTokenGroups.get("virama")[0]);
                            buffer.insert(0, tempLetter);
                        }
                    } else {
                        buffer.insert(0, tempLetter);
                    }
                    hadConsonant = Arrays.asList(englishTokenGroups.get("consonants")).contains(token);
                    // trim the buffer
                    tokenBuffer = tokenBuffer.substring(tokenLength);
                    break;
                } else if (j == maxTokenLength - 1) {
                    if (hadConsonant) {
                        hadConsonant = false;
                    }
                    buffer.insert(0, token);
                    tokenBuffer = tokenBuffer.substring(1);
                }
            }
        }

        if (hadConsonant)
        {
            buffer.insert(0, hindiTokenGroups.get("virama")[0]);
        }

        return buffer.reverse().toString();
    }

    // Get the maximum token length from the list of all possible tokens in the from
    // language
    private int computeMaxTokenLength(CharacterMapping mappingData)
    {
        int max = -1;
        for (Map.Entry<String, String[]> entry : mappingData.getMapping().entrySet()) {
            for (String token : entry.getValue()) {
                if (token.length() > max){
                    max = token.length();
                }
            }
        }

        return max;
    }

    // Create a 1-to-1 token mapping between from and to languages
    private HashMap<String, String> createTokenMap(CharacterMapping from, CharacterMapping to) {
        HashMap<String, String> tokenMapping = new HashMap<>();

        HashMap<String, String[]> fromMapping = from.getMapping();
        HashMap<String, String[]> toMapping = to.getMapping();
        for (Map.Entry<String, String[]> fromEntry : fromMapping.entrySet()) {
            String[] fromTokens = fromEntry.getValue();
            String[] toTokens = toMapping.get(fromEntry.getKey());

            for (int i = 0; i < fromTokens.length; i++) {
                tokenMapping.put(fromTokens[i], toTokens[i]);
            }
        }
        return tokenMapping;
    }
}

package transliteration;

import mapping.HindiMapping;
import mapping.ItransAsciiMapping;

import java.util.ArrayList;

/**
 * Created by kosh on 3/14/14.
 */
public class TransliterationEngine {

    public String transliterate(String data, String sourceLanguage, String targetLanguage)
    {
        if (sourceLanguage == "english" && targetLanguage == "hindi")
        {

        }
        return "hello world";
    }

    private String transliterateHelper(String data, ItransAsciiMapping englishMapping, HindiMapping hindiMapping){
        ArrayList<String> buffer = new ArrayList<String>();

        for(int i = 0; i < )

        return buffer.toString();
    }
}

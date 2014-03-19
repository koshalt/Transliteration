package mapping;

import java.util.HashMap;

/**
 * Created by kosh on 3/13/14.
 */
public class ItransAsciiMapping implements CharacterMapping {

    private static String[] vowels = "a A i I u U RRi RRI LLi LLI  e ai  o au".split(" ");

    private static String[] otherMarks = "M H .N".split(" ");

    private static String[] virama = "".split(" ");

    private static String[] consonants = "k kh g gh ~N ch Ch j jh ~n T Th D Dh N t th d dh n p ph b bh m y r l v sh Sh s h L kSh j~n".split(" ");

    private static String[] symbols = "0 1 2 3 4 5 6 7 8 9 OM .a | ||".split(" ");

    private static String[] candra = ".c".split(" ");

    private static String[] zwj = "".split(" ");

    private static String[] skip = "_".split(" ");

    private static String[] accent = "\\' \\_".split(" ");

    private static String[] comboAccent = "\\'H \\_H \\'M \\_M".split(" ");

    private static String[] other = "q K G z .D .Dh f Y R".split(" ");

    private HashMap<String, String[]> mapping;

    public ItransAsciiMapping(){
        mapping = new HashMap<String, String[]>();
        mapping.put("vowels", vowels);
        mapping.put("otherMarks", otherMarks);
        mapping.put("consonants", consonants);
        mapping.put("symbols", symbols);
        mapping.put("candra", candra);
        mapping.put("zwj", zwj);
        mapping.put("skip", skip);
        mapping.put("accent", accent);
        mapping.put("comboAccent", comboAccent);
        mapping.put("other", other);
        mapping.put("virama", virama);
    }

    public HashMap<String, String[]> getMapping(){
        return this.mapping;
    }
}

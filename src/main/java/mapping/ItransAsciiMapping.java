package mapping;

/**
 * Created by kosh on 3/13/14.
 */
public class ItransAsciiMapping {

    public static String[] vowels = "a A i I u U RRi RRI LLi LLI  e ai  o au".split(" ");

    public static String[] otherMarks = "M H .N".split(" ");

    public static String[] virama = "".split(" ");

    public static String[] consonants = "k kh g gh ~N ch Ch j jh ~n T Th D Dh N t th d dh n p ph b bh m y r l v sh Sh s h L kSh j~n".split(" ");

    public static String[] symbols = "0 1 2 3 4 5 6 7 8 9 OM .a | ||".split(" ");

    public static String[] candra = ".c".split(" ");

    public static String[] zwj = "".split(" ");

    public static String[] skip = "_".split(" ");

    public static String[] accent = "\\' \\_".split(" ");

    public static String[] comboAccent = "\\'H \\_H \\'M \\_M".split(" ");

    public static String[] other = "q K G z .D .Dh f Y R".split(" ");
}

import transliteration.TransliterationEngine;

/**
 * Created by kosh on 3/13/14.
 */
public class TransliterateApp {
    public static void main(String[] args)
    {
        TransliterationEngine engine = new TransliterationEngine();
        String result = engine.transliterate("priyanka chopra");
        System.out.println(result);
    }
}

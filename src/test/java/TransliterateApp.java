import transliteration.TransliterationEngine;

/**
 * Created by kosh on 3/13/14.
 */
public class TransliterateApp {
    public static void main(String[] args)
    {

        TransliterationEngine engine = new TransliterationEngine();
        String result = engine.transliterate("gaurang", "english", "hindi");
        System.out.println(result);


        /*
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");
        File fscript = new File("/home/kosh/dev/sanscript.js-master/sanscript/sanscript.js");
        Reader reader = null;
        try {
            reader = new FileReader(fscript);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            engine.eval(reader);
        } catch (ScriptException e) {
            e.printStackTrace();
        }

        Invocable iEngine = (Invocable) engine;
        Object sanscript = engine.get("Sanscript");
        Object result = null;
        try {
            result = iEngine.invokeMethod(sanscript, "transliterateRoman", "itrans", "devanagiri");
            // result = iEngine.invokeFunction("Sanscript.t", "itrans", "devanagiri");
        } catch (ScriptException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        System.out.println(result.toString());
        */
    }
}

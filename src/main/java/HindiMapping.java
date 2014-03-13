/**
 * Created by kosh on 3/13/14.
 */
public class HindiMapping {
    public static String[] vowels = "अ आ इ ई उ ऊ ऋ ॠ ऌ ॡ ऎ ए ऐ ऒ ओ औ".split(" ");

    public static String[] vowelMarks = "ा ि ी ु ू ृ ॄ ॢ ॣ ॆ े ै ॊ ो ौ'".split(" ");

    public static String[] otherMarks = "ं ः ँ".split(" ");

    public static String[] virama = "्".split(" ");

    public static String[] consonants = "क ख ग घ ङ च छ ज झ ञ ट ठ ड ढ ण त थ द ध न प फ ब भ म य र ल व श ष स ह ळ क्ष ज्ञ".split(" ");

    public static String[] symbols = "० १ २ ३ ४ ५ ६ ७ ८ ९ ॐ ऽ । ॥".split(" ");

    public static String[] zwj = new String[] { "\u200D" };

    public static String[] skip = "".split(" ");

    public static String[] accent = new String[] { "\u0951", "\u0952"};

    public static String[] comboAccent = "ः॑ ः॒ ं॑ ं॒".split(" ");

    public static String[] candra = "ॅ".split(" ");

    public static String[] other = "क़ ख़ ग़ ज़ ड़ ढ़ फ़ य़ ऱ".split(" ");
}

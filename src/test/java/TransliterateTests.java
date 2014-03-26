import org.junit.Test;
import transliteration.TransliterationEngine;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by kosh on 3/13/14.
 */
public class TransliterateTests {
    TransliterationEngine engine = new TransliterationEngine();

    @Test
    public void NotNullNameTest()
    {
        String result = engine.transliterate("asha sen");
        assertNotNull(result);
        assertEquals("अशा सेन", result);
    }

    @Test
    public void CaseInsensitiveNameTest() {
        String result1 = engine.transliterate("asha sen");
        String result2 = engine.transliterate("ASha SEN");
        assertNotNull(result1);
        assertNotNull(result2);
        assertEquals(result1, result2);
        assertEquals("अशा सेन", result1);
    }

    @Test
    public void SpaceNameTest() {
        String result = engine.transliterate("asha sen");
        assertEquals(2, result.split(" ").length);
    }

    @Test
    public void SpaceNameTest2() {
        String result = engine.transliterate("franklin huster");
        System.out.println(result);
        //assertEquals(2, result.split(" ").length);
    }
}

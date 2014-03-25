import junit.framework.Assert;
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
        Assert.assertNotNull(result);
    }

    @Test
    public void CaseInsensitiveNameTest() {
        String result1 = engine.transliterate("asha");
        String result2 = engine.transliterate("ASha");
        Assert.assertNotNull(result1);
        assertNotNull(result2);
        Assert.assertEquals(result1, result2);
    }

    @Test
    public void SpaceNameTest() {
        String result = engine.transliterate("asha sen");
        assertEquals(2, result.split(" ").length);
    }
}

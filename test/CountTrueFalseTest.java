import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CountTrueFalseTest {
    CountTrueFalse ctf;
    @Before
    public void setUp() throws Exception {
        ctf = new CountTrueFalse();
    }

    @After
    public void tearDown() throws Exception {
        ctf =null;
    }

    @Test
    public void countTrueFalse() {
        //Arrange
        String[] str = {"a","b","c","d","a","c","c"};
        Map<String,Boolean> expectedValue = new HashMap<String,Boolean>();
        expectedValue.put("a",true);
        expectedValue.put("b",false);
        expectedValue.put("c",true);
        expectedValue.put("d",false);
        //Act
        Map<String,Boolean> actualValue= ctf.countTrueFalse(str);
        //Assert
        assertNotNull(actualValue);
        assertEquals(expectedValue, actualValue);
    }
}
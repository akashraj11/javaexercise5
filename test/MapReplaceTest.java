import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MapReplaceTest {
    MapReplace mp;
    @Before
    public void setUp() throws Exception {
        mp = new MapReplace();
    }

    @After
    public void tearDown() throws Exception {
        mp=null;
    }

    @Test
    public void MapReplace() {
        //Arrange
        Map<String,Object> str = new HashMap<String,Object>();
        str.put("val1", "java");
        str.put("val2", "c++");
        Map<String,Object> expectedValue = new HashMap<String,Object>();
        expectedValue.put("val1", " ");
        expectedValue.put("val2", "java");
        //Act
        Map<String,Object> actualValue= mp.mapReplace(str);
        //Assert
        assertNotNull(actualValue);
        assertEquals(expectedValue, actualValue);
    }
}
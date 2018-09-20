import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.*;

import static org.junit.Assert.*;

public class CountStringOccuranceTest {
    CountStringOccurance countString;

    @Before
    public void setUp() throws Exception {
        countString = new CountStringOccurance();
    }

    @After
    public void tearDown() throws Exception {
        countString = null;
    }

    @Test
    public void countStringOccurance() {
        //Arrange
        String str = "one one -one___two,,three,one @three*one?two ";
        Map<String,Integer> expectedValue = new HashMap<String,Integer>();
        expectedValue.put("one",5);
        expectedValue.put("two",2);
        expectedValue.put("three",2);
        //Act
        Map<String,Integer> actualValue= countString.countStringOccurance(str);
        //Assert
        assertNotNull(actualValue);
        assertEquals(expectedValue, actualValue);
    }
}
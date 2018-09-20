import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SortNamesTest {
    SortNames st;
    @Before
    public void setUp() throws Exception {
        st = new SortNames();
    }

    @After
    public void tearDown() throws Exception {
        st = null;
    }

    @Test
    public void sortNames() {
        //Arrange
        ArrayList<String> input = new ArrayList<String>();
        input.add("Harry");
        input.add("Olive");
        input.add("Alice");
        input.add("Bluto");
        input.add("Eugene");
        ArrayList<String> expectedValue = new ArrayList<String>();
        expectedValue.add("Alice");
        expectedValue.add("Bluto");
        expectedValue.add("Eugene");
        expectedValue.add("Harry");
        expectedValue.add("Olive");
        //Act
        ArrayList<String> actualValue= st.sortNames(input);
        //Assert
        assertNotNull(actualValue);
        assertEquals(expectedValue, actualValue);
    }
}
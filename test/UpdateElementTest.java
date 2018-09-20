import static java.util.Arrays.asList;
import java.util.ArrayList;


import static org.junit.Assert.*;

public class UpdateElementTest {
    UpdateElement uE;
    @org.junit.Before
    public void setUp() throws Exception {
        uE =new UpdateElement();
    }

    @org.junit.After
    public void tearDown() throws Exception {

        uE = null;
    }

    @org.junit.Test
    public void updateElement() {
        //Arrange
        ArrayList<String> input = new ArrayList<String>();
        input.add("Apple");
        input.add("Grape");
        input.add("Melon");
        input.add("Berry");
        ArrayList<String> expectedValue = new ArrayList<String>();
        expectedValue.add("Kiwi");
        expectedValue.add("Grape");
        expectedValue.add("Melon");
        expectedValue.add("Berry");
        //Act
        ArrayList<String> actualValue= uE.updateElement(input);
        //Assert
        assertNotNull(actualValue);
        assertEquals(expectedValue, actualValue);
        System.out.println("Array list after removing elements:" );
        actualValue.clear();
        System.out.println(actualValue);
    }
}
import org.example.people.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTests
{
    @Test
    public void constructorTest()
    {
        Person testMe = new Person("Joe", "Smith");

        assertAll(
            () -> assertEquals("Joe", testMe.getFirst()),
            () -> assertEquals("Smith", testMe.getLast()),
            () -> assertNull(testMe.getTitle())
        );
    }

    /*@Test
    public void failTest()
    {
        fail();
    }*/
}

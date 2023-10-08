import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    @Test
    public void testConstructorAndGetters() {
        Person person = new Person("John", "Doe");
        assertEquals("John", person.getFirstName());
        assertEquals("Doe", person.getLastName());
    }

    @Test
    public void testEquals() {
        Person person1 = new Person("John", "Doe");
        Person person2 = new Person("John", "Doe");
        assertTrue(person1.equals(person2));

        Person person3 = new Person("Jane", "Doe");
        assertFalse(person1.equals(person3));

        Person person4 = new Person("John", "Smith");
        assertFalse(person1.equals(person4));

        assertFalse(person1.equals("John Doe"));

        Person person5 = new Person(null, null);
        Person person6 = new Person(null, null);
        assertTrue(person5.equals(person6));

        assertFalse(person1.equals(person5));
    }

    @Test
    public void testEqualsWithNulls() {
        Person person1 = new Person(null, null);
        Person person2 = new Person(null, null);
        assertTrue(person1.equals(person2));

        Person person3 = new Person(null, "Doe");
        assertFalse(person1.equals(person3));

        Person person4 = new Person("John", null);
        assertFalse(person1.equals(person4));
    }

    @Test
    public void testEqualsWithBothNull() {
        Person person1 = new Person(null, null);
        Person person2 = new Person(null, null);
        assertTrue(person1.equals(person2));

        assertTrue(person1.equals(person1));
    }

    @Test
    public void testEqualsSameObject() {
        Person person1 = new Person("John", "Doe");
        assertTrue(person1.equals(person1));
    }

    @Test
    public void testEqualsDifferentClass() {
        Person person1 = new Person("John", "Doe");
        assertFalse(person1.equals(new Object()));
    }
}

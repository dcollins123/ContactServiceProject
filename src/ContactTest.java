import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactTest {
    @Test
    public void testContactConstructor() {
        Contact contact = new Contact("1", "John", "Doe", "1234567890", "123 Elm St");
        assertNotNull(contact);
    }

    @Test
    public void testContactSetters() {
        Contact contact = new Contact("1", "John", "Doe", "1234567890", "123 Elm St");
        contact.setFirstName("Jane");
        assertEquals("Jane", contact.getFirstName());
        assertThrows(IllegalArgumentException.class, () -> contact.setPhone("123"));
    }
}

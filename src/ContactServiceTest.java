import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {
    private ContactService service;
    private Contact contact;

    @BeforeEach
    public void setUp() {
        service = new ContactService();
        contact = new Contact("1", "John", "Doe", "1234567890", "123 Elm St");
        service.addContact(contact);
    }

    @Test
    public void testAddContact() {
        assertTrue(service.addContact(new Contact("2", "Jane", "Smith", "0987654321", "456 Oak St")));
        assertFalse(service.addContact(contact));  // Attempt to add the same contact again
    }

    @Test
    public void testDeleteContact() {
        assertTrue(service.deleteContact("1"));
        assertFalse(service.deleteContact("1"));  // Attempt to delete the same contact again
    }

    @Test
    public void testUpdateContact() {
        assertTrue(service.updateContact("1", "Johnny", "Dough", "0123456789", "789 Pine St"));
        assertFalse(service.updateContact("2", "Jane", "Doe", "1234567890", "123 Elm St"));  // Non-existent contact
    }
}

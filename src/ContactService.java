import java.util.HashMap;
import java.util.Map;

public class ContactService {
    private Map<String, Contact> contacts = new HashMap<>();

    public boolean addContact(Contact contact) {
        if (contact == null || contacts.containsKey(contact.getContactId())) {
            return false;
        }
        contacts.put(contact.getContactId(), contact);
        return true;
    }

    public boolean deleteContact(String contactId) {
        if (contactId == null || !contacts.containsKey(contactId)) {
            return false;
        }
        contacts.remove(contactId);
        return true;
    }

    public boolean updateContact(String contactId, String firstName, String lastName, String phone, String address) {
        Contact contact = contacts.get(contactId);
        if (contact == null) {
            return false;
        }
        if (firstName != null && !firstName.isEmpty()) {
            contact.setFirstName(firstName);
        }
        if (lastName != null && !lastName.isEmpty()) {
            contact.setLastName(lastName);
        }
        if (phone != null && !phone.isEmpty()) {
            contact.setPhone(phone);
        }
        if (address != null && !address.isEmpty()) {
            contact.setAddress(address);
        }
        return true;
    }
}

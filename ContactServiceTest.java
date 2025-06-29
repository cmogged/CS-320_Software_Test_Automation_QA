import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContactServiceTest
{
    @Test
    void testServiceClassAddUniqueContact() {
        ContactService service = new ContactService();
        Contact c1 = new Contact("1", "Bob", "Harlie", "2837485954", "345 eight street");
        Assertions.assertTrue(service.addContact(c1));
        Assertions.assertTrue(c1.getId().equals("1"));
        Assertions.assertTrue(c1.getfirstName().equals("Bob"));
        Assertions.assertTrue(c1.getlastName().equals("Harlie"));
        Assertions.assertTrue(c1.getphoneNumber().equals("2837485954"));
        Assertions.assertTrue(c1.getaddress().equals("345 eight street"));
        
        // check that the id has to be unique
        Contact c2 = new Contact("1", "John", "Peterson", "2837483333", "153 nowheresville ave");
        Assertions.assertFalse(service.addContact(c2));
    }
    
    @Test
    void testServiceClassDeleteContact() {
        ContactService service = new ContactService();
        Contact c = new Contact("1", "Bob", "Harlie", "2837485954", "345 eight street");
        Assertions.assertTrue(service.addContact(c));
        Assertions.assertTrue(service.deleteContact("1"));
    }
    
    @Test
    void testServiceClassUpdateContact() {
        ContactService service = new ContactService();
        Contact c = new Contact("1", "Bob", "Harlie", "2837485954", "345 eight street");
        Assertions.assertTrue(service.addContact(c));
        Assertions.assertTrue(service.updateFirstName("1", "John"));
        Assertions.assertTrue(service.updateLastName("1", "Peterson"));
        Assertions.assertTrue(service.updatePhoneNumber("1", "2837483333"));
        Assertions.assertTrue(service.updateAddress("1", "153 nowheresville ave"));
        
        Assertions.assertTrue(c.getfirstName().equals("John"));
        Assertions.assertTrue(c.getlastName().equals("Peterson"));
        Assertions.assertTrue(c.getphoneNumber().equals("2837483333"));
        Assertions.assertTrue(c.getaddress().equals("153 nowheresville ave"));
    }
}


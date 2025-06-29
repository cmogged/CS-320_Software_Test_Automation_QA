import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContactTest
{
    @Test
    void testContactClassIdTooLong() {
        Assertions.assertThrows(IllegalArgumentException.class, ()-> {
            new Contact("12345678901", "Bob", "Harlie", "2837485954", "345 eight street");
        });
    }
    
    @Test
    void testContactClassIdIsNull() {
        Assertions.assertThrows(IllegalArgumentException.class, ()-> {
            new Contact(null, "Bob", "Harlie", "2837485954", "345 eight street");
        });
    }
    
    @Test
    void testContactClassFirstNameTooLong() {
        Assertions.assertThrows(IllegalArgumentException.class, ()-> {
            new Contact("1", "Bobabcdefgh", "Harlie", "2837485954", "345 eight street");
        });
    }
    
    @Test
    void testContactClassFirstNameIsNull() {
        Assertions.assertThrows(IllegalArgumentException.class, ()-> {
            new Contact("1", null, "Harlie", "2837485954", "345 eight street");
        });
    }
    
    @Test
    void testContactClassLastNameTooLong() {
        Assertions.assertThrows(IllegalArgumentException.class, ()-> {
            new Contact("1", "Bob", "Harlieabcde", "2837485954", "345 eight street");
        });
    }
    
    @Test
    void testContactClassLastNameIsNull() {
        Assertions.assertThrows(IllegalArgumentException.class, ()-> {
            new Contact("1", "Bob", null, "2837485954", "345 eight street");
        });
    }
    
    @Test
    void testContactClassPhoneNumberIsNot10() {
        Assertions.assertThrows(IllegalArgumentException.class, ()-> {
            new Contact("1", "Bob", "Harlie", "283", "345 eight street");
        });
    }
    
    @Test
    void testContactClassPhoneNumberIsNull() {
        Assertions.assertThrows(IllegalArgumentException.class, ()-> {
            new Contact("1", "Bob", "Harlie", null, "345 eight street");
        });
    }
    
    @Test
    void testContactClassAddressTooLong() {
        Assertions.assertThrows(IllegalArgumentException.class, ()-> {
            new Contact("1", "Bob", "Harlie", "2837485954", "345 eight street somewhere far far away");
        });
    }
    
    @Test
    void testContactClassAddressIsNull() {
        Assertions.assertThrows(IllegalArgumentException.class, ()-> {
            new Contact("1", "Bob", "Harlie", "2837485954", null);
        });
    }
}


import java.util.ArrayList;

public class ContactService {
    private ArrayList<Contact> list = new ArrayList<Contact>();

    // add a contact if the ID is unique
    public boolean addContact(Contact contact) {
        boolean didAdd = false;

        // if the list is empty
        if (list.size() == 0) {
            list.add(contact);
            didAdd = true;
        }
        else {
            // check if ID is unique
            boolean isUnique = true;
            for (Contact c : list) {
                if (contact.getId().equalsIgnoreCase(c.getId())) {
                    isUnique = false; // ID is not unique
                    break;
                }
            }
            if (isUnique) {
                list.add(contact);
                didAdd = true;
            }
        }
        return didAdd;
    }
    
    // delete a contact if found
    public boolean deleteContact(String id) {
        int i;
        boolean didDelete = false;
        
        // search for ID
        for (i=0; i < list.size(); i++) {
            if (list.get(i).getId().equalsIgnoreCase(id)) {
                list.remove(i);
                didDelete = true; // ID deleted
                break;
            }
        }
        return didDelete;
    }
    
    // update the first name if the ID is found
    public boolean updateFirstName(String id, String name) {
        int i;
        boolean didUpdate = false;
        
        // search for ID
        for (Contact c : list) {
            if (c.getId().equalsIgnoreCase(id)) {
                c.setfirstName(name);
                didUpdate = true; // name updated
                break;
            }
        }
        return didUpdate;
    }
    
    // update the last name if the ID is found
    public boolean updateLastName(String id, String name) {
        int i;
        boolean didUpdate = false;
        
        // search for ID
        for (Contact c : list) {
            if (c.getId().equalsIgnoreCase(id)) {
                c.setlastName(name);
                didUpdate = true; // name updated
                break;
            }
        }
        return didUpdate;
    }
    
    // update the phone number if the ID is found
    public boolean updatePhoneNumber(String id, String number) {
        int i;
        boolean didUpdate = false;
        
        // search for ID
        for (Contact c : list) {
            if (c.getId().equalsIgnoreCase(id)) {
                c.setphoneNumber(number);
                didUpdate = true; // number updated
                break;
            }
        }
        return didUpdate;
    }
    // update the  if the ID is found
    public boolean updateAddress(String id, String address) {
        int i;
        boolean didUpdate = false;
        
        // search for ID
        for (Contact c : list) {
            if (c.getId().equalsIgnoreCase(id)) {
                c.setaddress(address);
                didUpdate = true; // address updated
                break;
            }
        }
        return didUpdate;
    }
}

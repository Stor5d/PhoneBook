import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<Contact>> map = new HashMap<>();

    public void insertGroup(String nameGroup) {
        List<Contact> group = new ArrayList<>();
        map.put(nameGroup, group);
    }

    public void addContactToGroup(String nameGroup, Contact contact) {
        map.get(nameGroup).add(contact);
    }

    public int groupsCount() {
        return map.size();
    }

    public List<Contact> group(String nameGroup) {
        return map.get(nameGroup);
    }

    public Contact findContact(String phoneNumber) {
        for (List<Contact> list : map.values()){
            for (Contact contact : list){
                if (phoneNumber.equals(contact.getPhoneNumber())){
                    return contact;
                }
            }
        }
        return null;
    }
}

public class Main {

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Contact contact1 = new Contact("Сергей", "89998887766");
        Contact contact2 = new Contact("Алеша", "89107771046");
        Contact contact3 = new Contact("Жена", "89007000126");
        Contact contact4 = new Contact("Брат", "89537071212");
        Contact contact5 = new Contact("Сергей сантехник", "89537001010");
        phoneBook.insertGroup("Работа");
        phoneBook.insertGroup("Семья");
        phoneBook.addContactToGroup("Работа", contact1);
        phoneBook.addContactToGroup("Работа", contact5);
        phoneBook.addContactToGroup("Семья", contact3);
        phoneBook.addContactToGroup("Семья", contact4);
        phoneBook.addContactToGroup("Работа", contact4);
        phoneBook.addContactToGroup("Работа", contact2);
        System.out.println("Кол-во групп: " + phoneBook.groupsCount());
        System.out.println("Поиск группы Семья:");
        System.out.println(phoneBook.group("Семья"));
        System.out.println("Поиск группы Работа:");
        System.out.println(phoneBook.group("Работа"));
        System.out.println("Искомый контакт (перебором): " + phoneBook.findContact("89537071212"));
    }
}

import java.util.*;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address book Program !");
        ContactPerson person = new ContactPerson();
        List<ContactPerson> contact = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Address Book Menu");
        System.out.println("1. Add New Person address");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice){
            case 1:
                System.out.println("First name");
                person.setFirst_name(sc.nextLine());
                System.out.println("Last Name");
                person.setLast_name(sc.nextLine());
                System.out.println("Address");
                person.setAddress(sc.nextLine());
                System.out.println("City");
                person.setCity(sc.nextLine());
                System.out.println("State");
                person.setState(sc.nextLine());
                System.out.println("Zip");
                person.setZip(Integer.parseInt(sc.nextLine()));
                System.out.println("PhoneNo");
                person.setPhone_number((sc.nextLong()));
                System.out.println("Email");
                person.setEmail(sc.nextLine());

                contact.add(new ContactPerson(person.getFirst_name(), person.getLast_name(), person.getAddress(), person.getCity(),
                        person.getState(), person.getZip(), person.getPhone_number(), person.getEmail()));
                System.out.println(contact);
                System.out.println("New address added to the book successfully !");
                break;
            default:
                System.out.println("Please enter valid choice ");
                break;
        }

    }
}

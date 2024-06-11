package contact;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
        ContactsManager myContactsManager = new ContactsManager();

        Contact contact1 = new Contact();
        contact1.name = "Alice";
        contact1.phoneNumber = "0747325719";
        myContactsManager.addContact(contact1);

        Contact contact2 = new Contact();
        contact2.name = "Bob";
        contact2.phoneNumber = "0142974860";
        myContactsManager.addContact(contact2);

        Contact contact3 = new Contact();
        contact3.name = "Charlie";
        contact3.phoneNumber = "0505679218";
        myContactsManager.addContact(contact3);

        Contact contact4 = new Contact();
        contact4.name = "David";
        contact4.phoneNumber = "0764923041";
        myContactsManager.addContact(contact4);

        Contact contact5 = new Contact();
        contact5.name = "Eve";
        contact5.phoneNumber = "0587921630";
        myContactsManager.addContact(contact5);
        
        System.out.println("Entrer le nom du du contact rechercher : ");
        String nomContactRechercher = scanner.nextLine();
        
        Contact searchResult = myContactsManager.searchContact(nomContactRechercher);
        if (searchResult != null) {
            System.out.println("Le numéro de téléphone de "+nomContactRechercher+"  est : " + searchResult.phoneNumber);
        } else {
            System.out.println("Contact non trouvé.");
        }
    }

}

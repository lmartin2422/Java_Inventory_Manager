package CMIS242;

import java.util.Scanner;

public class RunInventory {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        do {  // do while loop for menu
            menu();
            selectMenu(inventory);
        } while (true);

    }

    public static void menu () {
        System.out.println("\nMenu Selection:");
        System.out.println("1. Add Book");
        System.out.println("2. Remove Book ");
        System.out.println("3. Find Book");
        System.out.println("4. Display Book");
        System.out.println("9. Exit Program");
    }

    public static void selectMenu (Inventory inventory) {
        Scanner scanRun = new Scanner(System.in);


        System.out.println("Enter a selection number: ");
        int selection = scanRun.nextInt();


        switch (selection) {
            case 1:
                inventory.add();
                break;
            case 2:
                inventory.remove();
                break;
            case 3:
                inventory.find();
                break;
            case 4:
                inventory.display();
                break;
            case 9:
                System.out.println("\nThank you for using the program. Goodbye!");
                break;
            default: System.out.println("Invalid choice");
        }

    }

}

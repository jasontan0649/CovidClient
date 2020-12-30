import java.util.Scanner;

public class ShopMenu {
    public static void main() {
        Shop s = login();
        System.out.println("You are login as " + s.getName());
        System.out.println("Your current status is " + s.getStatus());

        System.out.println("Press 1 to continue");
        Input.inputRange(1,1);
    }

    public static Shop login() {
        String name, password;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter shop name ");
            name = input.nextLine();
            //System.out.println("Please enter password ");
            // password = input.nextLine();
            Shop s = Shop.getShopByName(name);
            if (s == null) {
                System.out.println("No Shop found. Please try again");
                continue;
            }
            //if (c.getPassword().equals(password))
            return s;
            }
           // System.out.println("Wrong password. \nPlease try again");
        }

}

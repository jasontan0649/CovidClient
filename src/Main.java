public class Main {

    public static void main(String[] args) {
        Initializer.init();
        while (true) {
            System.out.println("Welcome to CovidTracker  \n");
            System.out.println("Please select your role.");
            System.out.println("1. Customer");
            System.out.println("2. Shop");
            System.out.println("3. Exit");
            int choice = Input.inputRange(1,3);
            switch (choice) {
                case 1 : CustMenu.landing(); break;
                case 2 : ShopMenu.main(); break;
                case 3 : return;
            }
        }
    }


}

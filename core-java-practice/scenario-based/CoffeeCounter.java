import java.util.Scanner;

public class CoffeeCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String coffee = sc.nextLine();

            if (coffee.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            int price = 0;

            switch (coffee.toLowerCase()) {
                case "espresso":
                    price = 120;
                    break;
                case "latte":
                    price = 150;
                    break;
                case "cappuccino":
                    price = 180;
                    break;
                default:
                    System.out.println("Invalid coffee type!");
                    continue;
            }

            double total = price * quantity;
            double gst = total * 0.18;
            double finalBill = total + gst;

            System.out.println("Total Bill = " + total);
            System.out.println("GST = " + gst);
            System.out.println("Final Bill = " + finalBill);
        }
    }
}
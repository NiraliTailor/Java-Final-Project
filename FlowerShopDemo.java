import java.util.Scanner;

public class FlowerShopDemo {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user for flowers
        System.out.println("Enter details for the flowers you would like in the bouquet:");

        Flowers f = new Flowers();  // Polymorphism

        System.out.print("Name of flower: ");
        f.setFlowerName(scanner.nextLine());
        System.out.print("Color of flower: ");
        f.setFlowerColor(scanner.nextLine());
        System.out.print("Your Budget: ");
        f.setFlowerPrice(scanner.nextDouble());
        System.out.print("Number of flowers in the bouquet: ");
        f.setFlowerQuantity(scanner.nextInt());

        // Display Flower details
        System.out.println("\nDetails of the Flower:");
        System.out.println(f.toString());

        Bouquet b = new Bouquet();  // Polymorphism

        System.out.print("\n\nWhat shape would you like for the bouquet (Options: Heart Shape / Christmas tree shape / Circular shape / Diamond Shape): ");
        scanner.nextLine();  // Consume the newline character
        b.setPattern(scanner.nextLine());

        // Set Flowers as part of Bouquet using aggregation
        b.setFlower(f);

        b.sell();
        b.arrange();

        // Accessing static member and method from the Bouquet class
        System.out.println("\nTotal bouquets sold: " + Bouquet.getTotalBouquetsSold());
        
        // Displaying Bouquet details
        System.out.println(b.toString());

    }
}
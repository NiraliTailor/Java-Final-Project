// Subclass representing a bouquet of flowers

public class Bouquet extends Flowers implements FlowerArrangement 

{   
   //data member of subclass
    private String pattern;

    // Constructor
    public Bouquet() 
    {
        super();
    }

    // Mutator for additional data member
    public void setPattern(String pattern) 
    {
        this.pattern = pattern;
    }

    // Accessor for additional data member
    public String getPattern()
    {
        return pattern;
    }

    // Method overriding from the interface
    public void arrange() 
    {
        System.out.println("\nBouquet is being arranged with custom selected pattern...");
    }

    // Method overriding from the interface
    public void sell() 
    {
        System.out.println("\nYour bouquet request is being processed...");
        // Incrementing the total bouquets sold using the static method
        incrementTotalBouquetsSold();
    }

    // Method overloading from line 31 of this code
    public void arrange(String customArrangement) {
        System.out.println("Bouquet is being arranged with custom arrangement: " + customArrangement);
    }

    // Aggregation: Flower as a part of Bouquet
    private Flowers flower;

    // Setter for aggregation
    public void setFlower(Flowers flower) 
    {
        this.flower = flower;
    }

    // Getter for aggregation
    public Flowers getFlower() 
    {
        return flower;
    }

    // Static member
    private static int totalBouquetsSold;

    // Static method to increment total bouquets sold
    public static void incrementTotalBouquetsSold() 
    {
        totalBouquetsSold++;
    }

    // Static method to get total bouquets sold
    public static int getTotalBouquetsSold() 
    {
        return totalBouquetsSold;
    }
    
     public String toString() 
{
      return"\nYou now have a bouquet of shape " + getPattern() +
            " with flower type " + getFlower().getFlowerName() +
            " that has " + getFlower().getFlowerQuantity() + " number of flowers." + "\nThank You :)";
}

}
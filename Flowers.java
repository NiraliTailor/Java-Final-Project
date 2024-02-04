
public class Flowers
{  //data members
   private String FlowerName;
   private String FlowerColor;
   private double FlowerPrice;
   private int FlowerQuantity;

   
   //mutators
   public void setFlowerName(String FlowerName)
   {
      this.FlowerName=FlowerName;
   }
   public void setFlowerColor(String FlowerColor)
   {
      this.FlowerColor=FlowerColor;
   }
   public void setFlowerPrice(double FlowerPrice)
   {
      this.FlowerPrice=FlowerPrice;
   }
   public void setFlowerQuantity(int FlowerQuantity)
   {
      this.FlowerQuantity=FlowerQuantity;
   }
   
   //accessors
   public String getFlowerName()
   {
      return FlowerName;
   }
   public String getFlowerColor()
   {
      return FlowerColor;
   }
   public double getFlowerPrice()
   {
      return FlowerPrice;
   }
   public int getFlowerQuantity()
   {
      return FlowerQuantity;
   }
   
   //toString method
   public String toString()
   {
      return "\nName of the Flower is:"+ getFlowerName() + "\nThe Color is:"+ getFlowerColor() + "\nThe Bugdet is:"+ getFlowerPrice() + "\nThe Quantity is:"+ getFlowerQuantity();
   }   
   
    
}
  
      
          
    

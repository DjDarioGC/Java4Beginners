public class Shoes
{
   //Instance attributes//
   private int size;
   private String color;

   public static void main(String[] args)
   {
      //I have brown moccasins size 31
      Shoes moccasins = new Shoes();
      moccasins.color = "brown";
      moccasins.size = 31;

      Shoes blackboots = new Shoes();
      blackboots.color = "black";
      blackboots.size = 32;

      System.out.println("I have moccasins size " + moccasins.size);
      System.out.println("I also have " + blackboots.color + " boots.");
   }
}
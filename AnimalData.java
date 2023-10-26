import java.util.Scanner;

public class AnimalData { 
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Animal animal = new Animal();
      String inputSpecies;
      String inputColor;
   
      inputSpecies = scnr.next();
      inputColor = scnr.next();
   
      /* Your code goes here */
      animal.setSpecies(inputSpecies);
      animal.setColor(inputColor);
      
 
      System.out.print("The " + animal.getSpecies());
      System.out.println("'s color is " + animal.getColor());
   }
}
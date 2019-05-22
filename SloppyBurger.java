

package sloppyburger;
import java.math.*;
import java.util.*;


public class SloppyBurger {

 
    

    public static void main(String[] args) {
        System.out.println("\t\t^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("\t\t\tWELCOME TO SLOPPY BURGER!!! \n\t\t\tCan I take your order!?");
        System.out.println("\t\t^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
       
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("$   NUMBER 1: BIG SLOPPY            |    NUMBER 3: THE BADLAND BURRITO   $");
        System.out.println("$________________________________   |  __________________________________$");
        System.out.println("$(Tomato, lettuce, onion, pickles,  |  (Salsa, beans, tomato, rice,      $");
        System.out.println("$ cheese, bacon, ketchup, mustard,  |   guacamole, lettuce, and          $");
        System.out.println("$ mayo, and secret sauce!)          |   choice of hot sauce!)            $");
        System.out.println("$  NUMBER 2: LE SANDWICH DE CHICKEN |                                    $");
        System.out.println("$________________________________   |                                    $");
        System.out.println("$(Tomato, Pickle, Mayo, and Mustard)|                                    $");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
  Scanner clerk = new Scanner(System.in); int order_number = clerk.nextInt();
  
 
  
//   HashMap<String, Double> order = new HashMap <String, Double>();
//   order.put("Big Sloppy", 13.27);
//   order.put("Le Sandwich de Chicken", 11.99);
//   order.put("Badland Burrito", 12.99);
//   
//   HashMap<String, Double> burger = new HashMap <String, Double>();
//   burger.put("lettuce", .10);
//   burger.put("tomato", .50);
//   burger.put("onion", .10);
//   burger.put("ketchup", .10);
//   burger.put("mustard", .10);
//   burger.put("mayo", .10);
//   burger.put("pickels", .25);
//   
//   HashMap<String, Double> sandwich = new HashMap<String, Double>();
//   sandwich.put("lettuce", .10);
//   sandwich.put("tomato", .50);
//   sandwich.put("mayo", .10);
//   sandwich.put("mustard", .10);
//   
//   HashMap<String, Double> burrito = new HashMap<String,Double>();
//   burrito.put("rice", .50);
//   burrito.put("beans", .50);
//   burrito.put("salsa", .25);
//   burrito.put("gucamole", .25);
//   burrito.put("Hot sauce",.10);
           
 ArrayList<String> burger = new ArrayList<String>();
 burger.add("Bacon");
         burger.add("Cheese");
                 burger.add("Tomato");
                         burger.add("Lettuce");
                                 burger.add("Onion");
                                         burger.add("Pickles");
                                                 burger.add("Ketchup");
                                                         burger.add("Mustard");
                                                                 burger.add("Mayo");
                                                                         burger.add("Secret Sauce");
 ArrayList<String> sandwich = new ArrayList<String>();
 sandwich.add("Tomato");
 sandwich.add("Pickle");
 sandwich.add("Mayo");
 sandwich.add("Mustard");
 ArrayList<String> burrito = new ArrayList<String>();
 burrito.add("Tomato");
 burrito.add("Lettuce");
 burrito.add("Rice");
 burrito.add("Beans");
 burrito.add("Salsa");
 burrito.add("Guacamole");
 burrito.add("Hot Sauce");
 
 ArrayList<String> Order = new ArrayList<String>();
 Order.contains(burger);
Order.contains(sandwich);
Order.contains(burrito);


 
 
 
 
 
 
//         Order.add(burger);
//         Order.add(sandwich);
//         Order.add(burrito);
 
   switch(order_number) {
    
        case 1 : System.out.println(burger);
        break;
        case 2 : System.out.println(sandwich);
        break;
        case 3 : System.out.println(burrito);
        break;
    }
   
    
}
}
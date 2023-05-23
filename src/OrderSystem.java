/**
 * Allows user to order 1 of 3 beverages, asks them whether they would like to
 * close the tab, and returns a tab of past orders.
 * @author Stella Wong
 */

import java.util.Scanner;
public class OrderSystem {
    private final static int numOrders = 20;
    private final static int numMenu = 3;
    private final static String[] menuItems = {"Coffee", "Tea", "Juice"};

    private final static int caloriesCoffee = 50;
    private final static int caloriesTea = 10;
    private final static int caloriesJuice = 100;

    private static Scanner in = new Scanner (System.in);

    public static void main(String[] args){
        Beverage[][] order = new Beverage[numOrders][numMenu];
        int[][] calories = new int[numOrders][numMenu];
        int currentOrder = 0;
        boolean closeTab = false;

        while(!closeTab && (currentOrder<numOrders)){
            System.out.println("This is our menu:");
            for (int i = 0; i<numMenu; i++){
                System.out.println((i+1)+ "." + menuItems[i]);
            }

            System.out.print("What would you like to order? Type 1 for coffee, 2 for tea, 3 for juice:");
                int choice = in.nextInt();
                /**Based on the order number (1 for coffee, 2 for tea, 3 for juice, the switch statement will
                 * store an object of type Beverage into a 2D array, and print out the
                 * beverage ordered.
                 * */
                switch (choice){
                    case 1:
                        order[currentOrder][0] = new Coffee();
                        calories[currentOrder][0] = caloriesCoffee;
                        System.out.println("You ordered coffee");
                        break;
                    case 2:
                        order[currentOrder][1] = new Tea();
                        calories[currentOrder][1] = caloriesTea;
                        System.out.println("You ordered tea");
                        break;
                    case 3:
                        order[currentOrder][2] = new Juice();
                        calories[currentOrder][2] = caloriesJuice;
                        System.out.println("You ordered juice");
                        break;
                    /**will return an error if value is not between 1-3 inclusive*/
                    default:
                        System.out.print("Must give an input of 1,2,or 3!");
                        continue;
                }
                System.out.println("Do you want to close your tab? Say Y for yes, N for no:");
                String closeTabChoice = in.next();
                if (closeTabChoice.equals("Y")){
                    closeTab = true;
                }
                currentOrder++;
            }
            PastOrders(order, calories, currentOrder);
        }


        /** the PastOrders method prints out all previous orders
         * along with the calories of each order. It does not print any null values
         * that may be stored in the Beverage 2D array
         */
        static void PastOrders(Beverage[][] order, int[][] calories, int numOrders){
            System.out.println("Past Orders:");
            for(int i = 0; i<numOrders; i++){
                System.out.println("Order "+(i+1) + ":");
                for(int j = 0; j<numMenu; j++){
                    if(order[i][j] != null){
                        System.out.println(menuItems[j] + ", Calories:" + calories[i][j]);
                    }
                }
            }
        }
    }




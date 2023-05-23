public class Juice implements Beverage{
    public static final int Calories = 100;

    @Override
    public void order(){
        System.out.println("You ordered coffee.");
    }

    @Override
    public int getCalories(){
        return Calories;
    }
}

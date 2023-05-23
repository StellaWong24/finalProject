public class Coffee implements Beverage{
    public static final int Calories = 50;

    @Override
    public void order(){
        System.out.println("You ordered coffee.");
    }

    @Override
    public int getCalories(){
        return Calories;
    }
}

public class Tea implements Beverage{
    public static final int Calories = 10;

    @Override
    public void order(){
        System.out.println("You ordered tea.");
    }

    @Override
    public int getCalories(){
        return Calories;
    }
}

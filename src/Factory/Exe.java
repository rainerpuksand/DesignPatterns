package Factory;

public class Exe {
    public static void main(String[] args) {

        FactoryForMacMeals obj = new FactoryForMacMeals();

        MacHappyMeal myXL = obj.makeMeal("XL");
        //System.out.println(myXL.cokeVolume );
        System.out.println("==============");

        MacHappyMeal mySmall = obj.makeMeal("Small");
        //System.out.println(mySmall.cokeVolume);
        System.out.println("==============");

        MacHappyMeal myMedium = obj.makeMeal("Medium");
        //System.out.println(mySmall.cokeVolume);
        System.out.println("==============");

    }
}
//This is not Abstract Factory pattern
// this is like a method that is called to return a desired type of an object
// whose creation is all done & developed according to the parameters of that method()
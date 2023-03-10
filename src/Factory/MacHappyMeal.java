package Factory;

public abstract class MacHappyMeal {
    //int cokeVolume;//keep this if the class can take in more
    abstract void putFries();
    abstract void putBurger();
    abstract void putCoke();
    abstract void putToy();
}

class MealXL extends MacHappyMeal{

    @Override
    void putFries() {
        System.out.println("Fries size: XL");
    }

    @Override
    void putBurger() {
        System.out.println("Burger is Double Decker");
    }

    @Override
    void putCoke() {
        System.out.println("Coke is 750ml");
        //cokeVolume=750;
    }

    @Override
    void putToy() {
        System.out.println("Toy is an Aeroplane!");
    }
}

class MealSmall extends MacHappyMeal{

    @Override
    void putFries() {
        System.out.println("Fries size: Small");
    }

    @Override
    void putBurger() {
        System.out.println("Burger is single pattice");
    }

    @Override
    void putCoke() {
        System.out.println("Coke is 400ml");
        //cokeVolume=400;
    }

    @Override
    void putToy() {
        System.out.println("Toy is a Kinder Egg!");
    }
}
class MealMedium extends MacHappyMeal{

    @Override
    void putFries() {
        System.out.println("Fries size: Medium");
    }

    @Override
    void putBurger() {
        System.out.println("Burger is with Cheese");
    }

    @Override
    void putCoke() {
        System.out.println("Coke is 550ml");
        //cokeVolume=400;
    }

    @Override
    void putToy() {
        System.out.println("Toy is a Paw Patrol!");
    }
}

/*abstract class MealToOrder {
    public abstract MacHappyMeal makeMeal(String size);
}*/

class FactoryForMacMeals {

    public MacHappyMeal makeMeal(String size){
        MacHappyMeal myMeal;

        switch (size){
            case "XL":
                myMeal = new MealXL();
                break;
            case "Small":
                myMeal = new MealSmall();
                break;

            case "Medium":
                myMeal = new MealMedium();
                break;

            default:
                throw new IllegalArgumentException("No such Meal. Get OUT!");
        }

        myMeal.putFries();
        myMeal.putBurger();
        myMeal.putCoke();
        myMeal.putToy();

    return myMeal;
    }


}



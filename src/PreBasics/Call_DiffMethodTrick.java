package PreBasics;

public class Call_DiffMethodTrick {
    public static void main(String[] args) {


        Thor thorObj = new Thor();
        thorObj.showPower();

        Hulk hulkObj= new Hulk();
        hulkObj.showPower();


        AvengerMovie myMovieObj = new AvengerMovie();
        myMovieObj.displayPower(thorObj);

        myMovieObj.displayPower(hulkObj);

    }
}

interface SuperHero{
    void showPower();
}

class Thor implements SuperHero{

    @Override
    public void showPower() {
        System.out.println("Throw the Hammer!");
    }
}

class Hulk implements SuperHero{

    @Override
    public void showPower() {
        System.out.println("Smash Things!!!");
    }
}

class AvengerMovie{
    public void displayPower(SuperHero obj){
        obj.showPower();
    }
}

package PreBasics;

public class PassingThis {
    public static void main(String[] args) {
        Owner yo = new Owner();
        Robot robo = new Robot();

        yo.name = "YOhan";
        yo.age = 101;
        yo.robotObj = robo;//associating robot with owner(via aggregation)

        yo.makeRoboTalk();


        System.out.println();
        Owner yoyo = new Owner();
        Robot myRobo = new Robot();

        yoyo.name = "Rainer";
        yoyo.age = 45;
        yoyo.robotObj = myRobo;

        yoyo.makeRoboTalk();

    }
}

class Robot{
    public void Talk(Owner obj){
        System.out.println("ROBO says....");
        System.out.println("Hello, " + obj.name);
        System.out.println("Your age is, " + obj.age);
    }
}

class Owner{
    String name;
    int age;
    Robot robotObj;

    public void makeRoboTalk(){
        robotObj.Talk(this);
    }
}


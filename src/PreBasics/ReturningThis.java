package PreBasics;


//BUILDER
public class ReturningThis {
    public static void main(String[] args) {

        //New Obj
        Man obj = new Man();
        obj.age=337;
        System.out.println(obj);

        //returning the above new obj to obj1... now obj1 can act like obj
        Man obj1 = obj.setNameAndReturnEntireObj("Yo");
        System.out.println( obj1);




    }
}

class Man{
    String name, eyeColor;
    int age, numEyes;
    boolean isStrong;

    public Man setNameAndReturnEntireObj(String name) {
        this.name = name;
        //this.isStrong = true;
        return this;
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", age=" + age +
                ", numEyes=" + numEyes +
                ", isStrong=" + isStrong +
                '}';
    }
}
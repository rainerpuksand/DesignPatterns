package Builder;

//https://developer.android.com/guide/topics/ui/notifiers/notifications#Templates
//https://developer.android.com/reference/android/app/Notification.Builder

public class BuilderEx {
    public static void main(String[] args) {

        //BadGuy obj = new BadGuy("WolfStein",50,2.5,true,"wolf");



        BadGuy obj = new BadGuyBuilder()
                        .setName("Wolfy")
                        .setBullets(4)
                        .setPower(2.5)
                        .setHasClaws(true)
                        .setLooksLike("AAaauuuu")
                        .buildBadGuy(); //vv imp.. the builder method()



        System.out.println(obj.toString());




    }
}

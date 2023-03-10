package PreBasics;

public class InformYohan {
    public static void main(String[] args) {

        SportsFan objSportsFan = new SportsFan(); // observer
        Notifications notiObj = new Notifications(); // subject

        notiObj.registerSportsFanForNoti(objSportsFan);//association takes place
        notiObj.setScore(5);

        System.out.println("===========");
        notiObj.setScore(20);

        System.out.println("===========");
        notiObj.setScore(2098);



    }
}


class SportsFan {
    public void update(Notifications notiObj) {
        System.out.println("UPDATE: Hey SportsFan, new score: " + notiObj.score);
    }
}

class Notifications{
    SportsFan objSportsFan;
    int score;

    //registration is like encapsulation setter
    public void registerSportsFanForNoti(SportsFan obj){
        this.objSportsFan = obj;
    }

    //encapsulation setter idea
    public void setScore(int score) {
        this.score = score;
        notifySportsFan();
    }

    public void notifySportsFan(){
        objSportsFan.update(this);
    }
}
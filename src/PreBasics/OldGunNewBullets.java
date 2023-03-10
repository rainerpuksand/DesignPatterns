package PreBasics;


//ADAPTER
public class OldGunNewBullets {
    public static void main(String[] args) {

        MyOldGun objOld = new MyOldGun();
        objOld.shootOldBullets();

        LazerPower obj = new LazerPower();
        MyNewGun objNew = new MyNewGun(obj);
        objNew.shootOldBullets();
    }

}

//original interface
interface OldGun{
    void shootOldBullets();
}

//outdated class
class MyOldGun implements OldGun{
    @Override
    public void shootOldBullets() {
        System.out.println("old old old");
    }
}

//new upgraded stuff... this class can be implementing some new interface too.
class LazerPower {
    public void shootsLazers(){
        System.out.println("Lazzzzzzzersssss");
    }
}

//have to use OLDGUN... now?
class MyNewGun implements OldGun{
    LazerPower obj;

    public MyNewGun(LazerPower obj) {
        this.obj = obj;
    }

    @Override
    public void shootOldBullets() {
        obj.shootsLazers();
    }
}
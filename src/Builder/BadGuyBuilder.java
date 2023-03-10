package Builder;

public class BadGuyBuilder {

    String name;
    int bullets;
    double power;
    boolean hasClaws;
    String looksLike;




    public BadGuyBuilder setName(String name) {
        this.name = name;
        return this;
    }


    public BadGuyBuilder setBullets(int bullets) {
        this.bullets = bullets;
        return this;
    }

    public BadGuyBuilder setPower(double power) {
        this.power = power;
        return this;
    }

    public BadGuyBuilder setHasClaws(boolean hasClaws) {
        this.hasClaws = hasClaws;
        return this;
    }

    public BadGuyBuilder setLooksLike(String looksLike) {
        this.looksLike = looksLike;
        return this;
    }

    public BadGuy buildBadGuy(){
        return new BadGuy(name, bullets, power, hasClaws, looksLike);
    }
}

//if you need a compulsory initialisation value
// knock of the setter and make a constructor for the same argument
// like in this case we will make name variable compulsory

//    public BadGuyBuilder(String name) {
//        this.name = name;
//    }
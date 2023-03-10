package Builder;

public class BadGuy {
    String name;
    int bullets;
    double power;
    boolean hasClaws;
    String looksLike;


    //there also could be a 2 parameter constructor(name,bullets)
    public BadGuy(String name, int bullets, double power, boolean hasClaws, String looksLike) {
        this.name = name;
        this.bullets = bullets;
        this.power = power;
        this.hasClaws = hasClaws;
        this.looksLike = looksLike;
    }

    @Override
    public String toString() {
        return "BadGuy{" +
                "name='" + name + '\'' +
                ", bullets=" + bullets +
                ", power=" + power +
                ", hasClaws=" + hasClaws +
                ", looksLike='" + looksLike + '\'' +
                '}';
    }
}

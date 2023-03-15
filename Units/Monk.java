package Units;
public class Monk extends BaseHero {
    private int mana;
    private int manaMax;
    public Monk(String name, int x, int y) { //, int manaMax) {
        super(30, 12, -4, -4, 7, 5, name, x, y);
        this.manaMax = 1;
        this.mana = manaMax;
    }

    public String getInfo(){
        return String.format("%s Mana: %d", super.getInfo(), this.mana);
    }

    public String getType(){return "Монах";}
}
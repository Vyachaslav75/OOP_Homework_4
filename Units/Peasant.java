package Units;
public class Peasant extends BaseHero {
    private int delivery = 1;
    public Peasant(String name, int x, int y) {
        super(name, x, y);
    }

    public String getInfo(){
        return String.format("%s ", super.getInfo());
    }

    public String getType(){return "Крестьянин";}
}

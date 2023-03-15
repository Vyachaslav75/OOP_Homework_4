package Units;

public class Positions {
    protected int x;
    protected int y;

    public Positions(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(int x1, int y1){
        return Math.sqrt(Math.pow((x1-this.x), 2)+Math.pow((y1-this.y), 2));
    }

}

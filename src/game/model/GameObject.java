package game.model;

public class GameObject {
    protected int x;
    protected int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public GameObject(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

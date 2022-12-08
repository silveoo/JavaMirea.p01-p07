package p06;

public class MovingCircle implements Moving {
    int R;
    MovingPoint center;


    MovingCircle(int x, int y, int xspeed, int yspeed, int radius) {
        this.center = new MovingPoint(x, y, xspeed, yspeed);
        this.R = radius;
    }

    @Override
    public String toString() {
        return "Окружность с центром " + center +  "\nРадиусом " + R;
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }
}

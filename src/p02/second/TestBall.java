package p02.second;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(0, 22.5);
        System.out.println(ball);
        ball.move(10, -12.5);
        System.out.println(ball);
    }
}


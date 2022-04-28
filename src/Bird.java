import java.awt.*;

public class Bird {
    private int x;
    private int y;

    private int velY;

    public Bird(int x, int y) {
        this.x = x;
        this.y = y;
        this.velY = -15;
    }
    public void jump(){
        velY -= 30;
    }
    public void move(){
        velY+=1;
        if (velY > 15){
            velY=15;
        }
        if (velY < -15){
            velY=-15;
        }
        y+=velY;
    }
    public void draw(Graphics2D g){
        g.setColor(Color.green);
        g.fillRect(x, y, 20, 20);
    }
}

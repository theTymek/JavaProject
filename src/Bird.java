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
        //BODY
        g.setColor(Color.orange);
        g.fillRect(x, y, 35, 23);
        g.setColor(Color.black);
        g.drawRect(x, y, 35, 23);

        //WING
        g.setColor(Color.orange);
        g.fillRect(x-3, y+10, 20, 15);
        g.setColor(Color.black);
        g.drawRect(x-3, y+10, 20, 15);

        //DZIUB
        g.setColor(Color.yellow);
        g.fillRect(x+20, y+12, 20, 7);
        g.setColor(Color.black);
        g.drawRect(x+20, y+12, 20, 7);



        //WHITE EYE
        g.setColor(Color.white);
        g.fillRect(x+27, y+2, 8, 8);
        g.setColor(Color.black);
        g.drawRect(x+27, y+2, 8, 8);

        //BLACK EYE
        g.fillRect(x+30, y+5, 5, 5);
    }
}

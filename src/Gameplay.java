import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Gameplay extends JPanel implements KeyListener, ActionListener {

    //HELLO GIT
    private Bird bird = new Bird(150,300);
    private Pipe Piep = new Pipe(600,400);

    private boolean isPlaying = false;

    public Gameplay(){
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);

        int delay = 8;
        Timer timer = new Timer(delay, this);
        timer.start();
    }

    public void paint(Graphics g){
        g.setColor(new Color(2, 126, 124));
        g.fillRect(0, 0, 400, 700);

        if (!isPlaying){
            g.setColor(Color.yellow);
            g.fillRoundRect(100, 100, 200, 100,30,30);
            Font myFont = new Font ("Arial", 1, 28);
            g.setFont (myFont);
            g.setColor(Color.black);
            g.drawString("START GAME",108,160);
        }

        bird.draw((Graphics2D) g);
        Piep.draw((Graphics2D) g);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (isPlaying){
            bird.move();
            Piep.move();
        }


        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            if (!isPlaying) {
                isPlaying = true;
            } else {
                bird.jump();
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}

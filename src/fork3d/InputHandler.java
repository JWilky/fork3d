package fork3d;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Wilky
 * Date: 10/30/13
 * Time: 8:14 AM
 * To change this template use File | Settings | File Templates.
 */
public class InputHandler implements KeyListener {

    public InputHandler(Game game){
        game.addKeyListener(this);
    }

    public List<Key> keys = new ArrayList<Key>();

    public class Key {
        public boolean pressed = false;

        public boolean isPressed(){
            return pressed;
        }

        public void toggle(boolean isPressed) {
            pressed = isPressed;
        }

    }

    public Key up = new Key();
    public Key down = new Key();
    public Key left = new Key();
    public Key right = new Key();

    public void keyPressed(KeyEvent e) {
        toggleKey(e.getKeyCode(), true);
    }

    public void keyReleased(KeyEvent e) {
        toggleKey(e.getKeyCode(), false);
    }

    public void keyTyped(KeyEvent e) {

    }

    public void toggleKey(int keyCode, boolean isPressed) {
        if (keyCode == KeyEvent.VK_E) {
            up.toggle(isPressed);
        }
        if (keyCode == KeyEvent.VK_D) {
            down.toggle(isPressed);
        }
        if (keyCode == KeyEvent.VK_S) {
            left.toggle(isPressed);
        }
        if (keyCode == KeyEvent.VK_F) {
            right.toggle(isPressed);
        }
    }
}

package Programmingnew;

import java.awt.event.*;

public class Listeners implements MouseListener, KeyListener, MouseMotionListener {
    public void keyPressed(KeyEvent e){
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_W){
            Player.up = true;
        }
        if (key == KeyEvent.VK_S){
            Player.down = true;
        }
        if (key == KeyEvent.VK_A){
            Player.left = true;
        }
        if (key == KeyEvent.VK_D){
            Player.right = true;
        }
    }
    public void keyReleased(KeyEvent e){
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_W){
            Player.up = false;
        }
        if (key == KeyEvent.VK_S){
            Player.down = false;
        }
        if (key == KeyEvent.VK_A){
            Player.left = false;
        }
        if (key == KeyEvent.VK_D){
            Player.right = false;
        }
    }
    public void keyTyped(KeyEvent e){

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        Panel.mouseX = e.getX();
        Panel.mouseY = e.getY();
    }
}

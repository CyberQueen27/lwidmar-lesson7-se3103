package controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import model.strategyPattern.downStrategy;
import model.strategyPattern.leftStrategy;
import model.strategyPattern.rightStrategy;
import model.strategyPattern.upStrategy;

public class KeyPressListener implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        switch (key){
            case KeyEvent.VK_LEFT:
                App.model.snake.setDirectionStrategy(new leftStrategy());
                break;
            case KeyEvent.VK_RIGHT:
                App.model.snake.setDirectionStrategy(new rightStrategy());
                break;
            case KeyEvent.VK_UP:
                App.model.snake.setDirectionStrategy(new upStrategy());
                break;
            case KeyEvent.VK_DOWN:
            App.model.snake.setDirectionStrategy(new downStrategy());
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
    
}

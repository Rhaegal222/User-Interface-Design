package controller;

import java.awt.event.KeyEvent;

public class GameController {
    private final GraphicPanel panel;

    public GameController(GraphicPanel panel){
        this.panel= panel;
    }

    public void KeyPressed(KeyEvent e){
        switch (e.getKeyCode()){
            case KeyEvent.VK_UP -> {}
            case KeyEvent.VK_RIGHT -> {}
        }
    }

    public void KeyTyped(){}
}
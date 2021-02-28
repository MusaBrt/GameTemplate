package com.megacrafter.gamename.input;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Arrays;

public class KeyHandler extends KeyAdapter {

    private boolean[] keys = new boolean[256];
    private boolean[] clicked = new boolean[256];

    @Override
    public void keyPressed(KeyEvent e) {
        keys[e.getKeyCode()] = true;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (keys[e.getKeyCode()]) clicked[e.getKeyCode()] = true;
        keys[e.getKeyCode()] = false;
    }

    public boolean isPressed(int code) {
        return keys[code];
    }

    public boolean isClicked(int code) {
        return clicked[code];
    }

    public void update() {
        Arrays.fill(clicked, false);
    }
}
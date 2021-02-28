package com.megacrafter.gamename.input;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

public class MouseHandler extends MouseAdapter {

    private boolean mouseIn = false;
    private int mouseX = 0;
    private int mouseY = 0;
    private int mouseXOnScreen = 0;
    private int mouseYOnScreen = 0;

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
        mouseIn = true;
    }

    @Override
    public void mouseExited(MouseEvent e) {
        mouseIn = false;
    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
        mouseXOnScreen = e.getXOnScreen();
        mouseYOnScreen = e.getYOnScreen();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
        mouseXOnScreen = e.getXOnScreen();
        mouseYOnScreen = e.getYOnScreen();
    }

    public boolean isMouseIn() {
        return mouseIn;
    }

    public int getMouseX() {
        return mouseX;
    }

    public int getMouseY() {
        return mouseY;
    }

    public int getMouseXOnScreen() {
        return mouseXOnScreen;
    }

    public int getMouseYOnScreen() {
        return mouseYOnScreen;
    }
}
package com.megacrafter.gamename.gui;

import com.megacrafter.gamename.Core;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    public GamePanel() {
        super(null);

        setBounds(0, 0, Core.getWidth(), Core.getHeight());
    }

    @Override
    protected void paintComponent(Graphics gr) {
        Graphics2D g = (Graphics2D) gr;
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        super.paintComponent(g);

        g.setColor(Color.WHITE);
        g.fillRect(0, 0, Core.getWidth(), Core.getHeight());

        Core.getRenderer().renderGame(g);
    }
}
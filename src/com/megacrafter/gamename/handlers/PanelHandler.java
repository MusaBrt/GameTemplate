package com.megacrafter.gamename.handlers;

import com.megacrafter.gamename.Core;
import com.megacrafter.gamename.gui.GamePanel;

import javax.swing.*;

public class PanelHandler {

    public static JPanel gamePanel;

    private JPanel currentPanel;

    public PanelHandler(JPanel startPanel) {
        this.currentPanel = startPanel;
        currentPanel.setVisible(true);
    }

    public void showPanel(JPanel newPanel) {
        currentPanel.setVisible(false);
        newPanel.setVisible(true);
    }

    public JPanel getCurrentPanel() {
        return currentPanel;
    }

    public static void initPanels() {
        gamePanel = new GamePanel();
        gamePanel.setVisible(false);
        Core.getGameWindow().add(gamePanel);
    }
}
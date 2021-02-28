package com.megacrafter.gamename;

import com.megacrafter.gamename.input.KeyHandler;
import com.megacrafter.gamename.input.MouseHandler;
import com.megacrafter.gamename.handlers.GameHandler;
import com.megacrafter.gamename.handlers.LogicHandler;
import com.megacrafter.gamename.handlers.PanelHandler;
import com.megacrafter.gamename.handlers.Renderer;

import javax.swing.*;

public class Core {

    private static JFrame frame;
    private static final int WIDTH = 1280;
    private static final int HEIGHT = 720;

    private static PanelHandler panelHandler;
    private static Renderer renderer;
    private static LogicHandler logicHandler;
    private static GameHandler gameHandler;
    private static KeyHandler keyHandler;
    private static MouseHandler mouseHandler;

    public static void main(String[] args) {
        frame = new JFrame("TITLE");
        frame.setSize(WIDTH, HEIGHT);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);

        keyHandler = new KeyHandler();
        frame.addKeyListener(keyHandler);

        mouseHandler = new MouseHandler();
        frame.addMouseListener(mouseHandler);
        frame.addMouseMotionListener(mouseHandler);
        frame.addMouseWheelListener(mouseHandler);

        PanelHandler.initPanels();
        panelHandler = new PanelHandler(PanelHandler.gamePanel);

        renderer = new Renderer();

        logicHandler = new LogicHandler();

        gameHandler = new GameHandler();

        frame.setVisible(true);
    }


    public static GameHandler getGameHandler() {
        return gameHandler;
    }

    public static LogicHandler getLogicHandler() {
        return logicHandler;
    }

    public static Renderer getRenderer() {
        return renderer;
    }

    public static PanelHandler getPanelHandler() {
        return panelHandler;
    }

    public static KeyHandler getKeyHandler() {
        return keyHandler;
    }

    public static MouseHandler getMouseHandler() {
        return mouseHandler;
    }


    public static JFrame getGameWindow() {
        return frame;
    }

    public static int getWidth() {
        return WIDTH;
    }

    public static int getHeight() {
        return HEIGHT;
    }
}
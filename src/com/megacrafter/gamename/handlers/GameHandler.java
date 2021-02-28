package com.megacrafter.gamename.handlers;

public class GameHandler {

    private Thread gameLoop;
    private GameLoopHandler gameLoopHandler = new GameLoopHandler();
    public GameHandler() {
        gameLoop = new Thread(gameLoopHandler);
    }

    public synchronized void start() {
        if (gameLoopHandler.isRunning()) return;
        gameLoopHandler.setRunning(true);
        gameLoop.start();
    }

    public synchronized void stop() {
        if (!gameLoopHandler.isRunning()) return;
        gameLoopHandler.setRunning(false);

        try {
            gameLoop.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
            gameLoop.interrupt();
        }
    }
}
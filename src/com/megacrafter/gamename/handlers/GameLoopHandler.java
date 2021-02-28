package com.megacrafter.gamename.handlers;

import com.megacrafter.gamename.Core;

public class GameLoopHandler implements Runnable {

    private boolean running = false;
    private volatile boolean paused = false;

    @Override
    public void run() {
        long now;
        long lastTime = System.nanoTime();
        double delta = 0;
        double nspt = 1000000000.0D / 60.0D;

        while (running) {
            while (paused);
            now = System.nanoTime();
            delta += (now - lastTime) / nspt;
            lastTime = now;

            while (delta >= 1) {
                delta--;
                Core.getLogicHandler().updateGame();
                Core.getRenderer().defaultRender();
            }
        }
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public void pauseLoop() {
        paused = true;
    }

    public void unpauseLoop() {
        paused = false;
    }
}
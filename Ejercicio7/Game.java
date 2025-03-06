package Ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Enemy> enemies = new ArrayList<>();
    private boolean endGame = false;

    public void iniciar() {
        enemies.add(new GunEnemy());
        enemies.add(new KnifeEnemy());
    }

    void run() {
        while (!endGame) {
            for (Enemy enemy : enemies) {
                enemy.doAction();
            }
            endGame = true;
        }
    }
    
    public static void main(String[] args) {
        Game game = new Game();
        game.iniciar();
        game.run();
    }
}
// OCP
// DIP
// SRP
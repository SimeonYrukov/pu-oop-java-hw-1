package game;

import java.awt.*;


public class GameTileWhite {
    private int tileSize;


    public GameTileWhite(int row, int col) {

        this.tileSize = 100;


    }

    public void render(Graphics g) {
        int tileSize = 100;


        g.setColor(Color.white);

        g.fillRect(200, 20, this.tileSize, this.tileSize);
        g.fillRect(200, 120, this.tileSize, this.tileSize);
        g.fillRect(0, 220, this.tileSize, this.tileSize);
        g.fillRect(100, 220, this.tileSize, this.tileSize);
        g.fillRect(300, 220, this.tileSize, this.tileSize);
        g.fillRect(400, 220, this.tileSize, this.tileSize);
        g.fillRect(200, 320, this.tileSize, this.tileSize);
        g.fillRect(200, 420, this.tileSize, this.tileSize);

    }
}

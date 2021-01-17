package game;

import java.awt.*;

public class GameTileGrey {
    private int tileSize;


    public GameTileGrey(int row, int col){

        this.tileSize = 100;


    }
    public void render(Graphics g){
        int tileSize= 100;


        g.setColor(Color.gray);

        g.fillRect(0,120,this.tileSize,this.tileSize);
        g.fillRect(100,120,this.tileSize,this.tileSize);
        g.fillRect(300,120,this.tileSize,this.tileSize);
        g.fillRect(400,120,this.tileSize,this.tileSize);
        g.fillRect(0,320,this.tileSize,this.tileSize);
        g.fillRect(100,320,this.tileSize,this.tileSize);
        g.fillRect(300,320,this.tileSize,this.tileSize);
        g.fillRect(400,320,this.tileSize,this.tileSize);

    }
}

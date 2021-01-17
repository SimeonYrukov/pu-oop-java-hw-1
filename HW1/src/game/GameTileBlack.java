package game;

import java.awt.*;

public class GameTileBlack {
    private int tileSize;


    public GameTileBlack(int row, int col){

        this.tileSize = 100;


    }
    public void render(Graphics g){
        int tileSize= 100;


        g.setColor(Color.black);

        g.fillRect(100,20,this.tileSize,this.tileSize);
        g.fillRect(300,20,this.tileSize,this.tileSize);
        g.fillRect(0,420,this.tileSize,this.tileSize);
        g.fillRect(400,420,this.tileSize,this.tileSize);

    }


}

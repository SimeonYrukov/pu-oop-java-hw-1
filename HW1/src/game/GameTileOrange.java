package game;

import java.awt.*;

public class GameTileOrange {

    private int tileSize;
    private Color orange = new Color(255, 125, 82);



    public GameTileOrange(int row, int col){

        this.tileSize = 100;


    }
    public void render(Graphics g){
        int tileSize= 100;


            g.setColor(orange);

        g.fillRect(0,20,this.tileSize,this.tileSize);
        g.fillRect(400,20,this.tileSize,this.tileSize);
        g.fillRect(100,420,this.tileSize,this.tileSize);
        g.fillRect(300,420,this.tileSize,this.tileSize);

    }
}

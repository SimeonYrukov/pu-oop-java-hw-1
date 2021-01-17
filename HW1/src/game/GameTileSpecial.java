package game;

import java.awt.*;

public class GameTileSpecial {
    private int tileSize;
    private int ovalSize;


    public GameTileSpecial(int row, int col){

        this.tileSize = 100;
        this.ovalSize=50;



    }
    public void render(Graphics g){
        int tileSize= 100;



        g.setColor(Color.WHITE);
        g.fillRect(200,220,this.tileSize,this.tileSize);
        g.setColor(Color.BLACK);
        g.fillOval( 225,245,this.ovalSize,this.ovalSize);

    }
}

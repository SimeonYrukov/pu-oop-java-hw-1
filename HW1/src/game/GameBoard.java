package game;

import javax.swing.*;
import java.awt.*;

import piece.Guard;
import piece.Leader;

public class GameBoard extends JFrame {

public GameBoard() {
        this.setSize(500, 520);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        }

@Override
public void paint(Graphics g) {
        super.paint(g);

    for (int row = 0; row<5; row++) {
        for (int col = 0; col < 5; col++) {
            GameTileOrange tileOr = new GameTileOrange(row, col);
            GameTileBlack tileBl= new GameTileBlack(row, col);
            GameTileGrey tileGr= new GameTileGrey(row,col);
            GameTileSpecial tileSp= new GameTileSpecial(row,col);
            GameTileWhite tileWH= new GameTileWhite(row,col);
            tileOr.render(g);
            tileBl.render(g);
            tileGr.render(g);
            tileSp.render(g);
            tileWH.render(g);

            Leader L1= new Leader(row, col);
            L1.render(g);

            Guard G1= new Guard(row,col);
            G1.render(g);
        }
    }



}


}
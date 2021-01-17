package piece;

import java.awt.*;

public class Leader {
    private int row;
    private int col;
    private String color;
    private int point;

    public Leader(int row, int col){
        this.row = row;
        this.col = col;
        this.color= color;


    }

    public void render(Graphics g){
        //Green
        g.setColor(Color.GREEN);
        g.fillRect(30,440,50,50);
        //Yellow
        g.setColor(Color.YELLOW);
        g.fillRect(430,40,50,50);
    }
}

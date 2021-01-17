package piece;

import java.awt.*;

public class Guard {
    private int row;
    private int col;
    private String color;
    private int point;

    public Guard(int row, int col){
        this.row = row;
        this.col = col;
        this.color= color;


    }

    public void render(Graphics g){
        //Yellow
        g.setColor(Color.YELLOW);
        g.fillOval(30,40,50,50);
        g.fillOval(130,40,50,50);
        g.fillOval(230,40,50,50);
        g.fillOval(330,40,50,50);
        g.setColor(Color.GREEN);
        g.drawOval(31, 40,50,50);
        g.drawOval(130, 40,50,50);
        g.drawOval(230, 40,50,50);
        g.drawOval(330, 40,50,50);
        //Green
        g.setColor(Color.GREEN);
        g.fillOval(130,440,50,50);
        g.fillOval(230,440,50,50);
        g.fillOval(330,440,50,50);
        g.fillOval(430,440,50,50);
        g.setColor(Color.YELLOW);
        g.drawOval(130,440,50,50);
        g.drawOval(230,440,50,50);
        g.drawOval(330,440,50,50);
        g.drawOval(430,440,50,50);

    }
}

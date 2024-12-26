package cs.vsu.ru.kg24.g12.sidorenko_d_d.DrawAppleGarden;

import java.awt.Color;
import java.awt.Graphics2D;

public class Hill {
    private int x;
    private int y;
    private int verticalRadius;
    private int horizontalRadius;
    private Color color;

    public Hill(int x, int y, int verticalRadius, int horizontalRadius, Color color) {
        this.x = x;
        this.y = y;
        this.verticalRadius = verticalRadius;
        this.horizontalRadius = horizontalRadius;
        this.color = color;
    }

    public void draw(Graphics2D g) {

        g.setColor(color);


        g.fillArc(x - horizontalRadius, y - verticalRadius,
                horizontalRadius * 2, verticalRadius * 2,
                0, 180);
    }
}

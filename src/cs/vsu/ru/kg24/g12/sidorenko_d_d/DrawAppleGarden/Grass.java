package cs.vsu.ru.kg24.g12.sidorenko_d_d.DrawAppleGarden;

import java.awt.*;

public class Grass {
    private int x;
    private int y;
    private int height;
    private Color color;

    public Grass(int x, int y, int height, Color color) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.color = color;
    }

    public void draw(Graphics2D g) {
        g.setColor(color);
        g.drawLine(x, y, x, y - height);
    }
}

package cs.vsu.ru.kg24.g12.sidorenko_d_d.DrawAppleGarden;

import java.awt.Color;
import java.awt.Graphics2D;

public class Cloud {
    private int x;
    private int y;
    private int width;
    private int height;
    private Color color;

    public Cloud(int x, int y, int width, int height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = Color.WHITE;
    }

    public void draw(Graphics2D g) {
        g.setColor(color);
        g.fillOval(x, y, width, height);
        g.fillOval(x - width / 4, y + height / 4, width, height);
        g.fillOval(x + width / 4, y + height / 4, width, height);
        g.fillOval(x - width / 2, y + height / 2, width, height);
        g.fillOval(x + width / 2, y + height / 2, width, height);
    }

    public void moveRight(int distance) {
        x -= distance;
    }

    public int getX() {
        return x;
    }
}

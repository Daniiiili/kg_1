package cs.vsu.ru.kg24.g12.sidorenko_d_d.DrawAppleGarden;

import java.awt.Color;
import java.awt.Graphics2D;

public class Bush {
    private int x, y, width, height;
    private Color leafColor, trunkColor;

    public Bush(int x, int y, int width, int height, Color leafColor, Color trunkColor) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.leafColor = leafColor;
        this.trunkColor = trunkColor;
    }

    public void draw(Graphics2D g) {
        g.setColor(leafColor);
        g.fillOval(x - 30, y - 20, width + 60, height + 40);
        g.fillOval(x - 20, y - 30, width + 40, height + 40);
        g.fillOval(x - 10, y - 20, width + 20, height + 20);
        g.setColor(trunkColor);
        g.fillRect(x + width / 3, y + height, width / 3, 40);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Color getLeafColor() {
        return leafColor;
    }

    public Color getTrunkColor() {
        return trunkColor;
    }
}

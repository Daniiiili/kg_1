package cs.vsu.ru.kg24.g12.sidorenko_d_d.DrawAppleGarden;

import java.awt.*;

public class Apple {
    int x, y, size;
    Color color;

    public Apple(int x, int y, int size, Color color) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
    }

    public void draw(Graphics2D g) {
        GradientPaint gradient = new GradientPaint(
                x + size / 2, y, color.brighter(),
                x + size / 2, y + size, color.darker()
        );
        g.setPaint(gradient);
        g.fillOval(x, y, size, size);
        g.setColor(new Color(139, 69, 19));
        int stemLength = 10;
        int stemX = x + size / 2;
        int stemY = y - stemLength;
        g.fillRect(stemX - 2, stemY, 4, stemLength);
        g.setColor(new Color(255, 255, 255, 100));
        g.fillOval(x + size / 4, y + size / 4, size / 2, size / 2);
    }
    public int getY() {
        return y;
    }
}

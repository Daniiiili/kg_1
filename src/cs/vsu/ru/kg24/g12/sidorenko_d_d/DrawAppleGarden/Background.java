package cs.vsu.ru.kg24.g12.sidorenko_d_d.DrawAppleGarden;

import java.awt.*;

public class Background {
    private int x, y;
    private int width, height;
    private Color skyColor;
    private Color groundColor;

    public Background(int x, int y, int width, int height, Color skyColor, Color groundColor) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.skyColor = skyColor;
        this.groundColor = groundColor;
    }

    public void draw(Graphics2D g) {

        g.setColor(skyColor);
        g.fillRect(x, y, width, height / 2);


        g.setColor(groundColor);
        g.fillRect(x, y + height / 2, width, height / 2);
    }
}

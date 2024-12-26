package cs.vsu.ru.kg24.g12.sidorenko_d_d.DrawAppleGarden;

import java.awt.Color;
import java.awt.Graphics2D;

    public class Sun {
        private int x;
        private int y;
        private int radius;
        private Color color;

        public Sun(int x, int y, int radius, Color color) {
            this.x = x;
            this.y = y;
            this.radius = radius;
            this.color = color;
        }

        public void draw(Graphics2D g) {
            g.setColor(color);
            g.fillOval(x - radius, y - radius, radius * 2, radius * 2);

            g.setColor(Color.YELLOW);
            int rayLength = radius + 20;
            for (int angle = 0; angle < 360; angle += 30) {
                int x1 = (int) (x + Math.cos(Math.toRadians(angle)) * radius);
                int y1 = (int) (y + Math.sin(Math.toRadians(angle)) * radius);
                int x2 = (int) (x + Math.cos(Math.toRadians(angle)) * rayLength);
                int y2 = (int) (y + Math.sin(Math.toRadians(angle)) * rayLength);
                g.drawLine(x1, y1, x2, y2);
            }
        }
    }

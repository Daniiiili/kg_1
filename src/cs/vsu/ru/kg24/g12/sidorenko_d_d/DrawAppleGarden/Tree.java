package cs.vsu.ru.kg24.g12.sidorenko_d_d.DrawAppleGarden;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Tree {
    int x, y, w, h;
    Color cTree, cWood;
    List<Apple> apples;

    public Tree(int x, int y, int w, int h, Color cTree, Color cWood) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.cTree = cTree;
        this.cWood = cWood;
        this.apples = new ArrayList<>();
        generateApples();
    }


    private void generateApples() {
        int appleCount = 4+ (int)(Math.random() * 2);

        int appleSize = 25 + (int)(Math.random() * 5);
        List<Point> applePositions = new ArrayList<>();

        double maxDistX = w / 2.3;
        double maxDistY = h / 2.3;

        double minDistance = appleSize * 1.6;

        for (int i = 0; i < appleCount; i++) {
            boolean validPosition = false;
            int appleX = 0;
            int appleY = 0;
            while (!validPosition) {
                appleX = x + (int)(Math.random() * w);
                appleY = y + (int)(Math.random() * h);
                double distanceToCenter = Math.hypot(appleX - (x + w / 2), appleY - (y + h / 2));
                if (distanceToCenter > Math.min(maxDistX, maxDistY)) {
                    validPosition = false;
                } else {
                    validPosition = true;
                }

                for (Point pos : applePositions) {
                    if (Math.hypot(pos.x - appleX, pos.y - appleY) < minDistance) {
                        validPosition = false;
                        break;
                    }
                }
            }

            applePositions.add(new Point(appleX, appleY));
            apples.add(new Apple(appleX, appleY, appleSize, Color.RED));
        }
    }
    public void draw(Graphics2D g) {

        g.setPaint(cWood);
        g.fillRect((2 * x + w) / 2 - w / 8, y + h / 2, w / 4, h);

        g.setPaint(cTree);
        g.fillOval(x, y, w, h);
        for (Apple apple : apples) {
            apple.draw(g);
        }
    }
}

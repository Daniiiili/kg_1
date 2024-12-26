package cs.vsu.ru.kg24.g12.sidorenko_d_d.DrawAppleGarden;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DrawPanel extends JPanel {
    private List<Background> background = new ArrayList<>();
    private List<Hill> hills = new ArrayList<>();
    private List<Cloud> clouds = new ArrayList<>();
    private List<Grass> grasses = new ArrayList<>();
    private List<Bush> bushes = new ArrayList<>();
    private Sun sun;
    private List<Tree> trees = new ArrayList<>();
    private static final Random rnd = new Random();

    public DrawPanel() {
        background.add(new Background(-100, -100, 1500, 1300, new Color(63, 175, 255), new Color(26, 128, 24)));
        sun = new Sun(1150, 80, 30, Color.ORANGE);
        for (int i = 0; i < 3; i++) {
            clouds.add(new Cloud(rnd.nextInt(900), rnd.nextInt(200), 130, 70, new Color(255, 255, 255, 50)));
        }
        hills.add(new Hill(1080, 620, 115, 300, new Color(26, 128, 24)));
        hills.add(new Hill(650, 620, 115, 300, new Color(26, 128, 24)));
        hills.add(new Hill(230, 620, 115, 300, new Color(26, 128, 24)));
        for (int i = 0; i < 20000; i++) {
            grasses.add(new Grass(rnd.nextInt(1500), 530 + rnd.nextInt(280 ), 10 + rnd.nextInt(20), new Color(34, 180, 34)));
        }
        trees.add(new Tree(600, 350, 130, 250, new Color(13, 100, 13), new Color(65, 33, 9)));
        trees.add(new Tree(300, 350, 130, 250, new Color(13, 100, 13), new Color(65, 33, 9)));
        trees.add(new Tree(800, 350, 130, 250, new Color(13, 100, 13), new Color(65, 33, 9)));
        trees.add(new Tree(100, 350, 130, 250, new Color(13, 100, 13), new Color(65, 33, 9)));
        trees.add(new Tree(1000, 350, 130, 250, new Color(13, 100, 13), new Color(65, 33, 9)));
        bushes.add(new Bush(250, 600, 60, 40, new Color(34, 139, 34), new Color(139, 69, 19)));
        bushes.add(new Bush(750, 650, 80, 50, new Color(34, 139, 34), new Color(139, 69, 19)));
        bushes.add(new Bush(1100, 630, 70, 45, new Color(34, 139, 34), new Color(139, 69, 19)));
        bushes.add(new Bush(500, 670, 70, 45, new Color(34, 139, 34), new Color(139, 69, 19)));
        bushes.add(new Bush(930, 690, 70, 45, new Color(34, 139, 34), new Color(139, 69, 19)));
        Timer timer = new Timer(50, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moveClouds();
                repaint();
            }
        });
        timer.start();
    }

    private void moveClouds() {
        for (Cloud cloud : clouds) {
            cloud.moveRight(3);
            if (cloud.getX() < -300) {
                cloud.moveRight(-1800);
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (Background b : background) {
            b.draw((Graphics2D) g);
        }
        sun.draw((Graphics2D) g);
        for (Cloud cloud : clouds) {
            cloud.draw((Graphics2D) g);
        }

        for (Hill hill : hills) {
            hill.draw((Graphics2D) g);
        }
        for (Grass grass : grasses) {
            grass.draw((Graphics2D) g);
        }
        for (Tree tree : trees) {
            tree.draw((Graphics2D) g);
        }
        for (Bush bush : bushes) {
            bush.draw((Graphics2D) g);
        }
    }
}

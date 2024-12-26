package cs.vsu.ru.kg24.g12.sidorenko_d_d.DrawAppleGarden;

import javax.swing.*;


public class MainFrame extends javax.swing.JDialog {
    private javax.swing.JPanel contentPane;
    private JPanel paintAreaPanel;
    private DrawPanel dp;

    public MainFrame() {
        setContentPane(contentPane);
        setModal(true);


        dp = new DrawPanel();
        paintAreaPanel.add(dp);
    }

    public static void main(String[] args) {
        MainFrame dialog = new MainFrame();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);

    }

}

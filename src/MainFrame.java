import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.FlowLayout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

public class MainFrame extends JFrame{

    private JPanel centralJPanel;
    private JButton exitBtn;
    private JButton redBtn;
    private JButton blueBtn;
    private JButton greenBtn;
    private JButton alapBtn;



    MainFrame(){
        initComponents();
    }

    private void initComponents(){
        this.setSize(400, 300);
        this.setDefaultCloseOperation(MainFrame.DO_NOTHING_ON_CLOSE);
        this.setTitle("Szöveg másoláls");
        this.setLayout(new GridLayout(1,1));

        JPanel maiPnl = new JPanel();
        maiPnl.setLayout(new BorderLayout());
        this.add(maiPnl);

        JPanel northJPanel = new JPanel();
        northJPanel.setSize(400, 30);
        northJPanel.setBackground(Color.pink);
        maiPnl.add(northJPanel,BorderLayout.NORTH);

        JPanel eastJPanel = new JPanel();
        eastJPanel.setSize(30,240);
        eastJPanel.setBackground(Color.pink);
        maiPnl.add(eastJPanel,BorderLayout.EAST);

        JPanel soutJPanel = new JPanel();
        soutJPanel.setSize(400, 30);
        soutJPanel.setBackground(Color.pink);
        redBtn = new JButton("P");
        blueBtn = new JButton("B");
        greenBtn = new JButton("G");
        exitBtn = new JButton("Exit");
        alapBtn = new JButton("Alap");
        soutJPanel.setLayout(new FlowLayout (FlowLayout.CENTER));
        soutJPanel.add(redBtn);
        soutJPanel.add(blueBtn);
        soutJPanel.add(greenBtn);
        soutJPanel.add(exitBtn);
        soutJPanel.add(alapBtn);
        maiPnl.add(soutJPanel,BorderLayout.SOUTH);

        JPanel westJPanel = new JPanel();
        westJPanel.setSize(30, 240);
        westJPanel.setBackground(Color.pink);
        maiPnl.add(westJPanel,BorderLayout.WEST);

        centralJPanel = new JPanel();
        centralJPanel.setBackground(Color.GRAY);
        maiPnl.add(centralJPanel,BorderLayout.CENTER);

    }

    public void setCentralJPanel (Color color){

        centralJPanel.setBackground(color);
    }

    public JButton getExitBtn() {return exitBtn;}
    public JButton getRed() {return redBtn;}
    public JButton getBlue() {return blueBtn;}
    public JButton getGreen() {return greenBtn;}
    public JButton getAlap() {return alapBtn;}



   
}

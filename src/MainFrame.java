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

        JPanel northJPnl = new JPanel();
        northJPnl.setSize(400, 30);
        northJPnl.setBackground(Color.pink);
        maiPnl.add(northJPnl,BorderLayout.NORTH);

        JPanel eastJPnl = new JPanel();
        eastJPnl.setSize(30,240);
        eastJPnl.setBackground(Color.pink);
        maiPnl.add(eastJPnl,BorderLayout.EAST);

        JPanel soutJPnl = new JPanel();
        soutJPnl.setSize(400, 30);
        soutJPnl.setBackground(Color.pink);
        soutJPnl.setLayout(new FlowLayout (FlowLayout.CENTER));
            redBtn = new JButton("P");      soutJPnl.add(redBtn);
            blueBtn = new JButton("B");     soutJPnl.add(blueBtn);
            greenBtn = new JButton("G");    soutJPnl.add(greenBtn);
            exitBtn = new JButton("Exit");  soutJPnl.add(exitBtn);
            alapBtn = new JButton("A");  soutJPnl.add(alapBtn);
        maiPnl.add(soutJPnl,BorderLayout.SOUTH);

        JPanel westJPnl = new JPanel();
        westJPnl.setSize(30, 240);
        westJPnl.setBackground(Color.pink);
        maiPnl.add(westJPnl,BorderLayout.WEST);

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

import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;

public class FormContoler implements ActionListener {
    private MainFrame mainFrm;
    
    FormContoler(){
        mainFrm = new MainFrame();
        setComentsAction();
        start();
    }

    private void setComentsAction(){
        mainFrm.getExitBtn().addActionListener(this);
        mainFrm.getExitBtn().addActionListener(this);
        mainFrm.getRed().addActionListener(this);
        mainFrm.getGreen().addActionListener(this);
        mainFrm.getBlue().addActionListener(this);
        mainFrm.getAlap().addActionListener(this);              
    }

    private void start(){
        mainFrm.setVisible(true);        
    }

    public void actionPerformed(ActionEvent event) {
        
        if (event.getSource()==mainFrm.getExitBtn()){
            System.exit(0);
        }else if(event.getSource()==mainFrm.getRed()){
            mainFrm.setCentralJPanel(Color.RED);
        }else if(event.getSource()==mainFrm.getGreen()){
            mainFrm.setCentralJPanel(Color.GREEN);
        }else if(event.getSource()==mainFrm.getBlue()){
            mainFrm.setCentralJPanel(Color.BLUE);
        }else if(event.getSource()==mainFrm.getAlap()){
            mainFrm.setCentralJPanel(Color.GRAY);
        }
    }
    
}

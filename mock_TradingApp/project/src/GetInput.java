
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GetInput extends Frame{ //reference QMUL taken from lab 5

    private Button submit;
    
    public GetInput(){
	this.setLayout(new GridLayout(0,2));
	submit = new Button("Submit");
	submit.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		    dispose();
		}
	    });
	this.addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent evt) {
		    ((Frame)(evt.getSource())).dispose();
		}
	    });	
    }

    public void addSubmitListener(ActionListener listener){
	submit.addActionListener(listener);
    }    

    public void activate(){	
        this.add(submit);
	this.pack(); // Resizes to tightly fit all its components
	this.setVisible(true);
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TempConversionWindow extends JFrame implements ActionListener{ 
    private Container pane;
    private JTextField t;
    private JLabel l;
    private JButton b1,b2;

    public static double FtoC(double input){
	return (input - 32) * (5.0 / 9.0);
    }

    public static double CtoF(double input){
	return (input * (9.0 / 5.0) + 32);
    }
    
    public TempConversionWindow(){
	this.setTitle("Super Conversion");
	this.setSize(600,400);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	pane = this.getContentPane();
	pane.setLayout(new GridBagLayout());
	GridBagConstraints c = new GridBagConstraints();

	c.fill = GridBagConstraints.HORIZONTAL;
	c.gridx = 1;
	c.gridy = 0;
	t = new JTextField();
	

        b1 = new JButton("C to F");
	b1.addActionListener(this);
	b1.setActionCommand("From Celcius");
	
	b2 = new JButton("F to C");
	b2.addActionListener(this);
	b2.setActionCommand("From Fahrenheit");
	
    }

    
    

    public static void main(String[]args){
        TempConversionWindow go = new TempConversionWindow();
	

	
    }

    
}

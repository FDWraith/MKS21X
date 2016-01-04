import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TempConversionWindow extends JFrame implements ActionListener{ 
    private Container pane;
    private JTextField t;
    private JLabel l1,l2;
    private JButton b1,b2;

    public static double FtoC(double input){
	return (input - 32) * (5.0 / 9.0);
    }

    public static double CtoF(double input){
	return (input * (9.0 / 5.0) + 32);
    }
    
    public TempConversionWindow(){
	this.setTitle("Super Conversion");
	this.setSize(600,100);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	pane = this.getContentPane();
	pane.setLayout(new GridBagLayout());
	GridBagConstraints c = new GridBagConstraints();

	c.fill = GridBagConstraints.HORIZONTAL;
	c.gridwidth = 2;
	c.gridheight = 1;
	c.gridx = 0;
	c.gridy = 0;
	c.anchor = GridBagConstraints.CENTER;
	c.weightx = 0.5;
	t = new JTextField(18);
	pane.add(t,c);

	c.fill = GridBagConstraints.HORIZONTAL;
	c.gridwidth = 1;
	c.gridheight = 1;
	c.gridx = 2;
	c.gridy = 0;
	c.anchor = GridBagConstraints.FIRST_LINE_START;
	c.weightx = 0.3;
        b1 = new JButton("C to F");
	b1.addActionListener(this);
	b1.setActionCommand("From Celcius");
	pane.add(b1,c);

	c.fill = GridBagConstraints.HORIZONTAL;
	c.gridwidth = 1;
	c.gridheight = 1;
	c.gridx = 2;
	c.gridy = 1;
	c.anchor = GridBagConstraints.FIRST_LINE_START;
	c.weightx = 0.3;
	b2 = new JButton("F to C");
	b2.addActionListener(this);
	b2.setActionCommand("From Fahrenheit");
	pane.add(b2,c);

	c.fill = GridBagConstraints.HORIZONTAL;
	c.gridwidth = 1;
	c.gridheight = 1;
	c.gridx = 0;
	c.gridy = 1;
	c.anchor = GridBagConstraints.CENTER;
	c.weightx = 0.4;
	l1 = new JLabel("Output: ");
	pane.add(l1,c);

	c.fill = GridBagConstraints.HORIZONTAL;
	c.gridwidth = 1;
	c.gridheight = 1;
	c.gridx = 1;
	c.gridy = 1;
	c.anchor = GridBagConstraints.CENTER;
	c.weightx = 0.4;
	l2 = new JLabel("");
	pane.add(l2,c);
	
    }

    public void actionPerformed(ActionEvent e){
	String event = e.getActionCommand();
	if(!checkString(t.getText())){
	    l2.setText("Please input numbers!");
	    return;
	}
	double input = Double.parseDouble(t.getText());
	if(event.equals("From Fahrenheit")){
	    l2.setText(Math.round(FtoC(input)*100.0)/100.0+" C");
	}
	if(event.equals("From Celcius")){
	    l2.setText(Math.round(CtoF(input)*100.0)/100.0+" F");
	}
    }

    public static boolean checkString(String input){
	for(int i=0;i<input.length();i++){
	    if(!(Character.isDigit(input.charAt(i)))){
		return false;
	    }
	}
	return true;
    }

    public static void main(String[]args){
        TempConversionWindow go = new TempConversionWindow();
	go.setVisible(true);

	
    }

    
}

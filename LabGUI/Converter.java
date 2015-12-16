import javax.swing.*;
import java.awt.*;

public class Converter extends JFrame implements ActionListener{ 
    private Container pane;
    private JTextField t;
    private JLabel l;

    public static double FtoC(double input){
	return (input - 32) * (5.0 / 9.0);
    }

    public static double CtoF(double input){
	return (input * (9.0 / 5.0) + 32);
    }
    
    public Converter(){
	this.setTitle("Super Conversion");
	this.setSize(600,400);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[]args){

    }

    
}

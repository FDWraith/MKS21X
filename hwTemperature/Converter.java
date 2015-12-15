import javax.swing.*;
import java.awt.*;

public class Converter extends JFrame implements ActionListener{ 
    public static double FtoC(double input){
	return (input - 32) * (5.0 / 9.0);
    }

    public static double CtoF(double input){
	return (input * (9.0 / 5.0) + 32);
    }

    public static void main(String[]args){
	
	

    }

    
}

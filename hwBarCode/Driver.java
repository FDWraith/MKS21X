public class Driver{
    public static void main(String[]args){
	BarCode b1 = new BarCode("11365");
	System.out.println(b1);
	BarCode b2 = new BarCode("11363");
	System.out.println(b2);
	System.out.println(b1.compareTo(b2));
	BarCode b3 = new BarCode(b2);
	System.out.println(b3);
	System.out.println(b3.compareTo(b2));
    }
    
}

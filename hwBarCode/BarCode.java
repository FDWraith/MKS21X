public class BarCode implements Comparable{
    private String _zip;
    private int checkDigit;
    private String bars;
    private final static String[] barCodeIdentifier = { "||:::", //0
							":::||", //1
							"::|:|", //2
							"::||:", //3
							":|::|", //4
							":|:|:", //5
							":||::", //6
							"|:::|", //7
							"|::|:", //8
							"|:|::"};//9

    public BarCode(String zip){
	if(!(check(zip))){
	    throw new RuntimeException();
	}
	_zip = zip;
	bars = "";
	int sum = 0;
	int num;
	for(int i=0;i<zip.length();i++){
	    num = Integer.parseInt(zip.substring(i,i+1));
	    sum += num;
	    bars += barCodeIdentifier[num];
	}
	checkDigit = sum % 10;
    }

    public BarCode(BarCode o){
	this._zip = o._zip;
	this.checkDigit = o.checkDigit; 
	this.bars = o.bars;
    }
    
    public String toString(){
	return computeNum()+" |"+bars+"|";
    }


    public boolean check(String zip){
	if (zip.length() != 5){
	    return false;
	}
	for(int i=0; i<zip.length();i++){
	    if(!(Character.isDigit(zip.charAt(i)))){
		return false;
	    }
	}
	return true;
    }

    public int computeNum(){
	int sum = 0;
	for(int i=0;i<_zip.length();i++){
	    sum += Integer.parseInt(_zip.substring(i,i+1)) * (Math.pow(10,_zip.length()-i));
	}
	return sum += checkDigit;
	
    }

    
    public int compareTo(Object other){
	if(other instanceof BarCode){
	    return (this.computeNum() - (((BarCode)(other)).computeNum()));
	}
	return 0;
    }

}

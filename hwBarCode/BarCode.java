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
							"|:|::" }//9

    public BarCode(String zip){
	if(!(check(zip))){
	    throw(RunTimeException e);
	}
	_zip = zip;
	int sum = 0;
	for(int i=0;i<zip.length();i++){
	    sum += Integer.parseInt(zip.substring(i,i+1));
	    bars += barCodeIdentifier
	}
	checkDigit = sum % 10;
    }

    public BarCode(Barcode o){
	this._zip = o._zip;
	this.checkDigit = o.checkDigit; 
	this.bars = o.bars;
    }
    
    public String toString(){
	return "|"+bars+"|";
    }


    public boolean check(String zip){
	if (zip.length() != 5){
	    return false;
	}
	for(int i=0; i<zip.length();i++){
	    if(!(zip.charAt(i).isDigit())){
		return false;
	    }
	}
	return true;
    }

}
public class BarCode implements Comparable{
    private String _zip;
    private int checkDigit;
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
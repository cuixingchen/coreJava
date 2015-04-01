package day10.tarena.com;

public class TestString {
    public static String m1(String s,int length){
    	/*if(s.length()>=length){
    		return s;
    	}else{
    		for(int i=0;i<length-s.length();i++){
    			s = s+" ";
    		}
    		return s;
    	}*/
    	for(int i=0;i<length-s.length();i++){
			s = s+" ";
		}
		return s;
    }
    public static String m2(String s){
    	int index = s.indexOf("@");
    	if(index!=-1){
    		return s.substring(0,index);
    	}else{
    		return null;
    	}
    }   
	public static void main(String[] args) {
		
	}

}

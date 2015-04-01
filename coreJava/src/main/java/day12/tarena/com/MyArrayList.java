package day12.tarena.com;

public class MyArrayList {
	private Object[] obj;
	private int num = 0;
	public MyArrayList(){
		this(10);
	}
	public MyArrayList(int length){
		if(length>0){
		    obj = new Object[length];
		}else{
			throw new 
			  NegativeArraySizeException("长度不能为负数");
		}
	}
    public void add(Object ob){
    	if(num>=obj.length){
    		Object[] old = obj;
    		obj = new Object[num*2];
    		System.arraycopy(old,0,obj,0,old.length);
    	}
    	obj[num] = ob;
    	num++;
    }
    public void remove(int index){
    	if(index>=0 && index<num){
    		for(int i=index;i<num-1;i++){
    			obj[i] = obj[i+1];
    		}
    		num--;
    	}
    }
    public Object get(int index){
    	if(index>=0 && index<num){
    	    return obj[index];
    	}else{
    		return null;
    	}
    }
    public int size(){
    	return num;
    }
}

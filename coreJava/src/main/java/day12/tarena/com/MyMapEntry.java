package day12.tarena.com;

public class MyMapEntry {
    private Object key;
    private Object value;
    public MyMapEntry(Object key,Object value){
    	this.setKey(key);
    	this.setValue(value);
    }
    @Override
    public boolean equals(Object obj){
    	if(obj == null) return false;
    	else if(obj instanceof MyMapEntry){
    		MyMapEntry mma = (MyMapEntry)obj;
    		if(this.key == null) return false;
    		return this.key.equals(mma.key);
    	}
    	return false;
    	
    }
    @Override
    public int hashCode(){
    	int type = 41;
    	if(this.key == null) return type * 97;
    	return type * 97 + this.key.hashCode();
    }
	public Object getKey() {
		return key;
	}
	public void setKey(Object key) {
		this.key = key;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
}

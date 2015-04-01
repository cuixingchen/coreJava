package day11.tarena.com;

public class MyGen<G> {//G代表任意一种引用类型
    private Object obj;
    private G g;
    public static void main(String[] args) {
    	MyGen mg1 = new MyGen();
    	mg1.setObj("zhang");
    	Object obj = mg1.getObj();
    	if(obj instanceof String){
    	    String s = (String)obj;
    	}
//泛型可以规范参数类型，避免强制类型转换    	
    	MyGen<String> mg2 = new MyGen<String>();
    	mg2.setG("zhang");
    	String s2 = mg2.getG();
	}
	public G getG() {
		return g;
	}
	public void setG(G g) {
		this.g = g;
	}
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}

	

}

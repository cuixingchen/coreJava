package day16.tarena.com;

public class LitStudent extends Student {
	public LitStudent() {
		super();
	}
	public LitStudent(int id, String name) {
		super(id,name);
	}
	/*@Override
	public boolean equals(Object obj){
		if(obj == null) return false;
		else if(obj instanceof LitStudent){
			LitStudent s = (LitStudent)obj;
			return s.getId() == this.getId();
		}
		return false;
	}
	@Override
	public int hashCode(){
		int type = 43;
		return type * 47 + this.getId();
	}*/
}

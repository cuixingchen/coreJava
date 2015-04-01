package day8.tarena.com.cr;

public class ClassRoom {
    private String cid;
    private final int num;
    private Student[] st;
    private static Teacher t;
    public static final Admin A = new Admin("’‘‘∆",30,2500);
    public ClassRoom(int num){
    	if(num<0){
    		System.out.println("Num¥ÌŒÛ");
    		this.num = 0;
    	}else{
    		this.num = num;
    		st = new Student[num];
    	}
    }
	public static Teacher getT() {
		return t;
	}
	public static void setT(Teacher t) {
		ClassRoom.t = t;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public Student[] getSt() {
		return st;
	}
}

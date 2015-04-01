package day12.tarena.com;
import java.util.Set;
import java.util.HashSet;
public class MyHashMap{
    private Set<MyMapEntry> set = new HashSet<MyMapEntry>();
    public MyHashMap(){}
    public void put(Object key,Object value){
    	MyMapEntry mme = new MyMapEntry(key,value);
    	if(set.contains(mme)){
    		set.remove(mme);
    	}
    	set.add(mme);
    }
    public void remove(Object key){
    	set.remove(new MyMapEntry(key,null));
    }
    public Set entrySet(){
    	return set;
    }
    public int size(){
    	return set.size();
    }
}

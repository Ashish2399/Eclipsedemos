import java.util.*;

 import java.util.Map.Entry;
public class TreeMapclass {
	public static void main(String args[]){
		TreeMap<Integer, String> map=new TreeMap<Integer, String>();
		map.put(2019901, "Amber");
		map.put(2019902, "james");
		map.put(2019903,"Violet");
		map.put(2019904, "Reynolds");
		
		for (Iterator<Entry<Integer, String>> iterator = map.entrySet().iterator(); 
				iterator.h;
		Iterator<Entry<Integer, String>> iterator;
		Entry<Integer, String>m =iterator.next();
		 System.out.println(m.getKey()+" "+m.getValue());
		}
}
}

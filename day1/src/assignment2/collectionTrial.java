package assignment2;
import java.util.*;


public class collectionTrial {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("foo");
		list.add("faa");
		list.add("fii");
		
		System.out.println(list);
//		Collections.sort(list);
//		System.out.println(list);
//		int index = Collections.binarySearch(list, "auu");
//		System.out.println(index);
		
		//iterator
//		Iterator<String> it= list.iterator();
//		while(it.hasNext()) {
//			String data = it.next();
//			it.remove();
//			System.out.println(data);
//		}
//		System.out.println(list);
		
		//list iterator
		listIterator<String> it = list.listIterator(list.getLast());
				
		
		// java 8 stream processing
		
	}
}

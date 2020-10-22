import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Hello {
	
	
	

	public static void Display(List<String> list) {
		
		Iterator<String> iterator=list.iterator();
		
		while(iterator.hasNext()) {
			System.out.println("Element is"+iterator.next());
		}
	}
	public static void main(String[] args) {
		List<String> countries =new LinkedList<>();
		countries.add("India");
		countries.add("pakistan"); 
		countries.add("USA");
		Collections.reverse(countries);
		
		int result = countries.get(2).compareTo("USA");
		System.out.print(result);
		
	}

}

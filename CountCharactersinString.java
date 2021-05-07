import java.util.HashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountCharactersinString {

	public static void main(String[] args) {
		String str = "Hello World!";
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		char[] chars = str.toCharArray();
		
		for(char ch : chars) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else {
				map.put(ch, 1);
			}
		}
		
		//map.entrySet().stream().map(e -> e.getKey()+ ": "+e.getValue()).forEach(System.out::println);
		
		
		Stream
		.of(str.split(" "))
		.flatMap(tempString -> tempString.chars().mapToObj(ch -> (char) ch))
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		.entrySet()
		.stream()
		.map(e -> e.getKey()+" "+e.getValue())
		.forEach(System.out::println);
				
	}

}

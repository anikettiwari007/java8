import java.util.HashMap;

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
		
		map.entrySet().stream().map(e -> e.getKey()+ ": "+e.getValue()).forEach(System.out::println);
	}

}

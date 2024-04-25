package ArrayListConcept;

import java.util.HashMap;

public class CountCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Utkarsh Patil";
		
		char charName[]=name.toCharArray();
		
		HashMap<Character,Integer> countMap=new HashMap<>();
		
		for(char c:charName) {
			
			if(countMap.containsKey(c)) {
				countMap.put(c,countMap.get(c)+1);
			}
			else {
				countMap.put(c,1);
			}
		}
		System.out.println(countMap);

	}

}

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class VowelCount {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a sentence");
		String strng = input.nextLine();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		System.out.println(vowelCount(strng));
	}
	public static HashMap<Character, Integer> vowelCount(String strng){
		int counta=0,counte=0,counti=0,counto=0,countu=0;
		strng = strng.toLowerCase();
		for(int i = 0; i < strng.length();i++){
			if(strng.charAt(i)=='a')
				counta++;
			else if(strng.charAt(i)=='e')
				counte++;
			else if(strng.charAt(i)=='i')
				counti++;
			else if(strng.charAt(i)=='o')
				counto++;
			else if(strng.charAt(i)=='u')
				countu++;
		}
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		hm.put('a', counta);
		hm.put('e', counte);
		hm.put('i', counti);
		hm.put('o', counto);
		hm.put('u', countu);
		return hm;
	}
}

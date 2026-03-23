import  java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		Map<Character,Integer> hm=new TreeMap<>();
		int max=0;
		for(int i=0; i<str.length(); i++) {
			if(hm.containsKey(str.charAt(i))) {
				hm.put(str.charAt(i),hm.get(str.charAt(i))+1);
				if(max<hm.get(str.charAt(i))) {
					max=hm.get(str.charAt(i));
				}

			}
			else {
				hm.put(str.charAt(i),1);
			}
		}
		int c=max;
		int r=hm.size();


		for(Map.Entry<Character,Integer> i:hm.entrySet()) {
			for(int k=0; k<i.getValue(); k++) {
				System.out.print(i.getKey());
			}
			if(i.getValue()<max) {
				for(int j=0; j<max-i.getValue(); j++) {
					System.out.print("*");
				}
			}
			System.out.println();

		}

	}
}

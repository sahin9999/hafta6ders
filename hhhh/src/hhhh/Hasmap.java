package hhhh;

import java.util.HashMap;
import java.util.LinkedList;

public class Hasmap {

	public static void main(String[] args) {
		LinkedList<String> cars=new LinkedList<String>();
		HashMap<String,Integer> people = new HashMap<String,Integer>();
		people.put("sahin",25);
		people.put("ahmet",30);
		people.put("mehmet",35);
		for(String i:people.keySet()){
			System.out.println("key: "+ i +" Value: "+people.get(i));
		}
		cars.add("Volvo");
		cars.add("Mersedes");
		cars.add("Ford");
		cars.add(1,"Mazda");
		String a=cars.get(1);
		
		if(a=="Mazda"){
			System.out.println("Eşitlik sağlandı");
		}else if(a.equals(cars.get(1))){
			System.out.println("equals saglandi");
		}else
			System.out.println("Esitlik saglanamadi");
		
		try{
			int[] dizi={1,2,3};
			System.out.println(dizi[10]);
			System.out.println("Buraya ulasti");
		}catch(Exception e){
			System.out.println("Bir seyler yanlıs gidiyor dikkatli olllll");
		}
	}

}
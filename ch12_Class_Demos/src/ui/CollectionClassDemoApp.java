package ui;

import java.util.*;

public class CollectionClassDemoApp {

	public static void main(String[] args) {
		System.out.println("Collections!!!");

		// p.389
		List<String> names = new ArrayList<>();
		names.add("Dylan");
		names.add("Linda");
		names.add("Michelle");
		names.add("Seth");
		names.add("Nick");
		names.add("Matt");

		System.out.println(names);

		for (String s : names) {
			System.out.println(s);
		}
		// add Kevin to the middle of the list
		names.add(3, "Kevin");
		System.out.println(names);

		System.out.println("names size: " + names.size());
		
		System.out.println("get the 5th position: "+names.get(5));
		
		//integers
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(5);
		numbers.add(20);
		numbers.add(17);
		numbers.add(3);
		
		System.out.println(numbers);
		
		//pp. 390-391
		
		System.out.println("names contains Kevin?"+names.contains("Kevin"));
		
		System.out.println("Kevin's index? "+names.indexOf("Kevin"));
		System.out.println("Replace Kevin! "+names.set(3, "Newbie"));
		System.out.println(names);
		
		//add test to end
		names.add("Test");
		System.out.println(names);
		names.remove(names.size()-1);
		System.out.println(names);
		names.remove("Newbie");
		System.out.println(names);
		names.add("Sean");
		System.out.println(names);
		
		System.out.println("--Sort the List--");
		Collections.sort(names);
		System.out.println(names);
		
		
		// pp. 408-411
		// create a hashmap of months
		Map<String, String> monthsMap = new HashMap<>();
		monthsMap.put("Jan", "January");
		monthsMap.put("Feb", "February");
		monthsMap.put("Mar", "March");
		monthsMap.put("Apr", "April");
		monthsMap.put("May", "May");
		monthsMap.put("Jun", "June");
		monthsMap.put("Jul", "July");
		monthsMap.put("Aug", "August");
		monthsMap.put("Sep", "September");
		monthsMap.put("Oct", "October");
		monthsMap.put("Nov", "November");
		monthsMap.put("Dec", "December");
		monthsMap.put("XXX", "Test");
			
		System.out.println(monthsMap.containsKey("Nov"));
		System.out.println(monthsMap.containsKey("123"));
		System.out.println("The current month is "+monthsMap.get("Jun"));
		
		System.out.println(monthsMap);
		
		monthsMap.remove("XXX");
		System.out.println(monthsMap);
	
		
		System.out.println("Month   Name");
		System.out.println("=====   ===========");
		for (Map.Entry<String, String> entry: monthsMap.entrySet()) {
			System.out.println(entry.getKey()+"     "+entry.getValue());
		}
		
		
		System.out.println("Good Bye!");
	}

}

package ui;

import java.lang.reflect.Field;

import business.Person;

public class ReflectionApp {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		// https://www.baeldung.com/java-reflection
		
		Object person = new Person("Bill Smith", 35);
		Field[] fields = person.getClass().getDeclaredFields();
		
		for (Field field: fields) {
			System.out.println("Field name = "+field.getName());
			System.out.println("Field toString(): "+field.toString());
		}
	}
}
//		
//		System.out.println("name field: ");
//		Field f1 = person.getClass().getField("name");
//		System.out.println("name type = " +f1.getType().getName());
//
//	}



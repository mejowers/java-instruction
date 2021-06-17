package ui;

public class EmailCreatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Email Creator!");
		System.out.println();
				
		String[] csv = {"   james   ,butler,jbutler@gmail.com",
                "Josephine,Darakjy,Josephine_Darakjy@darakjy.org",
                "ART,VENERE,ART@VENERE.ORG"};

		String template = 
			    "To:      {email}\n" +
			    "From:    noreply@deals.com\n" +
			    "Subject: Deals!\n\n" +
			    "Hi {first_name},\n\n" +
			    "We've got some great deals for you. Check our website!";

		

		
		
		System.out.println();
		System.out.println("We look forward to seeing you on the website!");
	}

}

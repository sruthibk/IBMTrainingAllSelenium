package basics;

import org.junit.Test;

public class ValidationExample {
	
	@Test
	public void verifyAppTitle() {
		System.out.println("hii");
		
	String actualApplicationTitle="";
	String expectedApplicationTitle="Amazon.in : iphone 15 ";
	
	if(actualApplicationTitle.equals(expectedApplicationTitle)) {
		System.out.println("Strings are equal"+ actualApplicationTitle);
		
	}
	else {
		System.out.println("Strings are Not Equal"+expectedApplicationTitle);
	}
	}

}

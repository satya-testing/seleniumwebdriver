package JavaPrograms;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateRandomNum {

	public static void main(String[] args) {
		
		Random rand = new Random();
			
			System.out.println(rand.nextInt(100));
			//for decimal
			System.out.println(Math.random());
			
			
			//add lang api jar files
			//5 - 5 digit number like otp
			String randnum = RandomStringUtils.randomNumeric(5);
			System.out.println(randnum);
			
			//random string
			String randString = RandomStringUtils.randomAlphabetic(6);
			System.out.println(randString);
			
	}

}

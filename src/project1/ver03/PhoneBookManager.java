package project1.ver03;

import java.util.Scanner;

public class PhoneBookManager
{
	
	private PhoneInfo[] myInfo;
	private int numOfInfo;

	public PhoneBookManager (int num) {
		
		myInfo = new PhoneInfo[num];
		numOfInfo = 0;
		
	}
	
	public void dataInfut(int choice) {
		
		Scanner scan = new Scanner(System.in);
		String name,phoneNumber, birthday;
		System.out.print("이름: ");
		name = scan.nextLine();
		System.out.print("전화번호: ");
		phoneNumber = scan.nextLine();
		System.out.print("생일" );
		birthday = scan.nextLine();
		
		
        //myInfo[numOfInfo++] =

		
	}

	
}

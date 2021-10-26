package project1.ver02;

import java.util.Scanner;

public class PhoneInfo
{
	public static void menuShow()
	{
		System.out.println("###선택하세요###");
		System.out.print("1.입력");
		System.out.print("프로그램종료");
	}

	String name;// 이름
	String phoneNumber;// 전화번호
	String birthday; // 생년월일
	// 3개의 매개변수를 가진 생성자
	public Object showAllData;

	public PhoneInfo(String name, String phoneNumber, String birthday)
	{
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
	}

	public PhoneInfo(String name, String phoneNumber)
	{
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthday = "입력되지않음";
	}

	public void showPhoneInfo()
	{

		System.out.println("이름:" + name);
		System.out.println("전화번호:" + phoneNumber);
		System.out.println("생년월일:" + birthday);
	}

	public class PhoneInfoHandler
	{

		// 멤버변수
		private PhoneInfo[] myInfo;
		private int numOfInfo;

		public PhoneInfoHandler(int num)
		{
			myInfo = new PhoneInfo[num];
			numOfInfo = 0;
		}

		public void addPhoneInfo(int choice)
		{
			Scanner scan = new Scanner(System.in);

			String name, phoneNumber, birthday;
			System.out.print("이름:");
			name = scan.nextLine();
			System.out.print("전화번호:");
			phoneNumber = scan.nextLine();
			System.out.print("생일:");
			birthday = scan.nextLine();

			if (choice == 1)
			{
				System.out.print("이름: ");
				name = scan.nextLine();
				
				System.out.print("전화번호: ");
				phoneNumber = scan.nextLine();
				
				System.out.print("생일: ");
				birthday = scan.nextLine();
				
				PhoneInfo Info = new PhoneInfo(name, phoneNumber, birthday);
				myInfo[numOfInfo++] = Info;

			} else if (choice == 2)
			{
				System.out.print("프로그램 종료");
			}
		}

		public void showAllData()
		{
			for(int i=0; i<numOfInfo; i++) {
				myInfo[i].showPhoneInfo();
			}
			System.out.println("전체 정보를 출력하였습니다.");
		}
	}

}

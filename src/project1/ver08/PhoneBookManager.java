package project1.ver08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class PhoneBookManager implements MenuItem, SubMenuItem
{
	
	HashSet<Object> obj = new HashSet<Object>(100);
	

	
	public static void printMenu() {
		System.out.println("###메뉴를 선택하세요###");
		System.out.print("1. 데이터 입력\n");
		System.out.print("2. 데이터 검색\n");
		System.out.print("3. 데이터 삭제\n");
		System.out.print("4. 주소록 출력\n");
		System.out.print("5. 프로그램 종료");
	}
	
	public void dataInput() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1번: 일반  2번 : 학교  3번 : 회사");
		int num =scan.nextInt();
		scan.nextLine();
		
		PhoneInfo obj2;
		 try
		{
			System.out.print("이름: ");
			String name = scan.nextLine();
			System.out.print("전화번호: ");
			String phoneNumber = scan.nextLine();
			
			if(num==SubMenuItem.NOMAL1) 
			{
				obj2 = new PhoneInfo(name,phoneNumber);
			}
			
			else if(num==SubMenuItem.UNIFND1) 
			{
				System.out.print("전공: ");
				String Major = scan.nextLine();
				System.out.print("학년: ");
				int Scn = scan.nextInt();
				
				PhoneSchoolInfo obj3 = new PhoneSchoolInfo(name,phoneNumber,Major,Scn);
				obj2=obj3;
			}
			
			
			else if(num==SubMenuItem.COMPFND1) 
			{
				System.out.print("회사명: ");
				String company = scan.nextLine();
				
				PhoneCompanyInfo obj3 = new PhoneCompanyInfo(name,phoneNumber,company);
				obj2=obj3;
			}
			else {
				throw new NullPointerException();
			}
			
			
			if(obj.add(obj2)==false) {
				System.out.println("같은 이름입니다");
				System.out.println("덮어쓰시겠습니까?Y(y)/N(n)");
				
				String rename = scan.nextLine();
				
				if(rename.equals("Y")||rename.equals("y")) {
					
					if(obj.contains(obj2)) {
						
						obj.remove(obj2);//
						obj.add(obj2);//추가
						System.out.println("덮어쓰기성공");
					}
					else {
						System.out.println("덮어쓰기 실패");
					}
					
				}
				else if(rename.equals("N")||rename.equals("n")) {
					System.out.println("덮어쓰기 취소");
				}
				else {
					System.out.println("잘못입력하엿습니다");
				}
			}
		}
	 catch(NullPointerException e) {}
		 
		
	}
	

		
		
	
	   
	public void dataSearch() {
		boolean isFind = false;
		Scanner scanner = new Scanner(System.in);
		System.out.print("데이터를 검색을 시작합니다.");
		String searchName = scanner.nextLine();
		
		try {
			
			Iterator itr = obj.iterator();
			
			while(itr.hasNext()) {
				PhoneInfo PhIf =(PhoneInfo)itr.next();
				
				if(PhIf.name.equals(searchName)) {
					isFind = true;
					if(PhIf instanceof PhoneCompanyInfo) {
						((PhoneCompanyInfo)PhIf).showPhoneInfo();
					}
					else if(PhIf instanceof PhoneSchoolInfo) {
						((PhoneSchoolInfo)PhIf).showPhoneInfo();
					}
					else {
						((PhoneInfo)PhIf).showPhoneInfo();
					}
				}
				
			}
		}
		catch(NullPointerException e) {
			System.out.println("==찾으시는 정보가 없습니다.");
		}
	}	
		
	public void dataDelete()	{

		boolean isFind = false;
		Scanner scan = new Scanner(System.in);
		System.out.print("삭제할 이름을 입력하세요: ");
		String deleteName = scan.nextLine();
		
		System.out.println("삭제되었습니다.");
		
		try {
			Iterator itr = obj.iterator();
			while(itr.hasNext()) {
				PhoneInfo PhIf = (PhoneInfo)itr.next();
				
				if(PhIf.name.equals(deleteName)) {
					isFind =true;
					itr.remove();
				}
			}
			if(isFind = false) {
				throw new NullPointerException();
			}
		}
		catch(NullPointerException e) {
			System.out.println("삭제할 데이터가 없습니다.");
		}
	}	
		public void showAllData() 
		{
			
			Iterator itr = obj.iterator();
			while(itr.hasNext()) 
			{
				Object object = itr.next();
				if(object instanceof PhoneCompanyInfo) 
					((PhoneCompanyInfo)object).showPhoneCompanyInfo();
					
					else if(object instanceof PhoneSchoolInfo) 
					((PhoneSchoolInfo)object).showPhoneInfo();
					
					else
						((PhoneInfo)object).showPhoneInfo();
			}
			
			
		}		
		
		
		
	}
	


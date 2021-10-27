package project1.ver03;

import java.util.Scanner;

public class PhoneBookManager
{
	
	public PhoneInfo[] myInfo;
	public int numOfInfo;

	public PhoneBookManager (int num) {
		
		myInfo = new PhoneInfo[num];
		numOfInfo = 0;
		
	}
	
	public void dataInput() {
		
		Scanner scan = new Scanner(System.in);
		String name,phoneNumber, birthday;
		System.out.print("이름: ");
		name = scan.nextLine();
		System.out.print("전화번호: ");
		phoneNumber = scan.nextLine();
		System.out.print("생일: " );
		birthday = scan.nextLine();
		
		myInfo[numOfInfo++]= new PhoneInfo(name,phoneNumber,birthday);
		
		
        

		
	}
	 public void showAllData()
	   {
	      for(int i=0; i<numOfInfo; i++) {
	         myInfo[i].showPhoneInfo();
	      }
	      System.out.println("전체 정보를 출력하였습니다.");
	   }
	public void dataSearch() {
		boolean isFind = false;
		Scanner scanner = new Scanner(System.in);
		System.out.print("데이터를 검색을 시작합니다");
		String searchName = scanner.nextLine();
		
		for(int i =0; i< numOfInfo;i++) {
			
			if(searchName.compareTo(myInfo[i].name)==0) {
				
				myInfo[i].showPhoneInfo();
			}
		}
		if(isFind==false) 
			System.out.println("###찾는 정보가 없습니다.###");
	}
	public void dataDelete()	{
		
		Scanner scan = new Scanner(System.in);
		System.out.print("삭제할 이름을 입력하세요:");
		String deleteName = scan.nextLine();
        /*
         배열의 요소 중 삭제된 요소의 인덱스값을 저장할 용도의 변수.
         요소를 삭제한 후 빈자를 채워넣을때 사용할 것임.
         배열은 인덱스이므로 초기값은 -1로 설정한다.
         */
		int deleteIndex = -1;
		
		for(int i=0; i< numOfInfo;i++) {
			if(deleteName.compareTo(myInfo[i].name)==0) {
				
				myInfo[i] =null;
				
				deleteIndex =i;
				
				numOfInfo--;
				
				break;
			}
		}
		if (deleteIndex == -1) {
			System.out.println("==삭제된 데이터가 없습니다.==");
		}
		else {
			for(int i =deleteIndex; i<numOfInfo;i++) {
				
			}
			System.out.println("==데이터("+deleteIndex+"번)가 삭제되었습니다.==");
		}
		
			
		
	}
	
}

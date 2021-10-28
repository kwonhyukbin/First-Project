package project1;

import java.util.InputMismatchException;
import java.util.Scanner;

import project1.ver07.PhoneInfo;
import project1.ver07.MenuItem;
import project1.ver07.PhoneBookManager;


public class PhoneBookVer08
{
	
   public static void main(String[] args)
   {      
     Scanner scan = new Scanner(System.in);
     
     
     PhoneBookManager man = new PhoneBookManager();
     
     while(true) {
    	 try {
    		 
    	 PhoneBookManager.printMenu();
    	 
     int choice = scan.nextInt();
     switch(choice) {
     case MenuItem.DATAINPUT://번호 입력
    	 man.dataInput();
    	 break;
     case MenuItem.DATASEARTCH:	//정보 검색
    	 man.dataSearch();
    	 break;
     case MenuItem.DATADELETE://정보 삭제
    	 man.dataDelete();
    	 break;
     case MenuItem.DATASHOW://정보 출력
    	 man.showAllData();
    	 break;
     case MenuItem.DATAEND://프로그램 종료
    	System.out.println("프로그램을 종료합니다.");
    	return;
     default :
    	 System.out.println("숫자(1~5)만 기입가능");
    	 break;

    	 
     }
    	 }
    	 catch(InputMismatchException e) {
    		 scan = new Scanner(System.in);
    		 System.out.println("숫자(1~5)만 기입 가능 문자불가");
    		 
    		 e.printStackTrace();
    	 }
     

   }
}
}
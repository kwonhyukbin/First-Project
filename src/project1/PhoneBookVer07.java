package project1;

import java.util.InputMismatchException;
import java.util.Scanner;

import project1.ver07.PhoneInfo;
import project1.ver07.MenuItem;
import project1.ver07.PhoneBookManager;


public class PhoneBookVer07
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
     case MenuItem.DATAINPUT:
    	 man.dataInput();
    	 break;
     case MenuItem.DATASEARTCH:	
    	 man.dataSearch();
    	 break;
     case MenuItem.DATADELETE:
    	 man.dataDelete();
    	 break;
     case MenuItem.DATASHOW:
    	 man.showAllData();
    	 break;
     case MenuItem.DATAEND:
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
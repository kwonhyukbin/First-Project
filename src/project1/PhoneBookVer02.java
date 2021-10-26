package project1;

import java.util.Scanner;

import project1.ver02.PhoneInfo;

public class PhoneBookVer02
{
	
   public static void main(String[] args)
   {      
      Scanner scan = new Scanner(System.in);
      String name,PNum,Birth;
   
      while(true) 
      {
         System.out.println("######## 메뉴를 입력하세요 ########");
         System.out.print("1.데이터 입력 ");
         System.out.print("2.데이터 검색");
         System.out.print("3.데이터 삭제");
         System.out.print("4.데이터 출력");
         System.out.println("5.프로그램 종료");
            
         int choice = scan.nextInt();
         scan.nextLine();
         if(choice==1)
         {
            System.out.print("이름 : ");
            name = scan.nextLine();
            System.out.print("전화번호 : ");
            PNum = scan.nextLine();
            System.out.print("생년월일 : ");
            Birth = scan.nextLine();
            
            
         }
         else if(choice==2)
         {
            System.out.println("프로그램 종료");
            break;
         }
      }
   }
}
package project1.ver07;

public class MenuSelectException
{

	public  void menuEx()
	{
		int choice =0;
		if(choice<1 || choice>5) {
			System.out.println("1~5까지 숫자만 입력가능");
		}
		
	}

}

package project1.ver08;

public class PhoneSchoolInfo extends PhoneInfo
{
		String Major;
		int Scn;
	
	public PhoneSchoolInfo(String name, String phoneNumber, String Major, int Scn) {
		
		super(name,phoneNumber);
		this.Major = Major;
		this.Scn = Scn;
	}
	public void showPhoneSchoolInfo()
	{
		System.out.println("이름: "+name);
		System.out.println("전화번호: "+phoneNumber);
		System.out.println("전공: "+Major);
		System.out.println("학년: "+Scn);
	}
}

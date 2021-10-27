package project1.ver05;

public class PhoneSchoolInfo extends PhoneInfo
{
		String Major;
		int Scn;
	
	public PhoneSchoolInfo(String name, String phoneNumber, String Major, int Scn) {
		
		super(name,phoneNumber);
		this.Major = Major;
		this.Scn = Scn;
	}
}

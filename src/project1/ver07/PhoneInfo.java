package project1.ver07;

import java.util.Scanner;

public class PhoneInfo
{
	String name;// 이름 
	String phoneNumber ;// 전화번호  
	//3개의 매개변수를 가진 생성자
	public PhoneInfo(String name, String phoneNumber, String birthday)
	{
		this.name = name;
		this.phoneNumber = phoneNumber;
		
	}

	public PhoneInfo(String name, String phoneNumber)
	{
		this.name = name;
		this.phoneNumber = phoneNumber;
		
	}
	public void showPhoneInfo() {
		
		System.out.println("이름:"+name);
		System.out.println("전화번호:"+phoneNumber);
		
	}
	@Override
	public int hashCode() {
		int nameHCode = this.name.hashCode();
		return nameHCode;
		
	}
	@Override
	public boolean equals(Object obj) {
		PhoneInfo ph = (PhoneInfo)obj;
		if(ph.name.equals(this.name)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	}
	


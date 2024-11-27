package com.entities;

import java.util.Objects;

public class Member {
	private int memberId;
	private String name;
	private String email;
	private String phonenumber;
	
	public Member(int memberId,String name,String email,String phonenumber)
	{
		this.memberId = memberId;
		this.name = name;
		this.email = email;
		this.phonenumber = phonenumber;
	}
	
	public int getmemberId()
	{
		return memberId;
	}
	
	public void setmemberId(int memberId)
	{
		this.memberId = memberId;
	}
	
	public String getname()
	{
		return name;
	}
	public void setname(String name)
	{
		this.name = name;
		
	}
	
	public String getemail()
	{
		return email;
	}
	
	public void setemail(String email)
	{
		this.email = email;
	}

	public String getphonenumber()
	{
		return phonenumber;
	}
	
	public void setphonenumber(String phonenumber)
	{
		this.phonenumber = phonenumber;
	}
	
	public boolean equals(Object o)
	{
		if(this == o)
			return true;
		if(o==null || getClass()!= o.getClass())
			return false;
		Member member =(Member) o;
		return memberId == member.memberId;
	}
	
	 public int hashCode() {
	        return Objects.hash(memberId);
	    }
	 
	 @Override
	    public String toString() {
	        return "Member : \n" +
	        		"=========================================" +
	                "memberId=" + memberId +
	                ", name='" + name + '\'' +
	                ", email='" + email + '\'' +
	                ", phoneNumber='" + phonenumber + '\'' ;
	    }
	 
	 

	
}

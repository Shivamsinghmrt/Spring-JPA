package com.org.capgemini.model;

public class Author1 
{
	
private int authorId;
private String	firstName;
private String	middleName;
private String	lastName;
private String	phoneNo;


@Override
public String toString() {
	return "Author [authorId=" + authorId + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName="
			+ lastName + ", phoneNo=" + phoneNo + "]";
}
public int getAuthorId() {
	return authorId;
}
public void setAuthorId(int authorId) {
	this.authorId = authorId;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getMiddleName() {
	return middleName;
}
public void setMiddleName(String middleName) {
	this.middleName = middleName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getPhoneNo() {
	return phoneNo;
}
public void setPhoneNo(String phoneNo) {
	this.phoneNo = phoneNo;
}



}

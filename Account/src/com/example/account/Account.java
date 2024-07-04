package com.example.account;
public class Account {
	public String UserName;
	private String password;
    public String FirstName;
    public String LastName;
    public String Username;
    private String Password;
    
    Account(String UserName,String password,String FirstName,String LastName,String Username,String Password){
    this.UserName = UserName;
    this.password = password;
    this.FirstName = FirstName;
    this.LastName = LastName;
    this.Username = Username;
    this.Password = Password;
    }
    public String getpassword(){
    return password;	
    }
    public void setpassword(String password){
    this.password = password;	
    }
    public String getPassword() {
    return Password;	
    }
    
    public void setPassword(String Password) {
    this.Password = Password;	
    }
    
	public Boolean checkUserName() {
	if(Username.length()<=5 && Username.contains("_")&&UserName.length()<=5&&UserName.contains("_")) {
	return true;	
	}
	return false;
	}
	public Boolean checkPasswordComplexity() {
    Boolean upperCase = false;
    Boolean digitStat = false;
    Boolean specialChar = false;
    char [] password = Password.toCharArray();
    for (int i=0;i<password.length;i++){
    char element = password[i];	
    if(Character.isUpperCase(element)) {
    upperCase = true; 	
    }
    if(Character.isDigit(element)) {
    digitStat = true;	
    }
    if(Character.isJavaIdentifierPart(element)) {
    specialChar = true;
    }}
    if(Password.length()>=8&&upperCase==true&&digitStat==true&&specialChar==true) {
    return true;	
    }
	return false;
	}
	public void registerUser() {
	if(checkUserName()==true&&checkPasswordComplexity()==true) {	
	System.out.println("User registered successfully");	
	}
	if(checkUserName()==false) {
	System.out.println("The username is incorrectly formatted");	
	}
	if(checkPasswordComplexity()==false) {
	System.out.println("The password does not meet the complexity requirements");	
	}
	}
	public Boolean LoginUser() {
	if(Username.equals(UserName)&&Password.equals(password)) {
	return true;	
	}
	return false;
	}
	public void returnLoginStatus() {
	if(LoginUser()==true) {	
	System.out.println("A successful login");
	}
	else {
	System.out.println("A failed login");
	}}
}

package com.example.login;

public class LoginClass {
	private String UserName;
	private String password;
    public String getUserName(){
    return UserName;	
    }
    public void setUserName(String UserName){
    this.UserName = UserName;	
    }
    public String getpassword(){
    return password;	
    }
    public void setpassword(String password){
    this.password = password;	
    }
    LoginClass (String UserName,String password){	
    this.UserName = UserName;
    this.password = password;
    }
}

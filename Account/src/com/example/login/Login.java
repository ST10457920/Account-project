package com.example.login;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Login 
{ 
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
    Login (String UserName,String password){	
    this.UserName = UserName;
    this.password = password;
    }
public class SignUp 
{ 
	public String Username;
	private String Password;
	public String FirstName;
	public String LastName;
	
	SignUp(String Username,String Password,String FirstName,String LastName){
		this.Username = Username;
		this.Password = Password;
		this.FirstName = FirstName;
		this.LastName = LastName;
		}
	
	public String getPassword() {
	return Password;	
	}
	public void setPassword(String Password) {
	this.Password = Password;	
	}
	
public class Task
{
    private String TaskName;
	private String TaskDescription;
	private String DeveloperDetails;
	private int TaskDuration;
    private String TaskID;
    private int TotalHours;
    public String getTaskName() {
    return TaskName;	
    }
    public void setTaskName(String TaskName) {
    this.TaskName = TaskName;	
    }
    public String getTaskDescription() {
	return TaskDescription;
	}
	public void setTaskDescription(String TaskDescription) {
	this.TaskDescription = TaskDescription;
	} 
	public String getDeveloperDetails() {
	return DeveloperDetails;	
	}
	public void setDeveloperDetails(String DeveloperDetails) {
	this.DeveloperDetails = DeveloperDetails;	
	}
	public int getTaskDuration() {
	return TaskDuration;	
	}
	public void setTaskduration(int TaskDuration) {
	this.TaskDuration = TaskDuration;	
	}
	public String getTaskID() {
	return TaskID;	
	}
	public void setTaskID(String TaskID) {
	this.TaskID = TaskID;	
	}
	public int getTotalHours() {
	return TotalHours;	
	}
	public void setTotalHours(int TotalHours) {
	this.TotalHours = TotalHours;	
	}
	Task (String TaskName,String TaskDescription,String DeveloperDetails,int TaskDuration,String TaskID,int TotalHours) {
	this.TaskName = TaskName;
	this.TaskDescription = TaskDescription;
	this.DeveloperDetails = DeveloperDetails;
	this.TaskDuration = TaskDuration;
	this.TaskID = TaskID;
	this.TotalHours = TotalHours;
	}
    public static void main(String []args){
    	JOptionPane.showMessageDialog(null,"Hello user");
    	Scanner scanner = new Scanner(System.in); 
		System.out.print("Enter your First name: ");
		String FirstName = scanner.next();
		System.out.print("Enter your Last name: ");
		String LastName = scanner.next();
		System.out.print("Create a new Username: ");
		String Username = scanner.next();
		System.out.print("Create a new Password: ");
		String Password = scanner.next();
		CreateAccount(Username,Password,FirstName,LastName);
		System.out.print("Enter Username: ");
		String UserName = scanner.next();
		System.out.print("Enter Password: ");
		String password = scanner.next();
		checkUserName(UserName);
		checkPasswordComplexity(password);
		registerUser(UserName,password);
		loginUser(Username,UserName,Password,password);
		returnLoginStatus(Username,UserName,Password,password,FirstName,LastName);
		if(UserName.equals(Username)){
		if(Password.equals(password)){
		System.out.print(" Option 1) Add tasks \n Option 2) Show report \n Option 3) Quit \n :");
		int option = scanner.nextInt();
		while(option != 3) {
		if(option == 2) {	
		System.out.print("Coming soon");
		break;
		}
		if(option == 1) {
		System.out.print("Enter the number of tasks: ");
		int TaskNumber = scanner.nextInt();
		for(int i =1;i <= TaskNumber;i++) {
		System.out.print("Enter the name of the task to be performed: ");
		String TaskName = scanner.next();
		System.out.print("Enter a short description of the task: ");
		String TaskDescription = scanner.next();
		System.out.print("Enter the first and last name of the developer assigned to the task: ");
		String DeveloperDetails = scanner.next();
		System.out.print("Enter the estimated duration of the task: ");
		int TaskDuration = scanner.nextInt();
		System.out.print("\n"+"Select the following task status: \n * To do \n * Done \n * Doing \n :");
		String TaskStatus = scanner.next();	
	    checkTaskDescription(TaskDescription);
	    createTaskID(TaskName,i,DeveloperDetails);
	    printTaskDetails(TaskName,TaskNumber,TaskDescription,DeveloperDetails,TaskDuration,TaskStatus);
	    returnTotalHours(TaskDuration);
	    System.out.println(" Option 1) Add tasks \n Option 2) Show report \n Option 3) Quit \n :");
		option = scanner.nextInt();
        }}}}}}
	private static Boolean checkTaskDescription(String TaskDescription) {
	        if(TaskDescription.length() <= 50) {
		    return true;
	        }
	        else{
	        return false;	
	        }}
	private static String createTaskID(String TaskName,int i,String DeveloperDetails) {
		   return null;
	        }
	private static void printTaskDetails(String TaskName,int TaskNumber,String TaskDescription,String DeveloperDetails,int TaskDuration,String TaskStatus) {
		    JOptionPane.showMessageDialog(null,"Task Name: "+ TaskName+"\nTask Number: "+TaskNumber+"\nTask Description: "+TaskDescription+"\nDeveloper Details: "+DeveloperDetails+"\nTask Duration: "+TaskDuration+"hrs\nTask Status: "+TaskStatus);
	        }
	private static int returnTotalHours(int TaskDuration) {
		    int TotalHours =+ TaskDuration;
		    return  TotalHours;
	        }
}
	private static void CreateAccount(String Username,String Password,String FirstName,String LastName){
            if(Username.length() <= 5){
            if(Username.contains("_")){
            System.out.println("Username successfully captured.");
            }}
            else{
            System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.");
            }
            if(Password.length() >= 8){
            if(Password.contains("A")||Password.contains("B")||Password.contains("C")||Password.contains("D")||Password.contains("E")||Password.contains("F")||Password.contains("G")||Password.contains("H")||Password.contains("I")||Password.contains("J")||Password.contains("K")||Password.contains("L")||Password.contains("M")||Password.contains("N")||Password.contains("O")||Password.contains("P")||Password.contains("Q")||Password.contains("R")||Password.contains("S")||Password.contains("T")||Password.contains("U")||Password.contains("V")||Password.contains("W")||Password.contains("X")||Password.contains("Y")||Password.contains("Z")){
            if(Password.contains("0")||Password.contains("1")||Password.contains("2")||Password.contains("3")||Password.contains("4")||Password.contains("5")||Password.contains("6")||Password.contains("7")||Password.contains("8")||Password.contains("9")){
            if(Password.contains("~")||Password.contains("`")||Password.contains("!")||Password.contains("@")||Password.contains("#")||Password.contains("$")||Password.contains("%")||Password.contains("^")||Password.contains("&")||Password.contains("*")||Password.contains("(")||Password.contains(")")||Password.contains("_")||Password.contains("-")||Password.contains("+")||Password.contains("=")||Password.contains("{")||Password.contains("[")||Password.contains("}")||Password.contains("]")||Password.contains("|")||Password.contains(";")||Password.contains(":")||Password.contains("'")||Password.contains(",")||Password.contains("<")||Password.contains(".")||Password.contains(">")||Password.contains("/")||Password.contains("?"));
            {
   	        System.out.println("Password successfully captured.");
            }}}}
            else{
            System.out.println("Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.");
            }
            System.out.println("Welcome "+FirstName+" "+LastName+" it is great to see you.");
            System.out.println();
	        }
}
	private static Boolean checkUserName(String UserName){
		    if(UserName.contains("_")){
		    if(UserName.length() <= 5){
		    return true;
		    }}
		    return false;
		    }
	private static Boolean checkPasswordComplexity(String password){
		    if(password.length() >= 8){
		    if(password.contains("A")||password.contains("B")||password.contains("C")||password.contains("D")||password.contains("E")||password.contains("F")||password.contains("G")||password.contains("H")||password.contains("I")||password.contains("J")||password.contains("K")||password.contains("L")||password.contains("M")||password.contains("N")||password.contains("O")||password.contains("P")||password.contains("Q")||password.contains("R")||password.contains("S")||password.contains("T")||password.contains("U")||password.contains("V")||password.contains("W")||password.contains("X")||password.contains("Y")||password.contains("Z")){
		    if(password.contains("0")||password.contains("1")||password.contains("2")||password.contains("3")||password.contains("4")||password.contains("5")||password.contains("6")||password.contains("7")||password.contains("8")||password.contains("9")){
		    if(password.contains("~")||password.contains("`")||password.contains("!")||password.contains("@")||password.contains("#")||password.contains("$")||password.contains("%")||password.contains("^")||password.contains("&")||password.contains("*")||password.contains("(")||password.contains(")")||password.contains("_")||password.contains("-")||password.contains("+")||password.contains("=")||password.contains("{")||password.contains("[")||password.contains("}")||password.contains("]")||password.contains("|")||password.contains(";")||password.contains(":")||password.contains("'")||password.contains(",")||password.contains("<")||password.contains(".")||password.contains(">")||password.contains("/")||password.contains("?"));{
		   	return true;
		    }}}}
			return false;
			}	
	private static void registerUser(String UserName, String password){
		    if(UserName.length()<= 5){
		    if(UserName.contains("_")){
		    if(password.length() >= 8){
			if(password.contains("A")||password.contains("B")||password.contains("C")||password.contains("D")||password.contains("E")||password.contains("F")||password.contains("G")||password.contains("H")||password.contains("I")||password.contains("J")||password.contains("K")||password.contains("L")||password.contains("M")||password.contains("N")||password.contains("O")||password.contains("P")||password.contains("Q")||password.contains("R")||password.contains("S")||password.contains("T")||password.contains("U")||password.contains("V")||password.contains("W")||password.contains("X")||password.contains("Y")||password.contains("Z")){
			if(password.contains("0")||password.contains("1")||password.contains("2")||password.contains("3")||password.contains("4")||password.contains("5")||password.contains("6")||password.contains("7")||password.contains("8")||password.contains("9")) {
			if(password.contains("~")||password.contains("`")||password.contains("!")||password.contains("@")||password.contains("#")||password.contains("$")||password.contains("%")||password.contains("^")||password.contains("&")||password.contains("*")||password.contains("(")||password.contains(")")||password.contains("_")||password.contains("-")||password.contains("+")||password.contains("=")||password.contains("{")||password.contains("[")||password.contains("}")||password.contains("]")||password.contains("|")||password.contains(";")||password.contains(":")||password.contains("'")||password.contains(",")||password.contains("<")||password.contains(".")||password.contains(">")||password.contains("/")||password.contains("?"));
			{
			System.out.println("User registered successfully.");
			}}}}}}
		    if(UserName.length()!=5 || UserName.length()>5){
		    if(!UserName.contains("_"))
		    {	
		    System.out.println("Username is incorrectly formatted.");
		    }}
		    if(password.length()!= 8||password.length()<8){
			if(!password.contains("A")||!password.contains("B")||!password.contains("C")||!password.contains("D")||!password.contains("E")||!password.contains("F")||!password.contains("G")||!password.contains("H")||!password.contains("I")||!password.contains("J")||!password.contains("K")||!password.contains("L")||!password.contains("M")||!password.contains("N")||!password.contains("O")||!password.contains("P")||!password.contains("Q")||!password.contains("R")||!password.contains("S")||!password.contains("T")||!password.contains("U")||!password.contains("V")||!password.contains("W")||!password.contains("X")||!password.contains("Y")||!password.contains("Z")){
			if(!password.contains("0")||!password.contains("1")||!password.contains("2")||!password.contains("3")||!password.contains("4")||!password.contains("5")||!password.contains("6")||!password.contains("7")||!password.contains("8")||!password.contains("9")) {
			if(!password.contains("~")||!password.contains("`")||!password.contains("!")||!password.contains("@")||!password.contains("#")||!password.contains("$")||!password.contains("%")||!password.contains("^")||!password.contains("&")||!password.contains("*")||!password.contains("(")||!password.contains(")")||!password.contains("_")||!password.contains("-")||!password.contains("+")||!password.contains("=")||!password.contains("{")||!password.contains("[")||!password.contains("}")||!password.contains("]")||!password.contains("|")||!password.contains(";")||!password.contains(":")||!password.contains("'")||!password.contains(",")||!password.contains("<")||!password.contains(".")||!password.contains(">")||!password.contains("/")||!password.contains("?"));
			{
			System.out.println("Password does not meet the complexity requirements.");
			}}}}}
	private static Boolean loginUser(String Username,String UserName,String Password,String password){
		    if(UserName.length()<= 5){
	        if(UserName.contains("_")){
	        if(password.length() >= 8){
		    if(password.contains("A")||password.contains("B")||password.contains("C")||password.contains("D")||password.contains("E")||password.contains("F")||password.contains("G")||password.contains("H")||password.contains("I")||password.contains("J")||password.contains("K")||password.contains("L")||password.contains("M")||password.contains("N")||password.contains("O")||password.contains("P")||password.contains("Q")||password.contains("R")||password.contains("S")||password.contains("T")||password.contains("U")||password.contains("V")||password.contains("W")||password.contains("X")||password.contains("Y")||password.contains("Z")){
		    if(password.contains("0")||password.contains("1")||password.contains("2")||password.contains("3")||password.contains("4")||password.contains("5")||password.contains("6")||password.contains("7")||password.contains("8")||password.contains("9")) {
	        if(password.contains("~")||password.contains("`")||password.contains("!")||password.contains("@")||password.contains("#")||password.contains("$")||password.contains("%")||password.contains("^")||password.contains("&")||password.contains("*")||password.contains("(")||password.contains(")")||password.contains("_")||password.contains("-")||password.contains("+")||password.contains("=")||password.contains("{")||password.contains("[")||password.contains("}")||password.contains("]")||password.contains("|")||password.contains(";")||password.contains(":")||password.contains("'")||password.contains(",")||password.contains("<")||password.contains(".")||password.contains(">")||password.contains("/")||password.contains("?"));{
            if(UserName.equals(Username)){
            if(Password.equals(password)){
            return true;
            }}}}}}}}
            return false;
            }
	private static void returnLoginStatus(String Username,String UserName,String Password,String password,String FirstName,String LastName){
		    if(UserName.length()<= 5){
            if(UserName.contains("_")){
		    if(password.length() >= 8){
		    if(password.contains("A")||password.contains("B")||password.contains("C")||password.contains("D")||password.contains("E")||password.contains("F")||password.contains("G")||password.contains("H")||password.contains("I")||password.contains("J")||password.contains("K")||password.contains("L")||password.contains("M")||password.contains("N")||password.contains("O")||password.contains("P")||password.contains("Q")||password.contains("R")||password.contains("S")||password.contains("T")||password.contains("U")||password.contains("V")||password.contains("W")||password.contains("X")||password.contains("Y")||password.contains("Z")){
			if(password.contains("0")||password.contains("1")||password.contains("2")||password.contains("3")||password.contains("4")||password.contains("5")||password.contains("6")||password.contains("7")||password.contains("8")||password.contains("9")) {
			if(password.contains("~")||password.contains("`")||password.contains("!")||password.contains("@")||password.contains("#")||password.contains("$")||password.contains("%")||password.contains("^")||password.contains("&")||password.contains("*")||password.contains("(")||password.contains(")")||password.contains("_")||password.contains("-")||password.contains("+")||password.contains("=")||password.contains("{")||password.contains("[")||password.contains("}")||password.contains("]")||password.contains("|")||password.contains(";")||password.contains(":")||password.contains("'")||password.contains(",")||password.contains("<")||password.contains(".")||password.contains(">")||password.contains("/")||password.contains("?"));{
            if(UserName.equals(Username)){
	        if(Password.equals(password)){
	        System.out.println("A successful login.");
	        System.out.println("Welcome "+FirstName+" "+LastName+" it is great to see you again.");
	        System.out.println("\n"+"Welcome to EasyKanban");
	        }}}}}}}}
            if(!UserName.equals(Username)){
            if(!Password.equals(password)){	
	        System.out.println("A failed login.");
	        System.out.println("Username or password incorrect, please try again.");
            }}
	        if(UserName.equals(Username)){
            if(!Password.equals(password)){	
            System.out.println("A failed login.");
            System.out.println("Username or password incorrect, please try again.");
            }}
	        if(!UserName.equals(Username)){
	        if(Password.equals(password)){	
		    System.out.println("A failed login.");
		    System.out.println("Username or password incorrect, please try again.");
	        }}
	        if(UserName.length()!=5){
	        if(!UserName.contains("_")){
	        if (password.length()!= 8){
		    if(!password.contains("A")||!password.contains("B")||!password.contains("C")||!password.contains("D")||!password.contains("E")||!password.contains("F")||!password.contains("G")||!password.contains("H")||!password.contains("I")||!password.contains("J")||!password.contains("K")||!password.contains("L")||!password.contains("M")||!password.contains("N")||!password.contains("O")||!password.contains("P")||!password.contains("Q")||!password.contains("R")||!password.contains("S")||!password.contains("T")||!password.contains("U")||!password.contains("V")||!password.contains("W")||!password.contains("X")||!password.contains("Y")||!password.contains("Z")){
		    if(!password.contains("0")||!password.contains("1")||!password.contains("2")||!password.contains("3")||!password.contains("4")||!password.contains("5")||!password.contains("6")||!password.contains("7")||!password.contains("8")||!password.contains("9")) {
		    if(!password.contains("~")||!password.contains("`")||!password.contains("!")||!password.contains("@")||!password.contains("#")||!password.contains("$")||!password.contains("%")||!password.contains("^")||!password.contains("&")||!password.contains("*")||!password.contains("(")||!password.contains(")")||!password.contains("_")||!password.contains("-")||!password.contains("+")||!password.contains("=")||!password.contains("{")||!password.contains("[")||!password.contains("}")||!password.contains("]")||!password.contains("|")||!password.contains(";")||!password.contains(":")||!password.contains("'")||!password.contains(",")||!password.contains("<")||!password.contains(".")||!password.contains(">")||!password.contains("/")||!password.contains("?"));{
		    if(UserName.equals(Username)){
			if(Password.equals(password)){
			System.out.println("A failed login.");
		    System.out.println("Username or password incorrect, please try again.");
		    }}}}}}}}}
}
	
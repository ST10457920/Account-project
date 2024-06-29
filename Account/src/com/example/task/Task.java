package com.example.task;

import javax.swing.JOptionPane;

public class Task {
	public String TaskName;
	public String TaskDescription;
	public String DeveloperDetails;
	public String TaskStatus;
	public int TaskDuration;
    public int TaskNumber;
    private String TaskID;
    
    Task (String TaskName,String TaskDescription,String DeveloperDetails,String TaskStatus,int TaskDuration,int TaskNumber) {
    	this.TaskName = TaskName;
    	this.TaskDescription = TaskDescription;
    	this.DeveloperDetails = DeveloperDetails;
    	this.TaskStatus = TaskStatus;
    	this.TaskDuration = TaskDuration;
    	this.TaskNumber = TaskNumber;
    	}
    public String getTaskID() {
    return TaskID;	
    }
    public void setTaskID(String TaskID) {
    this.TaskID = TaskID;	
    }
    
public Boolean checkTaskDescription() {
        if(TaskDescription.length() <= 50) {
        System.out.println("Task successfully captured");
        System.out.println();
        return true;
        }
        else{
        System.out.print("Please enter a task description of less than 50 characters");	
        return false;	
        }}
public String createTaskID() {
	    String FirstTwoLetters = TaskName.substring(0, 2);	
	    String LastThreeLetters = DeveloperDetails.substring(DeveloperDetails.length()-3, DeveloperDetails.length());
	    TaskID = FirstTwoLetters+":"+TaskNumber+":"+LastThreeLetters;
		return TaskID;
        }
public void printTaskDetails() {
	    JOptionPane.showMessageDialog(null,"Task Status: "+TaskStatus+"\nDeveloper Details: "+DeveloperDetails+"\nTask Number: "+TaskNumber+"\nTask Name: "+TaskName+"\nTask Description: "+TaskDescription+"\nTask Status: "+createTaskID()+"\nDuration: "+TaskDuration+"hrs");
	    }
public int returnTotalHours() {
	    int TotalHours =+ TaskDuration;
	    return  TotalHours;
        }
}

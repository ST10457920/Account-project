 package com.example.task;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class TestClassTask 
{
	public static void main(String [] args) 
	{
	    JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");
		String optionString;
		optionString = JOptionPane.showInputDialog(null," Option 1) Add tasks \n Option 2) Show report \n Option 3) Quit ");
		int option = Integer.parseInt(optionString);
		Scanner scanner = new Scanner(System.in);
		while(option != 3) 
		{ 
		  System.out.print("Enter the number of tasks: ");
		  final int i = scanner.nextInt();
		  scanner.nextLine(); 
		  String [] Developer = new String[i];
		  String [] TaskNames = new String[i];
		  String [] TaskID = new String[i];
		  int [] Taskduration = new int[i];
		  String [] Taskstatus = new String[i];
		  String TaskName;
		  String TaskDescription;
		  String DeveloperDetails;
		  int TaskDuration;
		  String TaskStatus;
		  for(int TaskNumber=0;TaskNumber<i;TaskNumber++) 
		  {
		  System.out.print("Enter the name of the task to be performed:");
		  TaskName = scanner.nextLine();
		  System.out.print("\nEnter a short description of the task:");
		  TaskDescription = scanner.nextLine();
		  System.out.print("\nEnter the first and last name of the developer assigned to the task:");
		  DeveloperDetails = scanner.nextLine();
		  System.out.print("\nEnter the estimated duration of the task:");
		  TaskDuration = scanner.nextInt();
		  System.out.print("\nSelect the following task status: \n * To_do \n * Done \n * Doing \n :");
		  TaskStatus = scanner.next();
		  Developer [TaskNumber] = DeveloperDetails; 
		  TaskNames [TaskNumber] = TaskName;
		  Taskduration [TaskNumber] = TaskDuration;
	      Taskstatus [TaskNumber] = TaskStatus;
	      Task acc = new Task(TaskName,TaskDescription,DeveloperDetails,TaskStatus,TaskDuration,TaskNumber);
		  acc.checkTaskDescription();
		  acc.createTaskID();
	      acc.printTaskDetails();
		  acc.returnTotalHours();
		  TaskID [TaskNumber] = acc.createTaskID();
		  scanner.nextLine();
	      }
		  optionString = JOptionPane.showInputDialog(null," Option 1) Add tasks \n Option 2) Show report \n Option 3) Quit");
		  option = Integer.parseInt(optionString);
		  if(option==2) 
		  {
		  JOptionPane.showMessageDialog(null,"Details for tasks with the status of done:");
		  String Done = "Done";
		  for(int TaskNumber=0;TaskNumber<i;TaskNumber++)
		  {
			if(Done.equals(Taskstatus[TaskNumber]))  
			{
			  JOptionPane.showMessageDialog(null,"Developer: "+Developer[TaskNumber]+"\nTask name: "+TaskNames[TaskNumber]+"\nTask duration "+Taskduration[TaskNumber]+"hrs");
			}
			
		  }  
		  JOptionPane.showMessageDialog(null,"Developer and duration of the class with the longest duration:");
		  int j = i;
		  for(int TaskNumber=0;TaskNumber<j;TaskNumber++)
		  { 
			if(i==1)
			{
		    JOptionPane.showMessageDialog(null,"Developer: "+Developer[0]+"\nTask duration: "+Taskduration[0]+"hrs");
		    }
			else if(Taskduration[TaskNumber]<Taskduration[TaskNumber+1])
			{
			JOptionPane.showMessageDialog(null,"Developer: "+Developer[TaskNumber+1]+"\nTask duration: "+Taskduration[TaskNumber+1]+"hrs"); 
			}
			else 
			{
			JOptionPane.showMessageDialog(null,"Developer: "+Developer[TaskNumber]+"\nTask duration: "+Taskduration[TaskNumber]+"hrs");  
			}
		  j--;
		  }
		  String TaskNameAnswer = JOptionPane.showInputDialog(null,"Search for a task using a task name:");
		  for(int TaskNumber=0;TaskNumber<i;TaskNumber++) 
		  {
			if(TaskNames[TaskNumber].equals(TaskNameAnswer))
			{
			  JOptionPane.showMessageDialog(null,"Task name: "+TaskNames[TaskNumber]+"\nDeveloper: "+Developer[TaskNumber]+"\nTask status: "+Taskstatus[TaskNumber]);
			}
	      }
		  String DeveloperAnswer = JOptionPane.showInputDialog(null,"Search for all tasks assigned to developer using developer's name: ");
		  for(int TaskNumber=0;TaskNumber<i;TaskNumber++) 
		  {
			if(Developer[TaskNumber].equals(DeveloperAnswer))
			{
			JOptionPane.showMessageDialog(null,"Task name: "+TaskNames[TaskNumber]+"\nTask Status: "+Taskstatus[TaskNumber]);	
			}
		  }  
		  String TaskAnswer = JOptionPane.showInputDialog(null,"Delete a task using the task name: ");
		  for(int TaskNumber=0;TaskNumber<i;TaskNumber++) 
		  {
			if(TaskNames[TaskNumber].equals(TaskAnswer))
			{
			Developer[TaskNumber]=null;
			TaskNames[TaskNumber]=null;
			TaskID[TaskNumber]=null;
			Taskduration[TaskNumber]=0;
			Taskstatus[TaskNumber]=null;
			}
		  }
		  for(int TaskNumber=0;TaskNumber<i;TaskNumber++) 
		  { 	  
		  JOptionPane.showMessageDialog(null,"\nReport:\nDeveloper- "+Developer[TaskNumber]+"\nTask name- "+TaskNames[TaskNumber]+"\nTask ID- "+TaskID[TaskNumber]+"\nTask duration- "+Taskduration[TaskNumber]+"hrs\nTask status- "+Taskstatus[TaskNumber]);	
		  }
		break;
		}
	  }
	} 
}


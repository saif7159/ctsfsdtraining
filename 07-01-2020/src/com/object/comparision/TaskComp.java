package com.object.comparision;

import java.time.LocalDate;

public class TaskComp {
//member variables	
private String TaskId;
private String TaskName;
private LocalDate TaskDate;
private boolean isCompleted;
//parametrized constructor created by source
public TaskComp(String taskId, String taskName, LocalDate taskDate, boolean isCompleted) {
	super();
	TaskId = taskId;
	TaskName = taskName;
	TaskDate = taskDate;
	this.isCompleted = isCompleted;
}
//Overriding equals to compare objects
@Override
public boolean equals(Object arg0) {
	// TODO Auto-generated method stub
	//return super.equals(arg0);
	TaskComp tc = null;
	boolean result = false;

	if(arg0 instanceof TaskComp)
	{
		tc = (TaskComp) arg0;
	}
	if(this.getTaskName()==tc.getTaskName()&&
	   this.getTaskDate().equals(tc.getTaskDate())&&
	   this.isCompleted()==tc.isCompleted())
	{
		
		result = true;
	}
	return result;
}
@Override
public int hashCode() {
	// TODO Auto-generated method stub
	return super.hashCode();
}
//Overriding String to directly return details
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "Task Details: \n"+"Task Name: "+TaskName+"\nTask ID: "+TaskId+"\nDate: "+TaskDate.toString()+"\nCompletion Status: "+isCompleted;
}
public String getTaskId() {
	return TaskId;
}
public void setTaskId(String taskId) {
	TaskId = taskId;
}
public String getTaskName() {
	return TaskName;
}
public void setTaskName(String taskName) {
	TaskName = taskName;
}
public LocalDate getTaskDate() {
	return TaskDate;
}
public void setTaskDate(LocalDate taskDate) {
	TaskDate = taskDate;
}
public boolean isCompleted() {
	return isCompleted;
}
public void setCompleted(boolean isCompleted) {
	this.isCompleted = isCompleted;
}


}

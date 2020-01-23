package com.listexample.todo;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


//Data class
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@EqualsAndHashCode
public class ToDo {
private String todoid;
private String todoname;
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "Task Details\nTask Name: "+getTodoname()+"\nTask ID: "+getTodoid();
}
}

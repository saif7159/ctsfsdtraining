package com.injection.annotation.todo;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Component
public class ToDo {
private String todoid;
private LocalDate tododate;
@Autowired
private Task task;
@Override
public String toString() {
	return "ToDo\nTodo ID = " + todoid + "\nTodo Date = " + tododate + "\nTask Name = " + task.getTaskname() + "\nTask Completion = " +task.isCompleted();
}

}

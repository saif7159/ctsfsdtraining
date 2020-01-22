package com.todo.hibernate.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@NoArgsConstructor

@Table(name = "TASK")
public class Task {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int taskid;
private String taskname;
private boolean isCompleted;
private String taskuid;
public Task(String taskname, boolean isCompleted, String taskuid) {
	super();
	this.taskname = taskname;
	this.isCompleted = isCompleted;
	this.taskuid = taskuid;
}

}

package com.todo.hibernate.model;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor

@Table(name = "TODO")
public class ToDo {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int todoid;
private String todoauthor;
private LocalDateTime now;
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "TASK_taskid")
private Task task;
public ToDo(String todoauthor, LocalDateTime now) {
	super();
	this.todoauthor = todoauthor;
	this.now = now;
}

}

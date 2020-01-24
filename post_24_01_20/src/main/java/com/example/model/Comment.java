package com.example.model;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Data

public class Comment {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
@Column(name = "TEXT")
private String commenttext;
private LocalDateTime time;
public Comment() {
	super();
	
}

public Comment(String commenttext, LocalDateTime time) {
	super();
	this.commenttext = commenttext;
	this.time = time;
}




}

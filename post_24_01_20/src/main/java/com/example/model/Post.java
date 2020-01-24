package com.example.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Data

public class Post {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "IMG_URL")
	private String imageurl;
	@Column(name = "POST_BY")
	private String postby;
	private LocalDate date;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "COMMENT_ID")
	private List<Comment> comment;
	
	public Post(String imageurl, String postby, LocalDate date) {
		super();
		
		this.imageurl = imageurl;
		this.postby = postby;
		this.date = date;
		
	}
	public void addComment(Comment com)
	{
		if(comment==null)
		{
			comment = new ArrayList<Comment>();
		}
		comment.add(com);
		
	}
	public Post() {
		super();
		
	}
	
	
}

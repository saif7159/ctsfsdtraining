package com.example.post_24_01_20;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.dao.EntityDao;
import com.example.dao.EntityDaoImpl;
import com.example.model.Comment;
import com.example.model.Post;

public class App 
{
    public static void main( String[] args )
    {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
        EntityDao dao = context.getBean("dao", EntityDaoImpl.class);
   
        Post p = new Post("www.unsplash.com/picid=243", "Sergio", LocalDate.now());
        Comment c1 = new Comment("one1", LocalDateTime.now());
        Comment c2 = new Comment("two2", LocalDateTime.now());
	    p.addComment(c1);
	    p.addComment(c2);
        dao.createPost(p);
    }
}

package com.cd.model;

import java.util.ArrayList;
import java.util.List;

public class UserList {
	private static List<User> list = new ArrayList<User>();
	public static void addUser(User user)
	{
		list.add(user);
		System.out.println(list);
	}
	public static List<User> getList()
	{
		return list;
	}
	
}

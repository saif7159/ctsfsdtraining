package com.listexample.todo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public class ToDoDaoImplementation implements ToDoDao {
	List<ToDo> todolist = null;
	ToDo finaltodo = null;
	ToDo todo;
	{
		todolist = new ArrayList<ToDo>();
	}
	@Override
	public void createToDo(String name) {
		// TODO Auto-generated method stub
		String[] newtodo = UUID.randomUUID().toString().split("-");
		todo = new ToDo(newtodo[0], name);
		todolist.add(todo);
	}

	@Override
	public List<ToDo> getAllToDo() {
		// TODO Auto-generated method stub
		return todolist;
	}

	@Override
	public ToDo findById(String todoid) {
		// TODO Auto-generated method stub
		ToDo tdtemp;
		//System.out.println("in");
		Iterator<ToDo> iterator = todolist.iterator();
		while(iterator.hasNext())
		{   tdtemp = iterator.next();
			//System.out.println(tdtemp.getTodoid());
			if(tdtemp.getTodoid().equals(todoid))
			{
				//System.out.println("in");
				finaltodo = tdtemp;
			}
		}
		
		return finaltodo ;
	}

	@Override
	public void removeById(String todoid) {
		/*// TODO Auto-generated method stub
		ToDo tdtemp;
		//System.out.println("in");
		Iterator<ToDo> iterator = todolist.iterator();
		while(iterator.hasNext())
		{   tdtemp = iterator.next();
			//System.out.println(tdtemp.getTodoid());
			if(tdtemp.getTodoid().equals(todoid))
			{
				//System.out.println("in");
				finaltodo = tdtemp;
				todolist.remove(finaltodo);
			}
		}*/
		todolist.remove(findById(todoid));
		
	}

	@Override
	public void removeAll() {
		// TODO Auto-generated method stub
		todolist.clear();
	}

	@Override
	public ToDo updateById(String todoid, String updatetask) {
		// TODO Auto-generated method stub
		/*ToDo tdtemp;
		//System.out.println("in");
		Iterator<ToDo> iterator = todolist.iterator();
		while(iterator.hasNext())
		{   tdtemp = iterator.next();
			//System.out.println(tdtemp.getTodoid());
			if(tdtemp.getTodoid().equals(todoid))
			{
				//System.out.println("in");
				finaltodo = tdtemp;
				finaltodo.setTodoname(updatetask);
				int index = todolist.indexOf(finaltodo);
				todolist.set(index, finaltodo);
			}
		}*/
		finaltodo = findById(todoid);
		finaltodo.setTodoname(updatetask);
		int index = todolist.indexOf(finaltodo);
		todolist.set(index, finaltodo);
		return finaltodo;
	}

}

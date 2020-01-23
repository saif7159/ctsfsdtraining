package com.jdbclayers.jdbctest;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Players implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int goals;
	private int assists;
	@Override
	public String toString() {
		return "Player's name: " + getName() + ", Goals: " + getGoals() + ", Assists:" + getAssists();
	}
	

}

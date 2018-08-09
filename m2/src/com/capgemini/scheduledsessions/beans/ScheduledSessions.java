package com.capgemini.scheduledsessions.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ScheduledSessions 
{
	//Data Members 
	@Id
	private int id;
	private String name;
	private int duration;
	private String faculty;
	private String mode;
	
	
	//No Parameter Constructor
	public ScheduledSessions() 
	{
		super();
		
	}

	//Constructor with fields
	public ScheduledSessions(int id, String name, int duration, String faculty, String mode) {
		super();
		this.id = id;
		this.name = name;
		this.duration = duration;
		this.faculty = faculty;
		this.mode = mode;
	}

	//Getters And Setters
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getDuration() {
		return duration;
	}
	
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public String getFaculty() {
		return faculty;
	}
	
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	
	public String getmode() {
		return mode;
	}
	
	public void setmode(String mode) {
		this.mode = mode;
	}

	
	//toString() method to display the objects value.
	@Override
	public String toString() {
		return "ScheduledSessions [id=" + id + ", name=" + name + ", duration=" + duration + ", faculty=" + faculty
				+ ", mode=" + mode + "]";
	}
	
	
	
	
}

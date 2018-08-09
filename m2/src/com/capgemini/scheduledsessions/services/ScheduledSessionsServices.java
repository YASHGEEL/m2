package com.capgemini.scheduledsessions.services;

import java.util.ArrayList;

import com.capgemini.scheduledsessions.beans.ScheduledSessions;
import com.capgemini.scheduledsessions.exceptions.EmptySessionsException;

public interface ScheduledSessionsServices 
{

	ArrayList<ScheduledSessions> getSessionsDetails() throws EmptySessionsException;

	
}
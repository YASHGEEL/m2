package com.capgemini.scheduledsessions.services;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.capgemini.scheduledsessions.beans.ScheduledSessions;
import com.capgemini.scheduledsessions.daoservices.ScheduledSessionsDAO;
import com.capgemini.scheduledsessions.exceptions.EmptySessionsException;

@Component(value = "ScheduledSessions")
public class ScheduledSessionsServicesImpl implements ScheduledSessionsServices {

	@Autowired
	private ScheduledSessionsDAO daoServices;

	@Transactional

	@Override
	public ArrayList<ScheduledSessions> getSessionsDetails() throws EmptySessionsException {

		ArrayList<ScheduledSessions> list = new ArrayList<>();
		list = (ArrayList<ScheduledSessions>) daoServices.findAll();
		if (list.size() == 0) {
			/*
			 * if the list is empty i.e, there is no session record in the database then the
			 * exception will thrown with the following message
			 */
			throw new EmptySessionsException("There is no Active Sessions");
		}

		return list;
	}

}

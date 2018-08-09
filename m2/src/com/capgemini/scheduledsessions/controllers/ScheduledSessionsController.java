package com.capgemini.scheduledsessions.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;

import com.capgemini.scheduledsessions.beans.ScheduledSessions;
import com.capgemini.scheduledsessions.exceptions.EmptySessionsException;
import com.capgemini.scheduledsessions.services.ScheduledSessionsServices;

//Controller Class
@Controller
public class ScheduledSessionsController {

	@Autowired(required = true)
	private ScheduledSessionsServices scheduledSessionsServices;

	/*
	 * ScheduledSessions.jsp page will be called when the whole project will gets
	 * execute.
	 */
	@RequestMapping("/")
	public ModelAndView getScheduledSessionsPage() {

		ModelAndView model = new ModelAndView("ScheduledSessions");
		ArrayList<ScheduledSessions> list = new ArrayList<>();

		try {
			list = scheduledSessionsServices.getSessionsDetails();
		} catch (EmptySessionsException e) {
			/*
			 * if there is no entry in the database then user will redirected to the
			 * ErrorPage with proper message
			 */
			return new ModelAndView("ErrorPage", "message", e.getMessage());

		}

		System.out.println(list);

		model.addObject("arrayList", list);

		return model;

	}

	/*
	 * handler method will be invoked when user selects the desired option with
	 * proper message and redirect the user to the success page.
	 */
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ModelAndView handler(@ModelAttribute("scheduledsessions") ScheduledSessions scheduledsessions) {
		ModelAndView model = new ModelAndView("Success", "scheduledsessions", scheduledsessions);
		return model;
	}

	
	
	/* ModelAttribute to bind the scheduledsessions object to the jsp page */
	@ModelAttribute("scheduledsessions")
	public ScheduledSessions getSessions() {

		return new ScheduledSessions();
	}

}

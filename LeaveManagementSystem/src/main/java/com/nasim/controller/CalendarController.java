package com.nasim.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class CalendarController {
	
	@RequestMapping(value="/calendar", method=RequestMethod.GET) 
	public ModelAndView calendar() {
		return new ModelAndView("calendar/calendar");
	}
	
	@RequestMapping(value="/jsoncalendar", method=RequestMethod.GET) 
	public ModelAndView jsoncalendar() {
		return new ModelAndView("calendar/jsoncalendar");
	}
	
}

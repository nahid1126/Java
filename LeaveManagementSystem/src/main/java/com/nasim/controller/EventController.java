package com.nasim.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nasim.model.Event;
import com.nasim.repository.EventJpaRepository;


@RestController
public class EventController { 
	
	@Autowired
	private EventJpaRepository eventRepository;
	
	@RequestMapping(value="/allevents", method=RequestMethod.GET)
	public List<Event> allEvents() {
		return eventRepository.findAll();
	}
	
	@RequestMapping(value="/event", method=RequestMethod.POST)
	public Event addEvent(@RequestBody Event event) {
		Event created = eventRepository.save(event);
		return created; 
	}

	@RequestMapping(value="/event", method=RequestMethod.PATCH)
	public Event updateEvent(@RequestBody Event event) {
		return eventRepository.save(event);
	}

	@RequestMapping(value="/event", method=RequestMethod.DELETE)
	public void removeEvent(@RequestBody Event event) {
		eventRepository.delete(event);
	}
	
}


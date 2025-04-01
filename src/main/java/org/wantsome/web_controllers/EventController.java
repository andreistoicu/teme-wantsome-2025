package org.wantsome.web_controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.wantsome.domain_dao.Event;
import org.wantsome.service.EventService;

@Controller
public class EventController {

    private final EventService eventService;
    public EventController(EventService eventService){
        this.eventService = eventService;
    }

    @GetMapping("/newEvent")
    public String eventForm(Model model){
        model.addAttribute("event", new Event());
        return "event/eventForm";
    }

    @PostMapping("/events")
    public String submitEvent(Model model, @ModelAttribute Event event){
        eventService.save(event);
        model.addAttribute("events", eventService.findAll());
        return "events/eventsTable";
    }

    @GetMapping("/events")
    public String getCourses(Model model){
        model.addAttribute("events", eventService.findAll());
        return "events/eventsTable";
    }
}

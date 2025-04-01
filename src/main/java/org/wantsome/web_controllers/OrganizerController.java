package org.wantsome.web_controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.wantsome.domain_dao.Organizer;
import org.wantsome.service.OrganizerService;

@Controller
public class OrganizerController {
    private final OrganizerService organizerService;

    public OrganizerController(OrganizerService organizerService) {
        this.organizerService = organizerService;
    }

    @GetMapping("/organizers")
    public String organizers(Model model) {
        model.addAttribute("organizers", organizerService.findAll());
        return "organizerList";
    }

    @GetMapping("/organizerform")
    public String organizerForm(Model model) {
        model.addAttribute("organizer", new Organizer());
        return "organizerform";
    }

    @PostMapping("/submitOrganizer")
    public String saveOrganizer(@ModelAttribute Organizer organizer, Model model) {
        organizerService.saveOrganizer(organizer);

        model.addAttribute("title", "Organizer");
        model.addAttribute("organizers", organizerService.findAll());
        return "organizers";
    }
}

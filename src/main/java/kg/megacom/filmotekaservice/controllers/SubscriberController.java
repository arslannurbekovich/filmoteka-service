package kg.megacom.filmotekaservice.controllers;

import kg.megacom.filmotekaservice.models.dto.SubscriberModel;
import kg.megacom.filmotekaservice.services.SubscriberService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class SubscriberController {

    private final SubscriberService subscriberService;

    public SubscriberController(SubscriberService subscriberService) {
        this.subscriberService = subscriberService;
    }

    @PostMapping("/save")
    public String save(@RequestBody SubscriberModel subscriberModel) {
        return subscriberService.create(subscriberModel);
    }

    @PostMapping("/execute")
    public SubscriberModel actionsExecutor(@RequestParam("action") String action, @RequestBody SubscriberModel subscriberModel) {
        return subscriberModel;
    }
}

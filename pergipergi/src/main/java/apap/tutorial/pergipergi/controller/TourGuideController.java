package apap.tutorial.pergipergi.controller;

import apap.tutorial.pergipergi.model.TourGuideModel;
import apap.tutorial.pergipergi.service.TourGuideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TourGuideController {

    @Qualifier("tourGuideServiceImpl")
    @Autowired
    private TourGuideService tourGuideService;

    @GetMapping("/tour-guide/add")
    public String addTourGuideFormPage(Model model){
        model.addAttribute("tourGuide", new TourGuideModel());
        return "form-add-tour-guide";
    }

    @PostMapping("/tour-guide/add")
    public String addTourGuideSubmitPage(
            @ModelAttribute TourGuideModel tourGuide,
            Model model
    ){
        tourGuideService.addTourGuide(tourGuide);
        model.addAttribute("noTourGuide", tourGuide.getNoTourGuide());
        return "add-tour-guide";
    }
}

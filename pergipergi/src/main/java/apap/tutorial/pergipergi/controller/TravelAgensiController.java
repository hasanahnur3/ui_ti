package apap.tutorial.pergipergi.controller;

import apap.tutorial.pergipergi.model.TravelAgensiModel;
import apap.tutorial.pergipergi.service.TravelAgensiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TravelAgensiController {

    @Qualifier("travelAgensiServiceImpl")
    @Autowired
    private TravelAgensiService travelAgensiService;

    @GetMapping("/")
    private String home(){
        return "home";
    }

    @GetMapping("/agensi/add")
    public String addAgensiFormPage(Model model){
        model.addAttribute("agensi", new TravelAgensiModel());
        return "form-add-agensi";
    }

    @PostMapping("/agensi/add")
    public String addAgensiSubmitPage(
            @ModelAttribute TravelAgensiModel agensi,
            Model model
    ){
        travelAgensiService.addAgensi(agensi);
        model.addAttribute("noAgensi", agensi.getNoAgensi());
        return "add-agensi";
    }

    @GetMapping("/agensi/update/{noAgensi}")
    public String updateAgensiFormPage(
            @PathVariable Long noAgensi,
            Model model
    ){
        TravelAgensiModel agensi = travelAgensiService.getAgensiByNoAgensi(noAgensi);
        model.addAttribute("agensi", agensi);
        return "form-update-agensi";
    }

    @PostMapping("/agensi/update")
    public String updateAgensiSubmitPage(
            @ModelAttribute TravelAgensiModel agensi,
            Model model
    ){
        TravelAgensiModel updatedAgensi = travelAgensiService.updateAgensi(agensi);
        model.addAttribute("agensi", updatedAgensi);
        return "update-agensi";
    }

    @GetMapping("/agensi/view")
    public String viewDetailAgensiPage(
         @RequestParam(value = "noAgensi") Long noAgensi,
         Model model
    ){
        TravelAgensiModel agensi = travelAgensiService.getAgensiByNoAgensi(noAgensi);
        List<String> listNegaraDestinasi = new ArrayList<>();
        List<String> listNamaTourGuide = new ArrayList<>();

        agensi.getListDestinasi().forEach(p -> listNegaraDestinasi.add(p.getNegaraDestinasi()));
        agensi.getListTourGuide().forEach(p -> listNamaTourGuide.add(p.getNamaTourGuide()));

        model.addAttribute("agensi", agensi);
        model.addAttribute("listNegaraDestinasi", listNegaraDestinasi);
        model.addAttribute("listNamaTourGuide", listNamaTourGuide);

        return "view-agensi";
    }


}
package peaksoft.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import peaksoft.model.Hospital;
import peaksoft.service.HospitalSer;

@Controller                 // BEAN TYZOT
@RequestMapping("/hospitals")  // PUT UKAZYVAET. CCYLKA TYZYP BERET
@RequiredArgsConstructor


public class HospitalController {

    private final HospitalSer hospitalSer;


    @GetMapping("/allHospitals")
    public String getAllHospitals(Model model) {
        model.addAttribute("allHospitals", hospitalSer.getAllHospitals());
        return "/getAllHospitals ";
    }

    @GetMapping("/new")
    public String saveHospitals(Model model){
        model.addAttribute("new Hospital", new Hospital());
        return "new Hospital";
    }
    @PostMapping("/save")
    public  String saveHospital(@ModelAttribute("newHospital") Hospital hospital){
        hospitalSer.saveHospital(hospital);
    return "redirect:/hospitals";}
}

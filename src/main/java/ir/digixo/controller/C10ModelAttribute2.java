package ir.digixo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/10")
public class C10ModelAttribute2 {

    //@ModelAttribute
    //1-  method argument   ==> query string & get or post body extract object properties
    //2-  on method ==> model add attribute for all methods of that controller

    @GetMapping("/m11")
    public String m1(Model model) {
        model.addAttribute("name", "bita");
        return "home2";
    }

    @GetMapping("/m12")
    public String m2() {
        return "home2";
    }

//    @ModelAttribute
//    public void addAtt1(Model model) {
//        model.addAttribute("name", "nima");
//    }

    @ModelAttribute(name = "name")
    public String addAtt2() {
        return "borna_bardia";
    }

}
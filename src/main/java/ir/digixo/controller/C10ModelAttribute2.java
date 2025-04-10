package ir.digixo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/c10")
public class C10ModelAttribute2 {
    //@ModelAttribute
    //1- method argument   ==> guery string & get body posy or get
    //2-  on method ==2-1 void and Model =set attribute for all methods of that controller

    @GetMapping("/m1")
    public String m1(Model model) {
        model.addAttribute("p", "mahsa");
        return "home";
    }
    @GetMapping("/m2")
    public String m2() {
        return "home";
    }

  /*  @ModelAttribute
    public void addAttributes(Model model) {
        model.addAttribute("p", "mahsa");
    }*/

    //request.setAttribute
    @ModelAttribute(name = "p")
    public String addAttributes2() {
        return "mahsa";
    }
}

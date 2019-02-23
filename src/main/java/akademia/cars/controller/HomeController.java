package akademia.cars.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping("home")
    public String  getHomePage(Model model){
        String welcome = "Welcome to my ownsome Cars App!";
        model.addAttribute("welcome", welcome);
        return "index";
    }


}

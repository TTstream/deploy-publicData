package cultural.festival.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/publicData")
    public String index(){
        return "index";
    }

}

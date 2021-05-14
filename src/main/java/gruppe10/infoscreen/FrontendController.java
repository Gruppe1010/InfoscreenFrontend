package gruppe10.infoscreen;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("{orgName}")
public class FrontendController {


    @GetMapping("/")
    public String index(@PathVariable String orgName, Model model){
        model.addAttribute("orgName", orgName);

        return "index";
    }

    @GetMapping("createSlide")
    public String createSlide(@PathVariable String orgName, Model model){
        model.addAttribute("orgName", orgName);

        return "createSlide";
    }

    @GetMapping("editSlide/{id}")
    public String editSlide(@PathVariable String orgName, @PathVariable int id, Model model){
        model.addAttribute("orgName", orgName);
        model.addAttribute("slideId", id);

        return "editSlide";
    }

    @GetMapping("slideshow")
    public String slideshow(@PathVariable String orgName, Model model){
        model.addAttribute("orgName", orgName);

        return "slideshow";
    }

    @GetMapping("createAccount")
    public String createAccount(@PathVariable String orgName, Model model){
        model.addAttribute("orgName", orgName);

        return "createAccount";
    }



}

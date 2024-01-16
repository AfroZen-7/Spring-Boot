package app.tp1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BonjourController {

    // le nom de la méthode n'est pas important, mais les annotations si !
    @GetMapping("/bonjour")
    public String disBonjour(@RequestParam(name="name", required=false, defaultValue="Moi") String name, Model model) {
        model.addAttribute("name", name);
        return "bonjour";
    }

}
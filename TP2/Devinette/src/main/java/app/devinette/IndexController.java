package app.devinette;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.validation.BindingResult;
// import jakarta.validation.Valid; // v3 et plus

//import app.Devinette;

@Controller
@SessionAttributes("devinette")
public class IndexController {
    @GetMapping("/")
    public String index(Devinette devinette) {
        return "index";
    }

    @PostMapping(value="/", params={"valider"})
    public String traitement(Devinette devinette) {
        devinette.update();
        return "index";
    }

    @PostMapping(value="/", params={"nouveau"})
    public String nouveau(Devinette devinette) {
        devinette.reset();
        return "index";
    }
}
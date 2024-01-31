package app.devinette;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.validation.BindingResult;

import jakarta.validation.Valid; // v3 et plus

@Controller
@SessionAttributes("devinette")
public class IndexController {
    @GetMapping("/")
    public String index(@Valid Devinette devinette, BindingResult br, SessionStatus session) {
        return "index";
    }

    @PostMapping(value="/", params={"valider"})
    public String traitement(@Valid Devinette devinette, BindingResult br, SessionStatus session) {
        devinette.update();
        return "index";
    }

    @PostMapping(value="/", params={"nouveau"})
    public String nouveau(@Valid Devinette devinette, BindingResult br, SessionStatus session) {
        devinette.reset();
        return "index";
    }
}
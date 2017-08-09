package me.jerilynmensah.validationform2.controllers;

import me.jerilynmensah.validationform2.models.TVShow;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.jar.Attributes;

@Controller
public class MainController {
    @GetMapping("/tvform")
    public String addTVShow(Model model)
    {
        model.addAttribute("tvshow", new TVShow());
        return "tvform";
    }

    @PostMapping("/tvform")
    public String showTVShow(@Valid @ModelAttribute("tvshow") TVShow tvShow, BindingResult result)
    {
        if(result.hasErrors())
        {
            return "tvform";
        }
         return "tvshowconfirm";
    }
}

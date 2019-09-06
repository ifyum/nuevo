package com.example.tutorial.spring.web.app.controller;

import com.example.tutorial.spring.web.app.models.Videos;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/videos")
public class VideosController {
// se puede usar GetMapping o RequestMapping da lo mismo
    @RequestMapping({"/video", "/" , "" ,  "/Videos"})
    public String videos(Model model){ //ModelMap hace lo mismo que Model
        Videos video = new Videos();
        video.setTitulo("Warframe");
        video.setDescripcion("Este es un gameplay de warframe");
        model.addAttribute("video",video);
        model.addAttribute("titulo","Videos");

        return "videos";
    }

}

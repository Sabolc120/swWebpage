package com.example.SoulWorkerPracticeStudent.Controllers;

import com.example.SoulWorkerPracticeStudent.Models.CharactersModel;
import com.example.SoulWorkerPracticeStudent.Repos.CharactersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class charactersController {
    @Autowired
    private CharactersRepo charactersRepo;
    @GetMapping("/characterPreview")
    public ModelAndView getCharacters(@RequestParam Long id){
        ModelAndView mv = new ModelAndView("characterPreview.html");
        CharactersModel characters = charactersRepo.findById(id).orElse(new CharactersModel());
        mv.addObject("characterPreview",characters);
        System.out.println(characters);
        return mv;
    }
}

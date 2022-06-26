package com.example.SoulWorkerPracticeStudent.Controllers;

import com.example.SoulWorkerPracticeStudent.Models.RaidsModel;
import com.example.SoulWorkerPracticeStudent.Repos.RaidsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class raidsController {

    @Autowired
    private RaidsRepo raidsRepo;

    @GetMapping("/raidsPreview")
    public ModelAndView getRaids(@RequestParam Long id){
        ModelAndView mv = new ModelAndView("raidsPreview.html");
        RaidsModel raids = raidsRepo.findById(id).orElse(new RaidsModel());
        mv.addObject("raidsPreview",raids);
        System.out.println(raids);
        return mv;
    }
}

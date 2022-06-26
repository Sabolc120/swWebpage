package com.example.SoulWorkerPracticeStudent.Controllers;

import com.example.SoulWorkerPracticeStudent.Models.CharactersModel;
import com.example.SoulWorkerPracticeStudent.Models.RaidsModel;
import com.example.SoulWorkerPracticeStudent.Repos.CharactersRepo;
import com.example.SoulWorkerPracticeStudent.Repos.RaidsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HomeController {
    @GetMapping("/")
    public ModelAndView homePage(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/homePage");
        return mav;
    }
    @GetMapping("/homePage")
    public ModelAndView homePageSec(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/homePage");
        return mav;
    }
    @GetMapping("/yuukei")
    public ModelAndView yuukeiPage(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/yuukei");
        return mav;
    }
    @GetMapping("/characters")
    public ModelAndView gameCharacters(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/characters");
        return mav;
    }
    @GetMapping("/raids")
    public ModelAndView gameRaids(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/raids");
        return mav;
    }
}

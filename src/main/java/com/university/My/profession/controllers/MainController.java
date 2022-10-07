package com.university.My.profession.controllers;

import com.university.My.profession.Models.ChapterId;
import com.university.My.profession.repo.CasesRepository;
import com.university.My.profession.repo.ChapterRepository;
import com.university.My.profession.repo.Possible_solutionsRepository;
import com.university.My.profession.repo.Sub_chapterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MainController {
    @Autowired
    private CasesRepository casesRepository;
    @Autowired
    private ChapterRepository chapterRepository;
    @Autowired
    private Sub_chapterRepository sub_chapterRepository;
    @Autowired
    private Possible_solutionsRepository possible_solutionsRepository;

    @GetMapping("/")
    public String mainPage(Model model) {
        model.addAttribute("possible_solutions", possible_solutionsRepository.findAll()) ;
        return "main";
    }

    @GetMapping("/razdel/{id}")
    public String getRazdel(@PathVariable("id") Long id, Model model) {
        if (casesRepository.findById(id).get().isIntroduction()) {
            ChapterId chapterId = new ChapterId(casesRepository.findById(id).get(), 1);
            model.addAttribute("chapter", chapterRepository.findById(chapterId).get());
            return "razdel";
        }
        else{
            ChapterId chapterId = new ChapterId(casesRepository.findById(id).get(), 2);
            model.addAttribute("chapter", chapterRepository.findById(chapterId).get());
            return "razdel";
        }
    }


}

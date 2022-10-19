package com.university.My.profession.controllers;

import com.university.My.profession.Models.ChapterId;
import com.university.My.profession.services.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MainController {
    @Autowired
    MainService mainService;

    @GetMapping("/")
    public String mainPage(Model model) {
        model.addAttribute("cases", mainService.getAllCases()) ;
        return "main";
    }

    @GetMapping("/{id_case}/chapter")
    public String getStartCase(@PathVariable("id_case") Long id, Model model) {
        if (mainService.isCasesIntroduction(id))
            model.addAttribute("sub_chapter", mainService.getIntroduction(id));
        else
            model.addAttribute("sub_chapter", mainService.getSub_chapter(id,1,1));
        return "sub_chapter";
    }

    @GetMapping("/{id_case}/chapter/{id_chapter}/solutions")
    public String getSolutions(@PathVariable("id_case") Long id_case, @PathVariable("id_chapter") int id_chapter,
                            Model model) {
        model.addAttribute("solutions", mainService.getSolutions(id_case, id_chapter));
        return "solutions";
    }

    @GetMapping("/{id_case}/chapter/{id_chapter}/subchapter/{id_subchapter}")
    public String getSubchapter(@PathVariable("id_case") Long id_case, @PathVariable("id_chapter") int id_chapter,
                                @PathVariable("id_subchapter") int id_sub_chapter, Model model) {
        model.addAttribute("sub_chapter", mainService.getSub_chapter(id_case, id_chapter, id_sub_chapter));
        return "sub_chapter";
    }



}

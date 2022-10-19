package com.university.My.profession.services;

import com.university.My.profession.Models.*;
import com.university.My.profession.repo.CasesRepository;
import com.university.My.profession.repo.ChapterRepository;
import com.university.My.profession.repo.Possible_solutionsRepository;
import com.university.My.profession.repo.Sub_chapterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainService {
    @Autowired
    private CasesRepository casesRepository;
    @Autowired
    private ChapterRepository chapterRepository;
    @Autowired
    private Sub_chapterRepository sub_chapterRepository;
    @Autowired
    private Possible_solutionsRepository possible_solutionsRepository;

    public Iterable<Cases> getAllCases() {
        return casesRepository.findAll();
    }

    public boolean isCasesIntroduction(Long id) {
        return casesRepository.findById(id).get().isIntroduction();
    }

    public Sub_chapter getIntroduction(Long id) {
        ChapterId chapterId = new ChapterId(casesRepository.findById(id).get(), 1);
        Sub_chapterId sub_chapterId = new Sub_chapterId(chapterRepository.findById(chapterId).get(), 0);
        return sub_chapterRepository.findById(sub_chapterId).get();
    }

    public Sub_chapter getConclusion(Long id) {
        ChapterId chapterId = new ChapterId(casesRepository.findById(id).get(), 1);
        Sub_chapterId sub_chapterId = new Sub_chapterId(chapterRepository.findById(chapterId).get(), 3);
        return sub_chapterRepository.findById(sub_chapterId).get();
    }

    public Sub_chapter getSub_chapter(Long id, int s_number_chapter, int s_number) {
        ChapterId chapterId = new ChapterId(casesRepository.findById(id).get(), s_number_chapter);
        Sub_chapterId sub_chapterId = new Sub_chapterId(chapterRepository.findById(chapterId).get(), s_number);
        return sub_chapterRepository.findById(sub_chapterId).get();
    }

    public Possible_solutions getSolutions(Long id_case, int id_chapter) {
        ChapterId chapterId = new ChapterId(casesRepository.findById(id_case).get(), id_chapter);
        return possible_solutionsRepository.findById(chapterId).get();
    }
}

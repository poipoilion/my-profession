package com.university.My.profession.repo;

import com.university.My.profession.Models.Chapter;
import com.university.My.profession.Models.ChapterId;
import com.university.My.profession.Models.Sub_chapter;
import com.university.My.profession.Models.Sub_chapterId;
import org.springframework.data.repository.CrudRepository;

public interface Sub_chapterRepository extends CrudRepository<Sub_chapter, Sub_chapterId> {
}

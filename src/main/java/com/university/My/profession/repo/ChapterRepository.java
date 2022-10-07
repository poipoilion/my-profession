package com.university.My.profession.repo;

import com.university.My.profession.Models.Cases;
import com.university.My.profession.Models.Chapter;
import com.university.My.profession.Models.ChapterId;
import org.springframework.data.repository.CrudRepository;

public interface ChapterRepository extends CrudRepository<Chapter, ChapterId> {
}

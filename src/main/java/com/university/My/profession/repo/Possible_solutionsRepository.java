package com.university.My.profession.repo;

import com.university.My.profession.Models.Cases;
import com.university.My.profession.Models.Chapter;
import com.university.My.profession.Models.Possible_solutions;
import org.springframework.data.repository.CrudRepository;

public interface Possible_solutionsRepository extends CrudRepository<Possible_solutions, Chapter> {
}

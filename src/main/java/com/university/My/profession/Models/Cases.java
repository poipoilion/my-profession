package com.university.My.profession.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cases {
    @Id
    private Long id;
    private String name;
    private String faculty;
    private boolean introduction;
    private int qty_chapter;


}

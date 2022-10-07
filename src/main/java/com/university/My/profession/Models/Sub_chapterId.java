package com.university.My.profession.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Sub_chapterId implements Serializable {
    private Chapter chapter;
    private int s_number;

}

package com.university.My.profession.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@IdClass(Sub_chapterId.class)
@Entity
public class Sub_chapter {
    @Id
    @ManyToOne(optional = false)
    @JoinColumns({
            @JoinColumn(name="id_case", nullable = false),
            @JoinColumn(name="s_number_chapter", nullable = false)
    })
    private Chapter chapter;
    @Id
    private int s_number;
    private String header, information, video, information1, picture1, information2, picture2, information3;
    private String picture3, information4, picture4, information5, picture5;

}

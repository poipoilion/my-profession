package com.university.My.profession.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@IdClass(ChapterId.class)
public class Possible_solutions {
    @Id
    @ManyToOne(optional = false)
    @JoinColumn(name = "id_case", nullable = false)
    private Cases id_case;
    @Id
    @Column(name = "s_number_chapter")
    private int s_number;
    private String header, information, solution1, solution2, solution3, solution4, solution5;
    @OneToOne
    @MapsId
    @JoinColumns({
            @JoinColumn(name="id_case", nullable = false),
            @JoinColumn(name="s_number_chapter", nullable = false)
    })
    private Chapter chapter;

}

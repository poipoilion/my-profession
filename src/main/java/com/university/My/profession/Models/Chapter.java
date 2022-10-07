package com.university.My.profession.Models;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@IdClass(ChapterId.class)
public class Chapter implements Serializable {
    @Id
    @ManyToOne(optional = false)
    @JoinColumn(name = "id_case", nullable = false)
    private Cases id_case;
    @Id
    private int s_number;
    private boolean solutions;




}

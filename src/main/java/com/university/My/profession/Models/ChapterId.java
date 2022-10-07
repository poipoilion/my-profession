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
public class ChapterId implements Serializable {
    private Cases id_case;
    private int s_number;

    @Override
    public boolean equals(Object o){
        ChapterId chapterId = (ChapterId) o;
        if (this.id_case == chapterId.id_case && this.s_number == chapterId.s_number)
            return true;
        else
            return false;
    }
    @Override
    public int hashCode() {
        return (int) (31*id_case.getId()+s_number);
    }


}

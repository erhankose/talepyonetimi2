package com.erhankose.talep_yonetimi.dto;

import com.erhankose.talep_yonetimi.entity.TalepStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TalepDto {

    private Long id;

    private String description;
    private Date date;
    private TalepStatus talepStatus;
    private String detail;
    private UserDto talep_atanan;

}

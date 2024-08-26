package com.erhankose.talep_yonetimi.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.internal.bytebuddy.utility.nullability.NeverNull;
import org.springframework.lang.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@ApiModel(value ="Proje Data Transfer Object")
public class ProjeDto {

    private Long id;
    @NeverNull
    @NonNull

    private String pad;
    @NeverNull
    @NonNull

    private String pkodu;

}

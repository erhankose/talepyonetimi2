package com.erhankose.talep_yonetimi.dto;


import org.modelmapper.internal.bytebuddy.utility.nullability.NeverNull;
import org.springframework.lang.NonNull;

//@ApiModel(value ="Proje Data Transfer Object")
public class ProjeDto {

    private Long id;
    @NeverNull
    @NonNull

    private String pad;
    @NeverNull
    @NonNull

    private String pkodu;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPad() {
        return pad;
    }

    public void setPad(String pad) {
        this.pad = pad;
    }

    public String getPkodu() {
        return pkodu;
    }

    public void setPkodu(String pkodu) {
        this.pkodu = pkodu;
    }
}

package com.erhankose.talep_yonetimi.dto;

import com.erhankose.talep_yonetimi.entity.User;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class ProjeDto {

    private Long id;
    private String pad;
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

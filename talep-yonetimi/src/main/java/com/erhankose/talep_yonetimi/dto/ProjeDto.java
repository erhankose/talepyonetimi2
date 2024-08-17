package com.erhankose.talep_yonetimi.dto;

import com.erhankose.talep_yonetimi.entity.User;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class ProjeDto {

    private Long id;
    private String proje_ad;
    private String proje_kodu;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProje_ad() {
        return proje_ad;
    }

    public void setProje_ad(String proje_ad) {
        this.proje_ad = proje_ad;
    }

    public String getProje_kodu() {
        return proje_kodu;
    }

    public void setProje_kodu(String proje_kodu) {
        this.proje_kodu = proje_kodu;
    }
}

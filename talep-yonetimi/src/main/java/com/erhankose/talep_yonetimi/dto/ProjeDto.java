package com.erhankose.talep_yonetimi.dto;

import com.erhankose.talep_yonetimi.entity.User;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import org.antlr.v4.runtime.misc.NotNull;
import org.hibernate.annotations.NotFound;
import org.modelmapper.internal.bytebuddy.utility.nullability.NeverNull;
import org.springframework.lang.NonNull;

public class ProjeDto {

    private Long id;
    @NeverNull
    private String pad;
    @NeverNull
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

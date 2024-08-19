package com.erhankose.talep_yonetimi.dto;

import com.erhankose.talep_yonetimi.entity.TalepStatus;
import lombok.Data;

import java.util.Date;

@Data
public class TalepDto {

    private Long id;

    private String description;
    private Date date;
    private TalepStatus talepStatus;
    private String detail;
    private UserDto talep_atanan;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public TalepStatus getTalepStatus() {
        return talepStatus;
    }

    public void setTalepStatus(TalepStatus talepStatus) {
        this.talepStatus = talepStatus;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public UserDto getTalep_atanan() {
        return talep_atanan;
    }

    public void setTalep_atanan(UserDto talep_atanan) {
        this.talep_atanan = talep_atanan;
    }
}

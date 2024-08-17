package com.erhankose.talep_yonetimi.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.util.Date;

@Getter @Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table(name="talep_history")

public class TalepHistory extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JoinColumn(name="talep_id")
    @ManyToOne(optional = true,fetch = FetchType.LAZY)
    private Talep talep;

    @JoinColumn(name="assing_user_id")
    @ManyToOne(optional = true,fetch = FetchType.LAZY)
    private User atanan_user;

    private String tanim;
    private String detay;
    private Date date;
    private TalepStatus talepStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Talep getTalep() {
        return talep;
    }

    public void setTalep(Talep talep) {
        this.talep = talep;
    }

    public User getAtanan_user() {
        return atanan_user;
    }

    public void setAtanan_user(User atanan_user) {
        this.atanan_user = atanan_user;
    }

    public String getTanim() {
        return tanim;
    }

    public void setTanim(String tanim) {
        this.tanim = tanim;
    }

    public String getDetay() {
        return detay;
    }

    public void setDetay(String detay) {
        this.detay = detay;
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
}

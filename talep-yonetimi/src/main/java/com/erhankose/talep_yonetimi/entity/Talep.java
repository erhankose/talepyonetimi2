package com.erhankose.talep_yonetimi.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table(name="talep")
public class Talep extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="description",length = 400)
    private String description;
    @Column(name="date")
    private Date date;
    @Enumerated(EnumType.STRING)
    private TalepStatus talepStatus;

    private String detail;

    @JoinColumn(name="assign_user_id")
    @ManyToOne(optional = true,fetch = FetchType.LAZY)
    private  User talep_atanan;

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

    public User getTalep_atanan() {
        return talep_atanan;
    }

    public void setTalep_atanan(User talep_atanan) {
        this.talep_atanan = talep_atanan;
    }
}

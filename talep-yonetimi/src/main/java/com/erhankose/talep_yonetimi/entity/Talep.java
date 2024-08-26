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
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    @Enumerated(EnumType.STRING)
    private TalepStatus talepStatus;

    private String detail;

    @JoinColumn(name="assign_user_id")
    @ManyToOne(optional = true,fetch = FetchType.LAZY)
    private  User talep_atanan;

}

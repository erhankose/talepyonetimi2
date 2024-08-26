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

}

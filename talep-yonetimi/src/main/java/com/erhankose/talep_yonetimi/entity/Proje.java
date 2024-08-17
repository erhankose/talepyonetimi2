package com.erhankose.talep_yonetimi.entity;

import jakarta.persistence.*;
import lombok.*;

@Setter @Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table(name="proje")
public class Proje extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="proje_ad",unique = true)
    private String pad;
    @Column(name="proje_kodu",unique = true)
    private String pkodu;
    @JoinColumn(name="manager_user_id")
    @ManyToOne(optional = true,fetch = FetchType.LAZY)
    private  User yonetici;


}
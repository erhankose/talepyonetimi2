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
    @Column(name="pkodu",unique = true)
    private String pkodu;
    @JoinColumn(name="manager_user_id")
    @ManyToOne(optional = true,fetch = FetchType.LAZY)
    private  User yonetici;

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

    public User getYonetici() {
        return yonetici;
    }

    public void setYonetici(User yonetici) {
        this.yonetici = yonetici;
    }
}
/*Erhan Köse 3*/
package com.erhankose.talep_yonetimi.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table(name="users")
public class User extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String uname;
    private String user_name;
    private String password;
    private String name_surname;
    private String eposta;

    @JoinColumn(name="assign_user_id")
    @OneToMany(fetch = FetchType.LAZY)
    private List<Talep> talepList;

}

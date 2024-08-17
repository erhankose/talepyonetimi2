package com.erhankose.talep_yonetimi.repository;

import com.erhankose.talep_yonetimi.entity.Talep;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TalepRepository extends JpaRepository<Talep,Long> {
}

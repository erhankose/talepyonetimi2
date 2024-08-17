package com.erhankose.talep_yonetimi.repository;

import com.erhankose.talep_yonetimi.entity.Proje;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjeRepository extends JpaRepository<Proje, Long> {

   Proje getBypkodu(String pkodu);

  //  Proje getProjeBypKodu(String pkodu);

   // List<Proje> getProjeListByProjeKoduAndProjeAdContains(String proje_kodu, String proje_ad);

    //Page<Proje> getAll(Pageable sort);

    Page<Proje> findAll(Pageable pageable);

    List<Proje> findAll(Sort sort);

}


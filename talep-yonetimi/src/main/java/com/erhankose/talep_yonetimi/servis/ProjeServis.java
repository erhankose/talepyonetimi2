package com.erhankose.talep_yonetimi.servis;

import com.erhankose.talep_yonetimi.entity.Proje;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ProjeServis {
    Proje save(Proje proje);

    Optional<Proje> getById(Long id);

    Page<Proje> getAllPageble(Pageable pageable);
}

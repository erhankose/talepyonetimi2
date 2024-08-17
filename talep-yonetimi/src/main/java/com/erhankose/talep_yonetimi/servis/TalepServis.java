package com.erhankose.talep_yonetimi.servis;

import com.erhankose.talep_yonetimi.dto.TalepDto;
import com.erhankose.talep_yonetimi.entity.Talep;
import com.erhankose.talep_yonetimi.util.TPage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface TalepServis {
    TalepDto save(TalepDto talepDto);

    Optional<Talep> getById(Long id);

    TPage<TalepDto> getAllPageble(Pageable pageable);

    public Boolean delete(Talep talep) ;
}

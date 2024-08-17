package com.erhankose.talep_yonetimi.servis;

import com.erhankose.talep_yonetimi.entity.TalepHistory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface TalepHistoryServis {
    TalepHistory save(TalepHistory talepHistory);

    Optional<TalepHistory> findById(Long id);

    Page<TalepHistory> getAllPageble(Pageable pageable);
}

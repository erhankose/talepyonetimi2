package com.erhankose.talep_yonetimi.servis.impl;

import com.erhankose.talep_yonetimi.entity.TalepHistory;
import com.erhankose.talep_yonetimi.repository.TalepHistoryRepository;
import com.erhankose.talep_yonetimi.servis.TalepHistoryServis;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TalepHistoryServisImpl implements TalepHistoryServis {

    public final TalepHistoryRepository talepHistoryRepository;
    //Spring setter inject. yerine  constr.inject. best praktis
    public TalepHistoryServisImpl(TalepHistoryRepository talepHistoryRepository) {
        this.talepHistoryRepository =talepHistoryRepository;
    }

    @Override
    public TalepHistory save(TalepHistory talepHistory) {

        if (talepHistory.getDate() ==null) {
                throw  new IllegalArgumentException("Talep tarihi boş olamaz");

        }
        return talepHistoryRepository.save(talepHistory);
    }

    @Override
    public Optional<TalepHistory> findById(Long id) {
        return talepHistoryRepository.findById(id);
    }

    @Override
    public Page<TalepHistory> getAllPageble(Pageable pageable) {
        return talepHistoryRepository.findAll(pageable);
    }
}

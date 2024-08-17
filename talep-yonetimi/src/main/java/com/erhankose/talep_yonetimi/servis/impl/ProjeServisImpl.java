package com.erhankose.talep_yonetimi.servis.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import com.erhankose.talep_yonetimi.entity.Proje;
import com.erhankose.talep_yonetimi.repository.ProjeRepository;
import com.erhankose.talep_yonetimi.servis.ProjeServis;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProjeServisImpl implements ProjeServis {

    public final ProjeRepository projeRepository;

    //Spring setter inject. yerine  constr.inject. best praktis
    public ProjeServisImpl(ProjeRepository projeRepository) {
        this.projeRepository =projeRepository;
        projeRepository.getBypkodu("1");

    }

    @Override
    public Proje save(Proje proje) {
        if (proje.getPad()==null) {
            throw  new IllegalArgumentException("Proje kodu boş olamaz");
        }
        return projeRepository.save(proje);
    }

    @Override
    public Optional<Proje> getById(Long id) {
        return projeRepository.findById(id);
    }

    @Override
    public Page<Proje> getAllPageble(Pageable pageable) {
        return projeRepository.findAll(pageable);
    }

}

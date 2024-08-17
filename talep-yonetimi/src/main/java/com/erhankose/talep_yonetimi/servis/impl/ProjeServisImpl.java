package com.erhankose.talep_yonetimi.servis.impl;

import com.erhankose.talep_yonetimi.dto.ProjeDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.modelmapper.ModelMapper;
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
    private final ModelMapper modelMapper;

    //Spring setter inject. yerine  constr.inject. best praktis
    public ProjeServisImpl(ProjeRepository projeRepository,ModelMapper modelMapper) {
        this.projeRepository =projeRepository;
        this.modelMapper = modelMapper;

    }

    @Override
    public Proje save(Proje proje) {
        if (proje.getPad()==null) {
            throw  new IllegalArgumentException("Proje kodu boş olamaz");
        }
        return projeRepository.save(proje);
    }

    @Override
    public  ProjeDto getById(Long id) {

        Proje proje = projeRepository.getById(id);
        return  modelMapper.map(proje,ProjeDto.class);
    }

    @Override
    public Page<Proje> getAllPageble(Pageable pageable) {
        return projeRepository.findAll(pageable);
    }

}

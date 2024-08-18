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
    public ProjeDto save(ProjeDto projeDto) {

        if (projeDto.getPad()==null) {
            throw  new IllegalArgumentException("Proje kodu boş olamaz");
        }

        Proje projeKontrol = projeRepository.getBypkodu(projeDto.getPkodu());

        if (projeKontrol!=null) {
            throw  new IllegalArgumentException(("Proje kodu mevcuttur"));
        }

        Proje proje = modelMapper.map(projeDto,Proje.class);
        proje = projeRepository.save(proje);

        projeDto.setId(proje.getId());

        return projeDto;
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

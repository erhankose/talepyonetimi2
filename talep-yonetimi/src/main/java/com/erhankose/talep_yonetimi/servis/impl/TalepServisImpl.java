package com.erhankose.talep_yonetimi.servis.impl;

import com.erhankose.talep_yonetimi.dto.TalepDto;
import com.erhankose.talep_yonetimi.entity.Talep;
import com.erhankose.talep_yonetimi.repository.TalepRepository;
import com.erhankose.talep_yonetimi.servis.TalepServis;
import com.erhankose.talep_yonetimi.util.TPage;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Optional;

@Service
public class TalepServisImpl implements TalepServis {

    //@Autowired setter inject.
    //public TalepRepository talepRepository;

    public final TalepRepository talepRepository;
    public final ModelMapper  modelMapper;

    //Spring setter inject. yerine  constr.inject. best praktis
    public TalepServisImpl (TalepRepository talepRepository,ModelMapper modelMapper) {
        this.talepRepository =talepRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public TalepDto save(TalepDto talepDto) {

        if (talepDto.getDate() ==null) {
            throw  new IllegalArgumentException("Talep tarihi boş olamaz");

        }

        Talep talepVT = modelMapper.map(talepDto,Talep.class);

        talepVT = talepRepository.save(talepVT);
        return  modelMapper.map(talepVT,TalepDto.class);
    }

    @Override
    public Optional<Talep> getById(Long id) {
        return talepRepository.findById(id);
    }

    @Override
    public TPage<TalepDto> getAllPageble(Pageable pageable) {

        Page<Talep> data = talepRepository.findAll(pageable);

        TalepDto[]  talepDtos = modelMapper.map(data.getContent(),TalepDto[].class);

        TPage tPage = new TPage<TalepDto>();
        tPage.setStat(data, Arrays.asList(talepDtos));
        return tPage;
    }

    @Override
    public Boolean delete(Talep talep) {
        talepRepository.delete(talep);
        return Boolean.TRUE;
    }

}

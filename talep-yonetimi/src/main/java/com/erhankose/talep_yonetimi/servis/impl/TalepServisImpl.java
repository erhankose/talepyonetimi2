package com.erhankose.talep_yonetimi.servis.impl;

import com.erhankose.talep_yonetimi.dto.ProjeDto;
import com.erhankose.talep_yonetimi.dto.TalepDto;
import com.erhankose.talep_yonetimi.entity.Proje;
import com.erhankose.talep_yonetimi.entity.Talep;
import com.erhankose.talep_yonetimi.repository.TalepRepository;
import com.erhankose.talep_yonetimi.servis.TalepServis;
import com.erhankose.talep_yonetimi.util.TPage;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class TalepServisImpl implements TalepServis {

    //@Autowired setter inject.
    //public TalepRepository talepRepository;

    public final TalepRepository talepRepository;
    public final ModelMapper modelMapper;

    //Spring setter inject. yerine  constr.inject. best praktis
    public TalepServisImpl(TalepRepository talepRepository, ModelMapper modelMapper) {
        this.talepRepository = talepRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public TalepDto save(TalepDto talepDto) {

      /*  if (talepDto.getTalep_atanan() == null) {
            throw new IllegalArgumentException("talep atanan boş olamaz");
        }
*/
        Talep talep = modelMapper.map(talepDto, Talep.class);
        talep = talepRepository.save(talep);

        talepDto.setId(talep.getId());

        return talepDto;
    }


    @Override
    public TalepDto getById(Long id) {

        Talep talep = talepRepository.getById(id);
        return modelMapper.map(talep, TalepDto.class);
    }


    @Override
    public TPage<TalepDto> getAllPageble(Pageable pageable) {

        Page<Talep> data = talepRepository.findAll(pageable);

        TalepDto[] talepDtos = modelMapper.map(data.getContent(), TalepDto[].class);

        TPage tPage = new TPage<TalepDto>();
        tPage.setStat(data, Arrays.asList(talepDtos));
        return tPage;
    }

    @Override
    public TalepDto update(Long id, TalepDto talepDto) {

        Talep talep = modelMapper.map(talepDto, Talep.class);
        talep = talepRepository.save(talep);

        talepDto = modelMapper.map(talepDto, TalepDto.class);
        return talepDto;
    }

    @Override
    public Boolean delete(Long id) {
        talepRepository.deleteById(id);
        return Boolean.TRUE;
    }

}

package com.erhankose.talep_yonetimi.api;

import com.erhankose.talep_yonetimi.dto.ProjeDto;
import com.erhankose.talep_yonetimi.servis.impl.ProjeServisImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/versiyon")
public class ProjeControllerVersiyon {

    @Autowired
    private  ProjeServisImpl projeServisImpl;


    @GetMapping(value = "/{id}",params = "version=1")
    public ResponseEntity<ProjeDto> getByIdVersiyon1(@PathVariable("id") Long id) {

        ProjeDto projeDto = projeServisImpl.getById(id);
        ResponseEntity<ProjeDto> projeDtoResponseEntity = ResponseEntity.ok(projeDto);
        return projeDtoResponseEntity;
    }

    @GetMapping(value = "/{id}",params = "version=2")
    public ResponseEntity<ProjeDto> getByIdVersiyon2(@PathVariable("id") Long id) {

        ProjeDto projeDto = projeServisImpl.getById(id);
        ResponseEntity<ProjeDto> projeDtoResponseEntity = ResponseEntity.ok(projeDto);
        return projeDtoResponseEntity;
    }

}

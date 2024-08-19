package com.erhankose.talep_yonetimi.api;

import com.erhankose.talep_yonetimi.dto.ProjeDto;
import com.erhankose.talep_yonetimi.entity.Proje;
import com.erhankose.talep_yonetimi.servis.ProjeServis;
import com.erhankose.talep_yonetimi.servis.impl.ProjeServisImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/proje")
public class ProjeController {

    /**
     * Http Methodları
     * Get
     * Post
     * Put
     * Delete
     *
     */

    private final ProjeServisImpl projeServisImpl;

    public ProjeController(ProjeServisImpl projeServisImpl) {
        this.projeServisImpl = projeServisImpl;
    }


    @GetMapping("/{id}")
    public ResponseEntity<ProjeDto> getById(@PathVariable("id") Long id) {

        ProjeDto projeDto= projeServisImpl.getById(id);
        ResponseEntity<ProjeDto> projeDtoResponseEntity= ResponseEntity.ok(projeDto);
        return  projeDtoResponseEntity;
    }

    @GetMapping
    public ResponseEntity<ProjeDto> getById2() {

        ProjeDto projeDto= projeServisImpl.getById(1L);
        //ResponseEntity<ProjeDto> projeDtoResponseEntity= ResponseEntity.ok(projeDto);
        return  ResponseEntity.ok(projeDto);
    }

    //Erhan Köse 7
    @PostMapping()
    public ResponseEntity<ProjeDto> createProje(@Validated @RequestBody ProjeDto projeDto) {

        projeDto = projeServisImpl.save(projeDto);

        return ResponseEntity.ok(projeDto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProjeDto> update(@PathVariable("id") Long id, @Validated @RequestBody ProjeDto projeDto) {

        projeDto = projeServisImpl.update(id,projeDto);

        return ResponseEntity.ok(projeDto);
    }
}

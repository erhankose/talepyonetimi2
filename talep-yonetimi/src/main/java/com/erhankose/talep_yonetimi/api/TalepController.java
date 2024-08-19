package com.erhankose.talep_yonetimi.api;

import com.erhankose.talep_yonetimi.dto.TalepDto;
import com.erhankose.talep_yonetimi.servis.impl.TalepServisImpl;
import com.erhankose.talep_yonetimi.util.ApiPath;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(ApiPath.TalepKntrol.Kontrol)
public class TalepController {

    /**
     * Http Methodları
     * Get
     * Post
     * Put
     * Delete
     */

    private final TalepServisImpl talepServis;

    public TalepController(TalepServisImpl talepServis) {
        this.talepServis = talepServis;
    }

    @GetMapping("/{id}")
    public ResponseEntity<TalepDto> getById(@PathVariable("id") Long id) {

        TalepDto talepDtoDto = talepServis.getById(id);
        ResponseEntity<TalepDto> talepDtoResponseEntity = ResponseEntity.ok(talepDtoDto);
        return talepDtoResponseEntity;
    }


    @PostMapping
    public ResponseEntity<TalepDto> createProject( @RequestBody TalepDto issue) {
        return ResponseEntity.ok(talepServis.save(issue));
    }


    @PutMapping("/talep/{id}")
    public ResponseEntity<TalepDto> update(@PathVariable(value = "id", required = true) Long id, @Validated @RequestBody TalepDto talepDto) {

        talepDto = talepServis.update(id, talepDto);

        return ResponseEntity.ok(talepDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable(value = "id", required = true) Long id) {

        Boolean deleteDurum = talepServis.delete(id);

        return ResponseEntity.ok(deleteDurum);
    }



}

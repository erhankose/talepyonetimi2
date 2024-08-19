package com.erhankose.talep_yonetimi.api;

import com.erhankose.talep_yonetimi.dto.ProjeDto;
import com.erhankose.talep_yonetimi.servis.impl.ProjeServisImpl;
import com.erhankose.talep_yonetimi.util.ApiPath;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(ApiPath.ProjeKntrol.Kontrol)
public class ProjeController {

    /**
     * Http Methodları
     * Get
     * Post
     * Put
     * Delete
     */

    private final ProjeServisImpl projeServisImpl;

    public ProjeController(ProjeServisImpl projeServisImpl) {
        this.projeServisImpl = projeServisImpl;
    }


    @GetMapping("/{id}")
   // @ApiOperation(value = "getById metodu",response =ProjeDto.class)
    public ResponseEntity<ProjeDto> getById(@PathVariable("id") Long id) {

        ProjeDto projeDto = projeServisImpl.getById(id);
        ResponseEntity<ProjeDto> projeDtoResponseEntity = ResponseEntity.ok(projeDto);
        return projeDtoResponseEntity;
    }



    @PostMapping()
    //@ApiOperation(value = "createProje  metodu",response =ProjeDto.class)
    public ResponseEntity<ProjeDto> createProje(@Validated @RequestBody ProjeDto projeDto) {

        projeDto = projeServisImpl.save(projeDto);

        return ResponseEntity.ok(projeDto);
    }

    @PutMapping("/talep/{id}")
 //   @ApiOperation(value = "update  metodu",response =ProjeDto.class)
    public ResponseEntity<ProjeDto> update(@PathVariable(value = "id", required = true) Long id, @Validated @RequestBody ProjeDto projeDto) {

        projeDto = projeServisImpl.update(id, projeDto);

        return ResponseEntity.ok(projeDto);
    }

    @DeleteMapping("/{id}")
   // @ApiOperation(value = "delete  metodu",response =Boolean.class)
    public ResponseEntity<Boolean> delete(@PathVariable(value = "id", required = true) Long id) {

        Boolean deleteDurum = projeServisImpl.delete(id);

        return ResponseEntity.ok(deleteDurum);
    }
}

package com.example.backend.Controller;

import com.example.backend.Dto.KucicaDTO;
import com.example.backend.Service.KucicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/kucica")
public class KucicaController {
    @Autowired
    KucicaService kucicaService;

    @PostMapping(path = "/save")
    public String saveKucica(@RequestBody KucicaDTO kucicaDTO){
        String kucica=kucicaService.createKucica(kucicaDTO);
        return kucica;
    }
    @GetMapping(path = "/getAll")
    public ResponseEntity<?> getAllKucice(){
        try {
            List<KucicaDTO> kucicaList = kucicaService.getAllKucica();
            return ResponseEntity.ok(kucicaList);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}

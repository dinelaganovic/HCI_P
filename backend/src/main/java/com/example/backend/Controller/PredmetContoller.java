package com.example.backend.Controller;

import com.example.backend.Dto.PredmetDTO;
import com.example.backend.Service.PredmetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/predmet")
public class PredmetContoller {

    @Autowired
    private PredmetService predmetService;

    @PostMapping(path = "/save")
    public String savePredmet(@RequestBody PredmetDTO predmetDTO){
        String predmet=predmetService.createPredmet(predmetDTO);
        return predmet;
    }

    @GetMapping(path = "/getAll")
    public ResponseEntity<?> getAllPredmets(){
        try {
            List<PredmetDTO> predmetList = predmetService.getAllPredmet();
            return ResponseEntity.ok(predmetList);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}

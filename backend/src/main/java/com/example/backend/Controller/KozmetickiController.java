package com.example.backend.Controller;

import com.example.backend.Dto.KozmetickiDTO;
import com.example.backend.Dto.KucicaDTO;
import com.example.backend.Service.KozmetickiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/koz")
public class KozmetickiController {
    @Autowired
    KozmetickiService kozmetickiService;
    @PostMapping(path = "/save")
    public String saveKoz(@RequestBody KozmetickiDTO kozmetickiDTO){
        String koz=kozmetickiService.createKozmeticki(kozmetickiDTO);
        return koz;
    }
    @GetMapping(path = "/getAll")
    public ResponseEntity<?> getAllKoz(){
        try {
            List<KozmetickiDTO> kozmetickiDTOS = kozmetickiService.getAllKoz();
            return ResponseEntity.ok(kozmetickiDTOS);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}

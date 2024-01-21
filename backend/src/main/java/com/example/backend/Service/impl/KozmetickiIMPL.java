package com.example.backend.Service.impl;

import com.example.backend.Dto.KozmetickiDTO;
import com.example.backend.Dto.KucicaDTO;
import com.example.backend.Entity.Kozmeticki;
import com.example.backend.Entity.Kucica;
import com.example.backend.Repo.KozmetickiRepository;
import com.example.backend.Service.KozmetickiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class KozmetickiIMPL implements KozmetickiService {
    @Autowired
    KozmetickiRepository kozmetickiRepository;
    @Override
    public String createKozmeticki(KozmetickiDTO kozmetickiDTO) {
        Kozmeticki kozmeticki=new Kozmeticki(
                kozmetickiDTO.getId(),
                kozmetickiDTO.getCena(),
                kozmetickiDTO.getNaziv(),
                kozmetickiDTO.getDetalji()
        );
        kozmetickiRepository.save(kozmeticki);
        return kozmeticki.getNaziv();
    }

    @Override
    public List<KozmetickiDTO> getAllKoz() {
        List<KozmetickiDTO> KozDtoList = new ArrayList<>();
        List<Kozmeticki> kozlist = kozmetickiRepository.findAll();

        for (Kozmeticki kozmeticki : kozlist) {
            KozDtoList.add(new KozmetickiDTO(kozmeticki.getId(), kozmeticki.getCena(), kozmeticki.getNaziv(),kozmeticki.getDetalji()));
        }

        return KozDtoList;
    }
}

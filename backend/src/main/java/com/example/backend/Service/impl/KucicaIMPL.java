package com.example.backend.Service.impl;

import com.example.backend.Dto.KucicaDTO;
import com.example.backend.Entity.Kucica;
import com.example.backend.Repo.KucicaRepository;
import com.example.backend.Service.KucicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class KucicaIMPL implements KucicaService {
    @Autowired
    KucicaRepository kucicaRepository;
    @Override
    public String createKucica(KucicaDTO kucicaDTO) {
        Kucica kucica = new Kucica(
                kucicaDTO.getId(),
                kucicaDTO.getDimension(),
                kucicaDTO.getColor(),
                kucicaDTO.getSize()
        );
        kucicaRepository.save(kucica);
        return  kucica.getColor();
    }

    @Override
    public List<KucicaDTO> getAllKucica() {
        List<KucicaDTO> KucicaDtoList = new ArrayList<>();
        List<Kucica> kucicaList = kucicaRepository.findAll();

        for (Kucica kucica : kucicaList) {
            KucicaDtoList.add(new KucicaDTO(kucica.getId(), kucica.getDimension(), kucica.getColor(),kucica.getSize()));
        }

        return KucicaDtoList;
    }
}

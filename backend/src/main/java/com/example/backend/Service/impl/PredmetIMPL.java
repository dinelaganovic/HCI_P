package com.example.backend.Service.impl;

import com.example.backend.Dto.PredmetDTO;
import com.example.backend.Dto.UserDTO;
import com.example.backend.Entity.Predmet;
import com.example.backend.Entity.User;
import com.example.backend.Repo.PredmetRepository;
import com.example.backend.Repo.UserRepository;
import com.example.backend.Service.PredmetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class PredmetIMPL implements PredmetService {
    @Autowired
    private PredmetRepository predmetRepository;
    @Override
    public String createPredmet(PredmetDTO predmetDTO) {

        Predmet predmet = new Predmet(
                predmetDTO.getId(),
                predmetDTO.getName(),
                predmetDTO.getOcena()
        );
        predmetRepository.save(predmet);
        return  predmet.getName();
    }

    @Override
    public List<PredmetDTO> getAllPredmet() {
            List<PredmetDTO> PredmetDTOList = new ArrayList<>();
            List<Predmet> predmetList = predmetRepository.findAll();

            for (Predmet predmet : predmetList) {
                PredmetDTOList.add(new PredmetDTO(predmet.getId(), predmet.getName(), predmet.getOcena()));
            }

            return PredmetDTOList;
        }
}

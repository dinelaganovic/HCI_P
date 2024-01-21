package com.example.backend.Service;

import com.example.backend.Dto.PredmetDTO;
import java.util.List;

public interface PredmetService {
    String createPredmet(PredmetDTO predmetDTO);
    List<PredmetDTO> getAllPredmet();
}

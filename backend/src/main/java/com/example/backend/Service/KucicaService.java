package com.example.backend.Service;

import com.example.backend.Dto.KucicaDTO;
import java.util.List;

public interface KucicaService {
    String createKucica(KucicaDTO kucicaDTO);
    List<KucicaDTO> getAllKucica();
}

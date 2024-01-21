package com.example.backend.Service;

import com.example.backend.Dto.KozmetickiDTO;
import java.util.List;

public interface KozmetickiService {
    String createKozmeticki(KozmetickiDTO  kozmetickiDTO);
    List<KozmetickiDTO> getAllKoz();
}

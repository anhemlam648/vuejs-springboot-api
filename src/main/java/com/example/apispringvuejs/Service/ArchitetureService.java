package com.example.apispringvuejs.Service;

import com.example.apispringvuejs.Dto.Dtoarchiteture;
import com.example.apispringvuejs.Entity.Architeture;

public interface ArchitetureService {
    boolean createArchiteture (Dtoarchiteture dtoarchiteture);
    boolean updateArchiteture (Dtoarchiteture dtoarchiteture);
    boolean deleteArchiteture (Long id);
    Dtoarchiteture getArchitetureDtoById (Long id);
}

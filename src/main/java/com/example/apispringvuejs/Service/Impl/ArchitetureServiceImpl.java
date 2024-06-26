package com.example.apispringvuejs.Service.Impl;

import com.example.apispringvuejs.Dto.Dtoarchiteture;
import com.example.apispringvuejs.Entity.Architeture;
import com.example.apispringvuejs.Mapper.MapperArchiteture;
import com.example.apispringvuejs.Repository.ArchitetureRepository;
import com.example.apispringvuejs.Repository.HrAdministrationRepository;
import com.example.apispringvuejs.Service.ArchitetureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ArchitetureServiceImpl implements ArchitetureService {

    private final ArchitetureRepository architetureRepository;

    @Autowired
    private ArchitetureServiceImpl(ArchitetureRepository architetureRepository){
        this.architetureRepository = architetureRepository;

    }
    @Override
    public boolean createArchiteture(Dtoarchiteture dtoarchiteture) {
        Architeture architeture = MapperArchiteture.MapToArchiteture(dtoarchiteture);
        Architeture saveArchiteture = architetureRepository.save(architeture);
        return saveArchiteture != null;
    }

    @Override
    public boolean updateArchiteture(Dtoarchiteture dtoarchiteture) {
        Optional<Architeture> optionalArchiteture = this.architetureRepository.findById(dtoarchiteture.getId());
        if(optionalArchiteture.isPresent()) {
            Architeture architeture = optionalArchiteture.get();
            architeture.setTitle(dtoarchiteture.getTitle());
            architeture.setDescription(dtoarchiteture.getDescription());
            architeture.setContent(dtoarchiteture.getContent());
            architeture.setImage(dtoarchiteture.getImage());
            architeture.setCreatedAt(dtoarchiteture.getCreateAt());
            architeture.setUpdatedAt(dtoarchiteture.getUpdateAt());
            architetureRepository.save(architeture);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteArchiteture(Long id) {
            Optional<Architeture> optionalArchiteture = this.architetureRepository.findById(id);
            if (optionalArchiteture.isPresent()) {
                architetureRepository.delete(optionalArchiteture.get());
                return true;
            }
        return false;
    }

    @Override
    public Dtoarchiteture getArchitetureDtoById(Long id) {
        Optional<Architeture> optionalArchiteture = this.architetureRepository.findById(id);
        if(optionalArchiteture.isPresent()){
            Architeture architeture = optionalArchiteture.get();
            return MapperArchiteture.MapToDtoArchiteture(architeture);
        }
        return null;
    }

    public List<Dtoarchiteture> getAllArchiteture(){
         List<Dtoarchiteture> dtoarchitetures = architetureRepository.findAll().stream()
                .map(MapperArchiteture :: MapToDtoArchiteture)
                .collect(Collectors.toList());
         return dtoarchitetures;
    }
}

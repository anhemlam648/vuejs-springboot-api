package com.example.apispringvuejs.Service.Impl;

import com.example.apispringvuejs.Dto.Dtohradministration;
import com.example.apispringvuejs.Mapper.MapperCategoryHrAdministration;
import com.example.apispringvuejs.Mapper.MapperHrAdministration;
import com.example.apispringvuejs.Repository.HrAdministrationRepository;
import com.example.apispringvuejs.Service.HrAdministrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HrAdministrationServiceImpl implements HrAdministrationService {
    private final HrAdministrationRepository hrAdministrationRepository;

    @Autowired
    private HrAdministrationServiceImpl(HrAdministrationRepository hrAdministrationRepository){
        this.hrAdministrationRepository = hrAdministrationRepository;
    }
    public List<Dtohradministration> getAllHrAdministration() {
        List<Dtohradministration> dtohradministrationList = hrAdministrationRepository.findAll().stream()
                .map(MapperHrAdministration::MapToDtoHrAdministration)
                .collect(Collectors.toList());
        return dtohradministrationList;
    }
}

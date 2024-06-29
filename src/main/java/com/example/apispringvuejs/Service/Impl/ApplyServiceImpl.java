package com.example.apispringvuejs.Service.Impl;

import com.example.apispringvuejs.Dto.Dtoapply;
import com.example.apispringvuejs.Entity.Apply;
import com.example.apispringvuejs.Mapper.MapperApply;
import com.example.apispringvuejs.Repository.ApplyRepository;
import com.example.apispringvuejs.Service.ApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ApplyServiceImpl implements ApplyService {
    private final ApplyRepository applyRepository;


    @Autowired
    private ApplyServiceImpl(ApplyRepository applyRepository){
        this.applyRepository = applyRepository;
    }
    @Override
    public boolean createApply(Dtoapply dtoapply) {
        Apply apply = MapperApply.mapToApply(dtoapply);
        Apply saveApply = applyRepository.save(apply);
        return saveApply != null;
    }

    @Override
    public boolean updateApply(Dtoapply dtoapply) {
        Optional<Apply> applyOptional = this.applyRepository.findById(dtoapply.getId());
        if(applyOptional.isPresent()){
            Apply apply = applyOptional.get();
            apply.setTitle(dtoapply.getTitle());
            apply.setContent(dtoapply.getContent());
            apply.setImage(dtoapply.getImage());
            apply.setDescription(dtoapply.getDescription());
            apply.setCreateAt(dtoapply.getCreateAt());
            apply.setUpdateAt(dtoapply.getUpdateAt());
            applyRepository.save(apply);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteApply(Long id) {
        Optional<Apply> deleteApply = this.applyRepository.findById(id);
        if(deleteApply.isPresent()){
            applyRepository.delete(deleteApply.get());
            return true;
        }
        return false;
    }

    @Override
    public Dtoapply getApplyDtoById(Long id) {
        Optional<Apply> getApplybyid = this.applyRepository.findById(id);
        if(getApplybyid.isPresent()){
            Apply apply = getApplybyid.get();
            return MapperApply.mapToDtoApply(apply);
        }
        return null;
    }

    public List<Dtoapply> getAllapply(){
        List<Dtoapply> dtoapplyList = this.applyRepository.findAll()
                .stream().map(MapperApply::mapToDtoApply)
                .collect(Collectors.toList());
        return dtoapplyList;
    }
}

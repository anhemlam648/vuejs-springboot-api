package com.example.apispringvuejs.Service;

import com.example.apispringvuejs.Dto.Dtoapply;
import com.example.apispringvuejs.Dto.Dtohradministration;

public interface ApplyService {
    boolean createApply(Dtoapply dtoapply);
    boolean updateApply(Dtoapply dtoapply);
    boolean deleteApply(Long id);
    Dtoapply getApplyDtoById(Long id);
}

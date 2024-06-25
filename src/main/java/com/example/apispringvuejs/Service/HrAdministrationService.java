package com.example.apispringvuejs.Service;

import com.example.apispringvuejs.Dto.Dtohradministration;

public interface HrAdministrationService {
    boolean createHrAdministrationDto(Dtohradministration dtohradministration);
    boolean updateHrAdministrationDto(Dtohradministration dtohradministration);
    boolean deleteHrAdministrationDto(Long id);
    Dtohradministration getHrAdministrationDtoById(Long id);
}

package gao.internfinder.backend.Service.Imp;

import gao.internfinder.backend.Entity.Created_cv;
import gao.internfinder.backend.Service.ICreateCV;
import gao.internfinder.backend.dto.CVDTO;
import gao.internfinder.backend.dto.DataCVDTO;
import gao.internfinder.backend.dto.User;
import gao.internfinder.backend.repository.CreateCVRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CreatedCVImlp implements ICreateCV {
    @Autowired
    CreateCVRepository createCVRepository;

    @Override
    public void addCV(CVDTO cv) {
        createCVRepository.createCV(cv.getFile_name(),cv.getCreate_date(),cv.getAccount(),cv.getTemplate_cv(),cv.getPath());
    }

    @Override
    public User postdata(DataCVDTO data) {
        User user = new User();
        user.setAddress(data.get_address());
        user.setDayOfBirth(data.get_dayOfBirth());
        user.setEmail(data.get_email());
        user.setFirstName(data.get_firstName());
        user.setLastName(data.get_lastName());
        user.setGender(data.get_gender());
        user.setObjective(data.get_objective());
        user.setPhone(data.get_phone());
        return user;
    }

}

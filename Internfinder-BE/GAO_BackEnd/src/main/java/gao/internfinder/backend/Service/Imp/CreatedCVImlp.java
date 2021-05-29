package gao.internfinder.backend.Service.Imp;

import gao.internfinder.backend.Entity.Created_cv;
import gao.internfinder.backend.Service.ICreateCV;
import gao.internfinder.backend.dto.CVDTO;
import gao.internfinder.backend.dto.DataCVDTO;
import gao.internfinder.backend.dto.KinhNghiem;
import gao.internfinder.backend.dto.User;
import gao.internfinder.backend.repository.CreateCVRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

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
            user.setAddress(data.getAddress());
            user.setDayOfBirth(data.getDayOfBirth());
            user.setEmail(data.getEmail());
            user.setFirstName(data.getFirstName());
            user.setLastName(data.getLastName());
            user.setGender(data.getGender());
            user.setObjective(data.getObjective());
            user.setPhone(data.getPhone());
            user.setHonNhan(data.getHonNhan());
            user.setQuocGia(data.getQuocGia());
            user.setQuoctich(data.getQuocTich());
            user.setSkills(data.getSkills());
            user.setThanhTichs(data.getThanhTichs());
            user.setExperiences(data.getKinhNghiems());
            user.setHocTaps(data.getHocTaps());
        return user;
    }

    @Override
    public List<Created_cv> findOneAccount(int idAccount) {
        return createCVRepository.findByAccount(idAccount);
    }

}

package gao.internfinder.backend.Service;

import gao.internfinder.backend.Entity.Created_cv;
import gao.internfinder.backend.dto.CVDTO;
import gao.internfinder.backend.dto.DataCVDTO;
import gao.internfinder.backend.dto.User;

import java.util.List;

public interface ICreateCV {
    void addCV(CVDTO cv);
    User postdata(DataCVDTO cv);

    List<Created_cv> findOneAccount(int idAccount);
}

package gao.internfinder.backend.Service;

import gao.internfinder.backend.dto.CVDTO;
import gao.internfinder.backend.dto.DataCVDTO;
import gao.internfinder.backend.dto.User;

public interface ICreateCV {
    void addCV(CVDTO cv);
    User postdata(DataCVDTO cv);
}

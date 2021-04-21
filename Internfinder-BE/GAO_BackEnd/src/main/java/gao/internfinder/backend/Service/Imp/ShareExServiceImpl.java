package gao.internfinder.backend.Service.Imp;

import gao.internfinder.backend.Service.ShareExService;
import gao.internfinder.backend.dto.ShareExDTO;
import gao.internfinder.backend.repository.ShareExRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShareExServiceImpl implements ShareExService {
    @Autowired
    ShareExRepository shareExRepo;
    @Override
    public void createSharePost(ShareExDTO shareExDTO) {
        shareExRepo.createSharePost(
                shareExDTO.getContent(),
                shareExDTO.getTitle(),
                shareExDTO.getCreate_date(),
                shareExDTO.getModife_date(),
                shareExDTO.getId_account(),
                shareExDTO.getIdshare(),
                shareExDTO.getImage_path()
        );

    }
}

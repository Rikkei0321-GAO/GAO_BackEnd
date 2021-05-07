package gao.internfinder.backend.Service.Imp;

import gao.internfinder.backend.Service.ApplyService;
import gao.internfinder.backend.repository.ApplyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ApplySerImp implements ApplyService {
    @Autowired
    ApplyRepository applyRepository;
    @Override
    public Boolean createApply(int id_news, int id_account, String url, Date create_date) {
        try {
            applyRepository.createApply(id_news,id_account,url, create_date);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}

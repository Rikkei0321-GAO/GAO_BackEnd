package gao.internfinder.backend.Service;

import java.util.Date;

public interface ApplyService {
    Boolean createApply(int id_news, int id_account,String url, Date create_date);

}

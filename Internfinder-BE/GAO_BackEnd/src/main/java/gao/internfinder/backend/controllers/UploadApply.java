package gao.internfinder.backend.controllers;

import gao.internfinder.backend.Service.ApplyService;
import gao.internfinder.backend.dto.ApplyDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/apply")
public class UploadApply {

    @Autowired
    ApplyService applyService;

    @RequestMapping(value = "/create-apply", method = RequestMethod.POST)
    @ResponseBody
    public boolean createPost(@RequestBody ApplyDto applyDto) {
        if (applyDto != null) {
            if (applyService.createApply(applyDto.id_news,applyDto.id_account,applyDto.url,applyDto.create_date)) {
                return true;
            }
        }
        return false;
    }
}

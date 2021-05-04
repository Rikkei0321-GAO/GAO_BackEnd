//package gao.internfinder.backend.controllers;
//
//import gao.internfinder.backend.Service.ApplyFilesStorageService;
//import gao.internfinder.backend.dto.ApplyDto;
//import gao.internfinder.backend.dto.ApplyResponseMessage;
//import org.apache.tomcat.jni.FileInfo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.multipart.MultipartFile;
//import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;
//
//import javax.annotation.Resource;
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Controller
//@CrossOrigin("http://localhost:4200")
//public class ApplyController {
//
//    @Autowired
//    ApplyFilesStorageService storageService;
//
//    @PostMapping("/upload")
//    public ResponseEntity<ApplyResponseMessage> uploadFile(@RequestParam("file") MultipartFile file) {
//        String message = "";
//        try {
//            storageService.save(file);
//
//            message = "Uppload file thành công: " + file.getOriginalFilename();
//            return ResponseEntity.status(HttpStatus.OK).body(new ApplyResponseMessage(message));
//        } catch (Exception e) {
//            message = "Không thể Upload file: " + file.getOriginalFilename() + "!";
//            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ApplyResponseMessage(message));
//        }
//    }
//
//    @GetMapping("/files")
//    public ResponseEntity<List<ApplyDto>> getListFiles() {
//        List<FileInfo> fileInfos = storageService.loadAll().map(path -> {
//            String url = MvcUriComponentsBuilder
//                    .fromMethodName(ApplyController.class, "getFile", path.getFileName().toString()).build().toString();
//            return new FileInfo(filename, url);
//        }).collect(Collectors.toList());
//
//        return ResponseEntity.status(HttpStatus.OK).body(fileInfos);
//    }
//
//    @GetMapping("/files/{filename:.+}")
//    @ResponseBody
//    public ResponseEntity<Resource> getFile(@PathVariable String filename) {
//        Resource file = storageService.load(filename);
//        return ResponseEntity.ok()
//                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + file.getFilename() + "\"").body(file);
//    }
//}
//}

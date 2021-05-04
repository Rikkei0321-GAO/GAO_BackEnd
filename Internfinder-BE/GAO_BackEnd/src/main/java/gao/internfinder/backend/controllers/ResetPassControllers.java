package gao.internfinder.backend.controllers;


import gao.internfinder.backend.Service.ResetPassService;
import gao.internfinder.backend.payload.request.MailRequest;
import gao.internfinder.backend.payload.request.ResetPassRequest;
import gao.internfinder.backend.payload.request.VerifyRequest;
import gao.internfinder.backend.payload.response.MessageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.mail.MessagingException;
import java.io.UnsupportedEncodingException;

@RestController
@RequestMapping("api/public")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ResetPassControllers {
    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    ResetPassService resetPassService;

    @PostMapping("/verify")
    public ResponseEntity<?> VerifyEmail(@RequestBody VerifyRequest code)
    {
        Boolean isVerified = resetPassService.findAccountByVerificationCode(code.getCode());
        if (isVerified)
        {
            return ResponseEntity.ok(new MessageResponse("activated"));
        }else {
            return ResponseEntity.ok(new MessageResponse("error"));

        }
    }
    @PostMapping("/reset-password")
    public ResponseEntity<?> reset(@RequestBody MailRequest mailRequest) throws MessagingException, UnsupportedEncodingException {

        if (resetPassService.existsByEmails(mailRequest.getEmail()) != null) {
            resetPassService.addVerificationCode(mailRequest.getEmail());
            return ResponseEntity.ok(new MessageResponse("Sent email "));
        }
        System.out.println("Can not find email");
        return ResponseEntity
                .badRequest()
                .body(new MessageResponse("Tài khoản không đúng"));
    }
    @PostMapping("/verify-password")
    public ResponseEntity<?> VerifyPassword(@RequestBody VerifyRequest code) {
        Boolean isVerified = resetPassService.findAccountByVerificationCodeToResetPassword(code.getCode());
        if (isVerified) {
            return ResponseEntity.ok(new MessageResponse("accepted"));

        }
        else {
            return ResponseEntity.ok(new MessageResponse("error"));
        }
    }
    @PostMapping("/do-reset-password")
    public ResponseEntity<?> doResetPassword(@RequestBody ResetPassRequest resetPassRequest) {
        resetPassService.saveNewPassword(passwordEncoder.encode(resetPassRequest.getPassword()), resetPassRequest.getCode());
        return ResponseEntity.ok(new MessageResponse("success"));
    }
}

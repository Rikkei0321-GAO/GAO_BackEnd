package gao.internfinder.backend.controllers;

import gao.internfinder.backend.payload.reponse.MessageRespone;
import gao.internfinder.backend.payload.request.LoginRequest;
import gao.internfinder.backend.payload.request.ResetPassRequest;
import gao.internfinder.backend.payload.request.VerifyRequest;
import gao.internfinder.backend.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.mail.MessagingException;
import java.io.UnsupportedEncodingException;

@RestController
@RequestMapping("api/public")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class SecurityControllers {


    @Autowired
    private AccountService accountService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/verify")
    public ResponseEntity<?> VerifyEmail(@RequestBody VerifyRequest code)
    {
        Boolean isVerified = accountService.findAccountByVerificationCode(code.getCode());
        if (isVerified)
        {
            return ResponseEntity.ok(new MessageRespone("activated"));
        }else {
            return ResponseEntity.ok(new MessageRespone("error"));

        }
    }

    @PostMapping("/reset-password")
    public ResponseEntity<?> reset(@RequestBody LoginRequest loginRequest) throws MessagingException, UnsupportedEncodingException {

        if (accountService.existsByUserName(loginRequest.getEmail()) != null) {
            accountService.addVerificationCode(loginRequest.getEmail());
            return ResponseEntity.ok(new MessageRespone("Sent email "));
        }
        System.out.println("Can not find email");
        return ResponseEntity
                .badRequest()
                .body(new MessageRespone("Tài khoản không đúng"));
    }


    @PostMapping("/verify-password")
    public ResponseEntity<?> VerifyPassword(@RequestBody VerifyRequest code) {
        Boolean isVerified = accountService.findAccountByVerificationCodeToResetPassword(code.getCode());
        if (isVerified) {
            return ResponseEntity.ok(new MessageRespone("accepted"));

        }
        else {
            return ResponseEntity.ok(new MessageRespone("error"));
        }
    }
    @PostMapping("/do-reset-password")
    public ResponseEntity<?> doResetPassword(@RequestBody ResetPassRequest resetPassRequest) {
        accountService.saveNewPassword(passwordEncoder.encode(resetPassRequest.getPassword()), resetPassRequest.getCode());
        return ResponseEntity.ok(new MessageRespone("success"));
    }





}

//package gao.internfinder.backend.controller;
//
//
//import gao.internfinder.backend.jwt.JwtUtility;
//import gao.internfinder.backend.payload.request.*;
//import gao.internfinder.backend.payload.response.JwtResponse;
//import gao.internfinder.backend.payload.response.MessageResponse;
//import gao.internfinder.backend.services.AccountService;
//import gao.internfinder.backend.services.RoleService;
//import gao.internfinder.backend.services.impl.AccountDetailsImpl;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.web.bind.annotation.*;
//
//import javax.mail.MessagingException;
//import javax.validation.Valid;
//import java.io.UnsupportedEncodingException;
//import java.util.List;
//
//import java.util.stream.Collectors;
//
//@RestController
//@RequestMapping("api/public")
//@CrossOrigin(origins = "*", allowedHeaders = "*")
//public class SecurityController {
//    @Autowired
//    private JwtUtility jwtUtility;
//
//    @Autowired
//    private PasswordEncoder passwordEncoder;
//    @Autowired
//    private AuthenticationManager authenticationManager;
//    @Autowired
//    private AccountService accountService;
//    @Autowired
//    private RoleService roleService;
//    @Autowired
//    private PasswordEncoder encoder;
//
//    @PostMapping("/login")
//    public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {
//        Authentication authentication = authenticationManager.authenticate(
//                new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));
//
//        SecurityContextHolder.getContext().setAuthentication(authentication);
//        String jwt = jwtUtility.generateJwtToken(loginRequest.getUsername());
//        AccountDetailsImpl userDetails = (AccountDetailsImpl) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//        List<String> roles = userDetails.getAuthorities().stream()
//                .map(GrantedAuthority::getAuthority)
//                .collect(Collectors.toList());
//
//        return ResponseEntity.ok(new JwtResponse(jwt,
//                userDetails.getId(),
//                userDetails.getUsername(),
//                roles));
//    }
//
//    @PostMapping("/verify")
//    public ResponseEntity<?> VerifyEmail(@RequestBody VerifyRequest code)
//    {
//        Boolean isVerified = accountService.findAccountByVerificationCode(code.getCode());
//        if (isVerified)
//        {
//            return ResponseEntity.ok(new MessageResponse("activated"));
//        }else {
//            return ResponseEntity.ok(new MessageResponse("error"));
//
//        }
//    }
//
//    @PostMapping("/reset-password")
//    public ResponseEntity<?> reset(@RequestBody MailRequest mailRequest) throws MessagingException, UnsupportedEncodingException {
//
//        if (accountService.existsByEmail(mailRequest.getEmail()) != null) {
//            accountService.addVerificationCode(mailRequest.getEmail());
//            return ResponseEntity.ok(new MessageResponse("Sent email "));
//        }
//        System.out.println("Can not find email");
//        return ResponseEntity
//                .badRequest()
//                .body(new MessageResponse("Tài khoản không đúng"));
//    }
//
//
//    @PostMapping("/verify-password")
//    public ResponseEntity<?> VerifyPassword(@RequestBody VerifyRequest code) {
//        Boolean isVerified = accountService.findAccountByVerificationCodeToResetPassword(code.getCode());
//        if (isVerified) {
//            return ResponseEntity.ok(new MessageResponse("accepted"));
//
//        }
//        else {
//            return ResponseEntity.ok(new MessageResponse("error"));
//        }
//    }
//    @PostMapping("/do-reset-password")
//    public ResponseEntity<?> doResetPassword(@RequestBody ResetPassRequest resetPassRequest) {
//        accountService.saveNewPassword(passwordEncoder.encode(resetPassRequest.getPassword()), resetPassRequest.getCode());
//        return ResponseEntity.ok(new MessageResponse("success"));
//    }
//
//
//
//}
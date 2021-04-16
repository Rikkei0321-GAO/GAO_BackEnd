//package gao.internfinder.backend.Controllers;
//
//
//import gao.internfinder.backend.jwt.JwtUtility;
//import gao.internfinder.backend.payload.request.LoginRequest;
//import gao.internfinder.backend.payload.response.JwtResponse;
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
//import javax.validation.Valid;
//import java.util.List;
//import java.util.stream.Collectors;
//
//@RestController
//@RequestMapping("api/public")
//@CrossOrigin(origins = "*", allowedHeaders = "*")
//public class SecurityController {
//    @Autowired
//    private JwtUtility jwtUtility;
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
////    /**
////     * Nguyen Van Linh made it
////     */
////    @PostMapping("/signup")
////    public ResponseEntity<?> registerUser(@Valid @RequestBody SignupRequest signUpRequest) throws MessagingException, UnsupportedEncodingException {
////
////        if (accountService.existsByUserName(signUpRequest.getUsername())!=null) {
////            return ResponseEntity
////                    .badRequest()
////                    .body(new MessageResponse("Tên đăng nhập đã được đăng ký!!!"));
////        }
////        //Encode password by BCrypt
////        String passwordEncrypt = encoder.encode(signUpRequest.getPassword());
////
////        //Add new user's account to database
////        accountService.addNew(signUpRequest.getUsername(),
////                passwordEncrypt,
////                signUpRequest.getNameCompany(),
////                signUpRequest.getAddress(),
////                signUpRequest.getPhone(),
////                signUpRequest.getTax(),
////                signUpRequest.getNameContact(),
////                signUpRequest.getEmail()
////        );
////        //Find ID user's account newest after add to database
//////        Integer idAccountAfterCreated = accountService.findIdUserByUserName(signUpRequest.getUsername());
////        //Set default role is "ROLE_USER"
//////        roleService.setDefaultRole(idAccountAfterCreated, 1);
////        //Add new patient
////        return ResponseEntity.ok(new MessageResponse("Đăng ký tài khoản thành công!"));
////    }
//
////    /**
////     * Nguyen Van Linh made it
////     */
////    @PostMapping("/verify")
////    public ResponseEntity<?> VerifyEmail(@RequestBody VerifyRequest code) {
////        Boolean isVerified = accountService.findAccountByVerificationCode(code.getCode());
////        if (isVerified) {
////            return ResponseEntity.ok(new MessageResponse("activated"));
////        } else {
////            return ResponseEntity.ok(new MessageResponse("error"));
////        }
////    }
////
////    /**
////     * Nguyen Van Linh made it
////     */
////    @PostMapping("/reset-password")
////    public ResponseEntity<?> reset(@RequestBody LoginRequest loginRequest) throws MessagingException, UnsupportedEncodingException {
////
////        if (accountService.existsByUserName(loginRequest.getUsername()) != null) {
////            accountService.addVerificationCode(loginRequest.getUsername());
////            return ResponseEntity.ok(new MessageResponse("Sent email "));
////        }
////        return ResponseEntity
////                .badRequest()
////                .body(new MessageResponse("Tài khoản không đúng"));
////    }
////
////    /**
////     * Nguyen Van Linh made it
////     */
////    @PostMapping("/verify-password")
////    public ResponseEntity<?> VerifyPassword(@RequestBody VerifyRequest code) {
////        Boolean isVerified = accountService.findAccountByVerificationCodeToResetPassword(code.getCode());
////        if (isVerified) {
////            return ResponseEntity.ok(new MessageResponse("accepted"));
////        } else {
////            return ResponseEntity.ok(new MessageResponse("error"));
////        }
////    }
////
////    /**
////     * Nguyen Van Linh made it
////     */
////    @PostMapping("/do-reset-password")
////    public ResponseEntity<?> doResetPassword(@RequestBody ResetPassRequest resetPassRequest) {
////        accountService.saveNewPassword(encoder.encode(resetPassRequest.getPassword()), resetPassRequest.getCode());
////        return ResponseEntity.ok(new MessageResponse("success"));
////    }
//
//}
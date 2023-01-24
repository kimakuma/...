package project.projectspring.controller;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import project.projectspring.model.User;
import project.projectspring.repository.UserRepository;

import java.util.Optional;

@RestController
@Controller
@RequestMapping(value = "/login")
public class LoginController {
    private final UserRepository userRepository;

    @Autowired
    public LoginController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("signup")
    public User signup(@RequestParam String name, @RequestParam String email, @RequestParam String pw) {
        return userRepository.save(new User(name, email, pw));
    }

    @GetMapping(value = "/{id}")
    public String login(@PathVariable Long id,
                        HttpServletRequest httpRequest,
                        HttpServletResponse httpResponse) {
        Optional<User> user = userRepository.findByUserId(id);
        System.out.println("user = " + user);

        loginSuccess(httpRequest, httpResponse, user);

        return "redirect:/home";
    }
    
    @GetMapping("/signup-form")
    public String signUpForm() {

        return "/signup-form.html";
    }

    private static void loginSuccess(HttpServletRequest httpRequest, HttpServletResponse httpResponse, Optional<User> user) {

        //Cookie cookie = new Cookie("cookies", user.);
        //httpResponse.addCookie(cookie);
        HttpSession session = httpRequest.getSession();
        session.setAttribute("session", user);
    }
}

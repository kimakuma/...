package project.projectspring.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.servlet.HandlerInterceptor;
import project.projectspring.model.User;

public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        User findedUser = (User) session.getAttribute("session");

        if (findedUser == null) {
            response.sendRedirect("/login-form");

            return false;
        }
        else {
            return true;
        }
    }
}
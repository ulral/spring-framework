package com.firstSpring.authentication;

import com.firstSpring.common.model.User;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/")
public class LoginController {
    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
    @PostMapping("login.do")
    String login(HttpServletRequest request, RedirectAttributes redirectAttributes, User user) {
        logger.info("┌────────────────────────────────────────────────────────────────────────────");
        logger.info("│   request : " + request.getRequestURL() );
        logger.info("└────────────────────────────────────────────────────────────────────────────");
        if (!user.id().isEmpty() && user.password().equals("dinopassword")) {
            return "pages/main/main";  // 로그인 성공 시 페이지로 이동
        } else {
            // 로그인 실패 시 알림 메시지 세션에 추가
            redirectAttributes.addFlashAttribute("loginError", "비밀번호 틀렸음!");
            return "redirect:/";  // 로그인 페이지로 리다이렉트
        }
    }
}

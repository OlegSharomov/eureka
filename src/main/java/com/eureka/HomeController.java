package com.eureka;

import com.eureka.util.FindUsers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    public HomeController() {
        try {
            this.userNames = FindUsers.getAllUsers();
        } catch (RuntimeException e) {
            this.userNames = new ArrayList<>();
        }
    }

    private List<String> userNames;

    @GetMapping("/")
    public String getHomePage() {
        return "home";
    }

    @GetMapping("/check")
    public String userCheck(HttpServletRequest request, Model model) {
        String name = request.getParameter("userName");
        if (userNames.contains(name)) {
            model.addAttribute("answer", String.format("Пользователь %s есть", name));
        } else {
            model.addAttribute("answer", String.format("Пользователя %s нет", name));
        }
        return "result";
    }
}

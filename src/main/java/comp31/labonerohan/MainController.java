package comp31.labonerohan;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/login")
    public String handler1() {
        return "login";
    }

    @GetMapping("/check")
    public String getOrders(@RequestParam String userId, Model model) {
        model.addAttribute("userId", userId);
        if ("olivia".equals(userId) || "ollie".equals(userId)) {
            return "orders";
        }

        else if ("rachel".equals(userId) || "ralph".equals(userId)) {
            return "repairs";
        }

        else if ("sam".equals(userId) || "sue".equals(userId)) {
            return "sales";
        }

        else {
            return "empty";
        }

    }

}

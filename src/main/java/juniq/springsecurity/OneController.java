package juniq.springsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class OneController {
    @GetMapping("/one")
    String one() {
        return "one";
    }
}

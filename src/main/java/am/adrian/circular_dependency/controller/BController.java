package am.adrian.circular_dependency.controller;

import am.adrian.circular_dependency.service.BService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/circular-dependency/bController")
@RequiredArgsConstructor
public class BController {

    private final BService bService;

    @GetMapping("/bMethod")
    public String aMethod() {
        return bService.bMethod();
    }

    @GetMapping("/bMethodUsingAOnlyService")
    public String bMethodUsingAOnlyService() {
        return bService.bMethodUsingAOnlyService();
    }
}

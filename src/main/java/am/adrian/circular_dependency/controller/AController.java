package am.adrian.circular_dependency.controller;

import am.adrian.circular_dependency.service.AService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/circular-dependency/aController")
@RequiredArgsConstructor
public class AController {

    private final AService aService;

    @GetMapping("/aMethod")
    public String aMethod() {
        return aService.aMethod();
    }

    @GetMapping("/aMethodUsingBOnlyService")
    public String aMethodUsingBOnlyService() {
        return aService.aMethodUsingBOnlyService();
    }
}

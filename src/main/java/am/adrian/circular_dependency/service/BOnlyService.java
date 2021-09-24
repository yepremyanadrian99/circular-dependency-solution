package am.adrian.circular_dependency.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
// Declare class package-private not to be access from outside world.
class BOnlyService {

//    Remove both dependencies.
//    private final AOnlyService aOnlyService;

    public String bMethod() {
        return "bMethod called";
    }

//    Move to a service common for both AOnlyService and BOnlyService, CService in this case.
//    public String bMethodUsingAOnlyService() {
//        return "bMethodUsingAOnlyService called" + " -> " + aOnlyService.aMethod();
//    }
}

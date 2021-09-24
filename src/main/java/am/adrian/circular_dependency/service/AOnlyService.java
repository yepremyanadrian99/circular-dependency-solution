package am.adrian.circular_dependency.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
// Declare class package-private not to be access from outside world.
class AOnlyService {

//    Remove both dependencies.
//    private final BOnlyService bOnlyService;

    public String aMethod() {
        return "aMethod called";
    }

//    Move to a service common for both AOnlyService and BOnlyService, CService in this case.
//    public String aMethodUsingBOnlyService() {
//        return "aMethodUsingBOnlyService called" + " -> " + bOnlyService.bMethod();
//    }
}

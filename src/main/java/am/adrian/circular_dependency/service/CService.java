package am.adrian.circular_dependency.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
// Declare class package-private not to be access from outside world.
class CService {

    private final AOnlyService aOnlyService;
    private final BOnlyService bOnlyService;

//  Declare dependent-only methods below.

    public String aMethodUsingBOnlyService() {
        return "aMethodUsingBOnlyService called" + " -> " + bOnlyService.bMethod();
    }

    public String bMethodUsingAOnlyService() {
        return "bMethodUsingAOnlyService called" + " -> " + aOnlyService.aMethod();
    }
}

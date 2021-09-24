package am.adrian.circular_dependency.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BService {

    private final BOnlyService bOnlyService;
    private final CService cService;

//  Delegate to corresponding methods.
//  This is done to restrict access to AOnlyService-specific methods
//  declared inside CService from outside world using BService instance.

    public String bMethod() {
        return bOnlyService.bMethod();
    }

    public String bMethodUsingAOnlyService() {
        return cService.bMethodUsingAOnlyService();
    }
}

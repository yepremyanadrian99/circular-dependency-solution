package am.adrian.circular_dependency.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AService {

    private final AOnlyService aOnlyService;
    private final CService cService;

//  Delegate to corresponding methods.
//  This is done to restrict access to BOnlyService-specific methods
//  declared inside CService from outside world using AService instance.

    public String aMethod() {
        return aOnlyService.aMethod();
    }

    public String aMethodUsingBOnlyService() {
        return cService.aMethodUsingBOnlyService();
    }
}

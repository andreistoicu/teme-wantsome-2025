package org.wantsome.tema;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope ("singleton")
//@Scope("prototype")
public class CounterService {
    private int counter = 0;

    public int increment() {
        return ++counter;
    }
}

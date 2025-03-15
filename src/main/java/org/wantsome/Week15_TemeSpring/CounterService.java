package org.wantsome.Week15_TemeSpring;

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

package org.wantsome;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class CounterService  {
    private int counter = 0;
    public int increment() {
        return ++counter;
    }
}

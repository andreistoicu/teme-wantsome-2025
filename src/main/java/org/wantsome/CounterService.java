package org.wantsome;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class CounterService {

    private int count = 0;

    public CounterService() {
        System.out.println("CounterService constructor");
    }

    public int increment() {
        count++;
        return count;
    }

}

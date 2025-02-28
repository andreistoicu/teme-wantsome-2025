package org.wantsome.Ex2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("singleton")
public class SingleCounterService {


        private int counter = 0;

        public int increment(){
            return ++counter;
        }
    }


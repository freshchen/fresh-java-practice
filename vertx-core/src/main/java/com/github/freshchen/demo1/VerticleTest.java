package com.github.freshchen.demo1;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;

public class VerticleTest extends AbstractVerticle {

    @Override
    public void start(Future<Void> startFuture) throws Exception {
        
        System.out.println("Started");
        super.start(startFuture);
    }

}

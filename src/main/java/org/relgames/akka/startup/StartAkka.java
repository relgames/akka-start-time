package org.relgames.akka.startup;

import akka.actor.ActorSystem;

import java.util.concurrent.TimeUnit;

public class StartAkka {
    public static void main(String[] args) {
        long time0 = System.nanoTime();
        ActorSystem.create();
        long time1 = System.nanoTime();
        System.out.println(TimeUnit.NANOSECONDS.toMillis(time1 - time0));
    }
}

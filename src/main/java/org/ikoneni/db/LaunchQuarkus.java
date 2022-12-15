package org.ikoneni.db;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class LaunchQuarkus {
    public static void main(String[] args) {
        System.out.println("Testing quarkus run");
        Quarkus.run(args);
    }
}

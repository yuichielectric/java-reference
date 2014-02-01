package org.yuichi;

public interface InterfaceWithDefaultMethod {
    default String hello(String name) {
        return "Hello, " + name;
    }
}

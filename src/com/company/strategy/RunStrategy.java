package com.company.strategy;

public class RunStrategy implements RouteStrategy {
    @Override
    public void buildRoute(String route) {
       System.out.println(route + "walking.");
    }
}

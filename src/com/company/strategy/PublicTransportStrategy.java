package com.company.strategy;

public class PublicTransportStrategy implements RouteStrategy {
    @Override
    public void buildRoute(String route) {
        System.out.println(route + "taking bus.");
    }
}

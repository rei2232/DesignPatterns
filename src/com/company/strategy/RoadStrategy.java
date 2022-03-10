package com.company.strategy;

public class RoadStrategy implements RouteStrategy{
    @Override
    public void buildRoute(String route) {
        System.out.println(route + "driving with car.");
    }
}

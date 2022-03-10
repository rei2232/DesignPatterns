package com.company.strategy;

public class Navigator {
    private RouteStrategy routeStrategy;

    public Navigator(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    public void changeStrategy(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }
    public void buildRoute() {
        routeStrategy.buildRoute("UB->USA");
    }

}

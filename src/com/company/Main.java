package com.company;

import com.company.strategy.Navigator;
import com.company.strategy.PublicTransportStrategy;
import com.company.strategy.RunStrategy;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Navigator navigator = new Navigator(new PublicTransportStrategy());
        navigator.buildRoute();
        navigator.changeStrategy(new RunStrategy());
        navigator.buildRoute();
    }
}

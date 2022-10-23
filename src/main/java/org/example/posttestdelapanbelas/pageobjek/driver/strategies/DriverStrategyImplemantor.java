package org.example.posttestdelapanbelas.pageobjek.driver.strategies;

import org.example.posttestdelapanbelas.pageobjek.driver.strategies.DriverStrategy;


import org.example.posttestdelapanbelas.pageobjek.utils.Contans;


public class DriverStrategyImplemantor {

    public static DriverStrategy chooseStrategy(String strategy) {
        switch (strategy) {
            case Contans.CHROME:
               return new Chrome();
                //return (DriverStrategy) new Chrome();



            //     case Constants.FIREFOX:
            //         return new Firefox();

            default:
                return null;
        }
    }
}

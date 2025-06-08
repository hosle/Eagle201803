package com.hosle.backtracking;


import java.util.*;

/**
 * A:B:3
 * A:C:4
 * B:D:7
 * C:D:6
 *
 * find all routes from A to D, and print the corresponding total length.
 */
public class FindAllRoutes {

    public static class Route{
        String destination;
        int weight;

        public Route(String destination, int weight){
            this.destination = destination;
            this.weight = weight;
        }
    }


    public void solution(Map<String, List<FindAllRoutes.Route>> routeHashMap, List<Route> result, Route current) {
        if (!routeHashMap.containsKey(current.destination)){
            int total = 0;
            for (Route item : result) {
                total+= item.weight;
                System.out.print(item.destination + ", ");
            }
            System.out.println("Total weight is " + total);
            return;
        }

        List<Route> nextRoute = routeHashMap.get(current.destination);

        for (Route item : nextRoute) {
            result.add(item);
            solution(routeHashMap, result, item);
            result.remove(item);
        }
    }
}

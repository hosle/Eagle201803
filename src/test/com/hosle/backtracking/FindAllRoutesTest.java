package com.hosle.backtracking;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class FindAllRoutesTest {

    // A-B
    @Test
    void solution() {

        Map<String, List<FindAllRoutes.Route>> routeHashMap = Map.of(
                "A", List.of(
                        new FindAllRoutes.Route("B", 3),
                        new FindAllRoutes.Route("C", 4),
                        new FindAllRoutes.Route("D", 8)
                ),
                "B", List.of(new FindAllRoutes.Route("D", 9)),
                "C", List.of(new FindAllRoutes.Route("D", 12))
        );

        FindAllRoutes.Route startPoint = new FindAllRoutes.Route("A", 0);
        ArrayList<FindAllRoutes.Route> result = new ArrayList<>();
        result.add(startPoint);
        new FindAllRoutes().solution(routeHashMap, result, startPoint);

    }
}
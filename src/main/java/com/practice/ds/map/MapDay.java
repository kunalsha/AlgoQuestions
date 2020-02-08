package com.practice.ds.map;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapDay {
    public static void main(String[] args) {
        Map<String, Student> studentMap = MapDummyDataProvider.getDummyMap(1000);

        //1. printSwissStudents
        //printSwissStudents(studentMap);
        
        //2. Remove all except Swiss
        removeExceptSwissStudents(studentMap);
        
        
        


    }

    private static void removeExceptSwissStudents(Map<String, Student> studentMap) {
        studentMap.entrySet().removeIf(x -> !(x.getKey().equalsIgnoreCase("Switzerland")));
        System.out.println("Only Swiss " + studentMap);
    }

    private static void printSwissStudents(Map<String, Student> studentMap ) {
        //Print all those who belongs to Switzerland
        List<Map.Entry<String, Student>> switzerlandStudent = studentMap.entrySet().stream()
                .filter(x -> "Switzerland".equalsIgnoreCase(x.getValue().getAddress().getCountry()))
                .collect(Collectors.toList());

        switzerlandStudent.forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));
    }
}



package com.soapassion.jdk.predicate;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author bassemelsodany
 */
public class EmployeePredicates {

    public static Predicate<Employee> isAdultMale(){
        return p -> p.getGender().equalsIgnoreCase("M") && p.getAge()>18;

    }


    public static Predicate<Employee> isAdultFemale(){
        return p -> p.getGender().equalsIgnoreCase("F") && p.getAge()>18;

    }

    public static Predicate<Employee> isAgeMoreThan(Integer targetAge){
        return p -> p.getAge() > targetAge;

    }

    public static List<Employee> filterEmployees (List<Employee> employees,
                                                  Predicate<Employee> predicate){
        return employees.stream().filter(predicate).collect(Collectors.toList());

    }

}

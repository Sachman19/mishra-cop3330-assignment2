/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Sachin Mishra
 */

package ex40;

import java.util.*;

public class app {
    public static void main(String[] args) {
        List<Map<String, String>> infoList = new ArrayList<>();

        infoList.add(initializeMap("John", "Johnson", "Manager", "2016-12-31"));
        infoList.add(initializeMap("Tou", "Xiong", "Software Engineer", "2016-10-05"));
        infoList.add(initializeMap("Michaela", "Michaelson", "District Manager", "2015-12-19"));
        infoList.add(initializeMap("Jake", "Jacobson", "Programmer", ""));
        infoList.add(initializeMap("Jacquelyn", "Jackson", "DBA", ""));
        infoList.add(initializeMap("Sally", "Webber", "Web Developer", "2015-12-18"));

        comparison(infoList, "lName"); //Up to here is the exact same as the previous program.

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a search string: ");
        String search = input.nextLine();


        printChart(infoList, search);
    }

    public static Map<String, String> initializeMap(String fName, String lName, String pos, String sep) {
        Map<String, String> info = new HashMap<>();
        info.put("fName", fName);
        info.put("lName", lName);
        info.put("pos", pos);
        info.put("sep", sep);

        return info;
    }


    public static void comparison(List<Map<String, String>> array, String key) {
        Map<String, String> temp;

        for (int i = 0; i < array.size(); i++) {
            for (int j = 0; j < array.size() - 1; j++)
                if (array.get(i).get(key).compareTo(array.get(j).get(key)) < 0) {
                    temp = array.get(i);
                    array.set(i, array.get(j));
                    array.set(j, temp);
                }
        }
    }

    public static void printChart(List<Map<String, String>> infoList, String search) {
        System.out.print("Name\t\t\t\t | Position\t\t\t| Separation Date\t\n");
        System.out.print("---------------------|------------------|-----------------\n");
        for (Map<String, String> stringStringMap : infoList) {
            if (stringStringMap.get("fName").contains(search) || stringStringMap.get("lName").contains(search)) {
                System.out.printf("%-20s |", stringStringMap.get("fName") + " " + stringStringMap.get("lName"));
                System.out.printf(" %-17s|", stringStringMap.get("pos"));
                System.out.printf(" %-10s\n", stringStringMap.get("sep"));
            }
        }
    }
}
package com.ism510;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class PasswordStructureQuickSort {

    /**
     * Collection of usernames and passwords in an array and then sorted out.
     * <p>
     *
     * @author Rafael Robledo Alonso
     * Author: Rafael Robledo Alonsos
     * E-mail Address:  rafael.robledoalonso@student.uagc.edu
     * Programming assignment week 3
     * created on: 09/27/2021
     */


    public static void main(String[] args) {
        String[] usernames = {
                "Admin@Password1",
                "Vale.Vicky@ZZZZZZZ",
                "Lane.Lois@VVVVVV",
                "Wayne.Bruce@FFFFFFFF",
                "Parker.Peter@RRRRRRR",
                "Rogers.Steve@QQQQQQ",
                "Luther.Lex@GGGGGG",
                "Osborn.Harry@YYYYYY",
                "Prince.Diana@LLLLLLL",
                "Linda Zoel@PPPPPPPP"};

        for (String username : usernames) {
            System.out.println("Username: " + username.split("@")[0] + ", Password: " + username.split("@")[1]);
        }

        String[] sortedUsernames = Stream.of(usernames)
                .sorted()
                .toArray(String[]::new);

        System.out.println("\n\n**********************Sorted array alphabetically**********************");

        for (String username : sortedUsernames) {
            System.out.println("Username: " + username.split("@")[0] + ", Password: " + username.split("@")[1]);
        }

        System.out.println("\n\n**********************Looking for Captain America!!**********************");

        for (String username : sortedUsernames) {
            if(username.split("@")[0].equals("Rogers.Steve")){
                 System.out.println("Username: " + username.split("@")[0] + ", Password: " + username.split("@")[1]);
            }
        }
    }
}
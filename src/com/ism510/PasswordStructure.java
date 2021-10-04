package com.ism510;

import java.util.HashMap;
import java.util.Map;

public class PasswordStructure {

    /**
        Collection of usernames and passwords.
     *
     * @author Rafael Robledo Alonso
     * Author: Rafael Robledo Alonso
     * E-mail Address:  rafael.robledoalonso@student.uagc.edu
     * Programming assignment week 2
     * created on: 09/20/2021
     */


    public static void main(String[] args) {
        Map<String, String> usernames = new HashMap<>();
        //Admin password
        usernames.put("Admin", "Password1");

        //Rest of usernames and passwords
        usernames.put("Vale.Vicky", "ZZZZZZZ");
        usernames.put("Lane.Lois", "VVVVVV");
        usernames.put("Kent.Clark", "AAAAAA");
        usernames.put("Wayne.Bruce", "FFFFFFFF");
        usernames.put("Parker.Peter", "RRRRRRR");
        usernames.put("Rogers.Steve", "QQQQQQ");
        usernames.put("Luther.Lex", "GGGGGG");
        usernames.put("Osborn.Harry", "YYYYYY");
        usernames.put("Prince.Diana", "LLLLLLL");
        usernames.put("Linda Zoel", "PPPPPPPP");

        usernames.forEach((key, value) -> System.out.println(key + ":" + value));

    }
}
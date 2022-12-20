package com.eureka.util;

import com.sun.jna.platform.win32.Netapi32Util;

import java.util.ArrayList;
import java.util.List;

public final class FindUsers {
    private FindUsers() {
    }

    public static List<String> getAllUsers() {
        ArrayList<String> userNamesFromNetapi32 = new ArrayList<>();
        Netapi32Util.User[] users = Netapi32Util.getUsers();
        for (Netapi32Util.User user : users) {
            userNamesFromNetapi32.add(user.name);
        }
        return userNamesFromNetapi32;
    }
}

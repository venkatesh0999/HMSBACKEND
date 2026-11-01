package com.hospital.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class passwordhash {

    public static void main(String[] args) {
        System.out.println(
            new BCryptPasswordEncoder().encode("Admin@123")
        );
    }
}
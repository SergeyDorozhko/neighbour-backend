/*
 * Copyright (C) 2024 S.Darozhka. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */

package by.darozhka.neighbour;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author S.Darozhka
 */
@SpringBootApplication(scanBasePackages = "by.darozhka.neighbour")
public class NeighbourApplication {

    public static void main(String[] args) {
        SpringApplication.run(NeighbourApplication.class);
    }
}
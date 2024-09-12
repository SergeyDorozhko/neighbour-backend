/*
 * Copyright (C) 2024 S.Darozhka. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */

package by.darozhka.neighbour.controller;

import by.darozhka.neighbour.dto.ItemDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author S.Darozhka
 */
@RestController
@RequestMapping("/public/api/v1/items")
public class ItemController {

    @GetMapping
    public List<ItemDto> getPage(@RequestParam(name = "size") int size) {
        return List.of(new ItemDto(1L, "дрель", "дрель электрическая"));
    }
}

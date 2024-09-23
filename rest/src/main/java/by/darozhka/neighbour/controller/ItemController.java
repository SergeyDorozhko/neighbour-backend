/*
 * Copyright (C) 2024 S.Darozhka. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */

package by.darozhka.neighbour.controller;

import by.darozhka.neighbour.dto.ItemCreateDto;
import by.darozhka.neighbour.dto.ItemDto;
import by.darozhka.neighbour.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author S.Darozhka
 */
@RestController
@RequestMapping("/public/api/v1/items")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping
    public List<ItemDto> getPage(@RequestParam(name = "size") int size) {
        return List.of(new ItemDto(1L, "дрель"));
    }

    @GetMapping("/{id}")
    public ItemDto getItem(@PathVariable(name = "id") Long id) {
        return ItemDto.from(itemService.getItem(id));
    }

    @PostMapping
    public ItemDto createItem(@RequestBody ItemCreateDto request) {
        return ItemDto.from(itemService.save(request.toEntity()));
    }
}

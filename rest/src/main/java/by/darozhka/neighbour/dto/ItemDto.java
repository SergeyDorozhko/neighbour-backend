/*
 * Copyright (C) 2024 S.Darozhka. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */

package by.darozhka.neighbour.dto;

import by.darozhka.neighbour.entity.Item;

import java.util.Objects;

/**
 * @author S.Darozhka
 */
public record ItemDto(Long id, String name) {

    public static ItemDto from(Item item) {
        if (Objects.isNull(item)) {
            return null;
        }

        return new ItemDto(item.getId(),
                item.getName());
    }
}

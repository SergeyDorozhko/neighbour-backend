/*
 * Copyright (C) 2024 S.Darozhka. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */

package by.darozhka.neighbour.dto;

import by.darozhka.neighbour.entity.Item;

/**
 * @author S.Darozhka
 */
public record ItemCreateDto(String name) {

    public Item toEntity() {
        Item item = new Item();
        item.setName(name());

        return item;
    }
}

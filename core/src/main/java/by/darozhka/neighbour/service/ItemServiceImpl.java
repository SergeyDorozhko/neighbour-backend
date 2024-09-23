/*
 * Copyright (C) 2024 S.Darozhka. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */

package by.darozhka.neighbour.service;

import by.darozhka.neighbour.entity.Item;
import by.darozhka.neighbour.repository.ItemRepository;
import org.apache.commons.lang3.Validate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @author S.Darozhka
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public Item getItem(Long id) {
        Validate.notNull(id, "Id is null.");

        return itemRepository.getReferenceById(id);
    }

    @Override
    public Item save(Item item) {
        Validate.notNull(item, "Item is null");

        if (Objects.nonNull(item.getId())) {
            Item old = getItem(item.getId());
            old.setName(item.getName());
        }

        return itemRepository.save(item);
    }
}

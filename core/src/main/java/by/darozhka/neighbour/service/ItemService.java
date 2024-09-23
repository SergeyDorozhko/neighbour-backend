/*
 * Copyright (C) 2024 S.Darozhka. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */

package by.darozhka.neighbour.service;

import by.darozhka.neighbour.entity.Item;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author S.Darozhka
 */
@Transactional(readOnly = true)
public interface ItemService {

    Item getItem(Long id);

    @Transactional(readOnly = false)
    Item save(Item item);

}

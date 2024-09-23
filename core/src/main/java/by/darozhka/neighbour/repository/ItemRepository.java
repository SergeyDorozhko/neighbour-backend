/*
 * Copyright (C) 2024 S.Darozhka. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */

package by.darozhka.neighbour.repository;

import by.darozhka.neighbour.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author S.Darozhka
 */
public interface ItemRepository extends JpaRepository<Item, Long> {
}

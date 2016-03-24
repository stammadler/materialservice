package de.bdpadler.material.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import de.bdpadler.material.model.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {

}

package de.bdpadler.material.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import de.bdpadler.material.model.Inventory;
import de.bdpadler.material.repository.InventoryRepository;

@RestController
@RequestMapping(value = "inventory")
public class InventoryController {

	@Autowired
	InventoryRepository inventoryRepository;
	
	@RequestMapping
	public List<Inventory> getAll() {
		return inventoryRepository.findAll();
	}

	
	@RequestMapping(value = "info", method = RequestMethod.GET)
	public String info() {
		return "BdP Materialservice";
	}
	
	@RequestMapping(value = "dummies", method = {RequestMethod.GET, RequestMethod.POST})
	public String dummies() {
		Inventory[] inv = new Inventory[] { 
			new Inventory("Kohtenplane 1"),
			new Inventory("Kohtenplane 2"),
			new Inventory("Kohtenplane 3"),
			new Inventory("Kohtenplane 4"),
			new Inventory("Kohtenabgdeckplane"),			
			new Inventory("Zargesbox")			
		};
		try {
			for (Inventory i : inv) {
				inventoryRepository.save(i);
			}
			return "Dummies created";
		} catch (Exception e) {
			return "Error creating dummies";
		}
	}
	
}

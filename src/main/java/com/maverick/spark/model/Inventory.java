package com.maverick.spark.model;

import java.util.*;

/**
 * Created by abhinav on 2017-03-21.
 */
public class Inventory {
	Map<Long, Long> itemQuantity;

	Long getQuantity(Long itemNumber) {
		return itemQuantity.get(itemNumber);
	}

	void addItems(Long itemNumber, Long quantity) {
		itemQuantity.put(itemNumber, getQuantity(itemNumber) + quantity);
	}
}

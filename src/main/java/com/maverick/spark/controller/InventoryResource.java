package com.maverick.spark.controller;

import spark.*;

/**
 * Created by abhinav on 2017-03-21.
 */
public class InventoryResource {
	public InventoryResource() {
		setupEndpoints();
	}

	private void setupEndpoints() {
		Spark.path("/shop/api/inventory", () -> {
			Spark.get("/:itemNumber", InventoryResource::getItem);
			Spark.post("/:itemNumber", InventoryResource::addItem);
		});
	}

	private static Object getItem(Request request, Response response) {
		return null;
	}

	private static Object addItem(Request request, Response response) {
		return null;
	}
}

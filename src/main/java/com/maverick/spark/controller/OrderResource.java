package com.maverick.spark.controller;

import com.maverick.spark.model.*;
import spark.*;

/**
 * Created by abhinav on 2017-03-19.
 */
public class OrderResource {

	public OrderResource() {
		setupEndpoints();
	}

	private void setupEndpoints() {
		Spark.path("/shop/api/order", () -> {
			Spark.get("/:orderNumber", OrderResource::getOrder);
			Spark.post("/:orderNumber", OrderResource::placeOrder);
		});
	}

	private static Order getOrder(Request req, Response res) {
		System.out.println("getOrder");
		return new Order();
	}

	private static Response placeOrder(Request req, Response res) {
		System.out.println("placeOrder");
		res.status(201);
		return res;
	}

}

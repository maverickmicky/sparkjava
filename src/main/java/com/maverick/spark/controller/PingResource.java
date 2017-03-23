package com.maverick.spark.controller;

import spark.*;

/**
 * Created by abhinav on 2017-03-20.
 */
public class PingResource {

	public PingResource() {
		setupEndpoints();
	}

	private void setupEndpoints() {
		Spark.get("/shop/ping", (req, res) -> {return "Pong";});
	}

}

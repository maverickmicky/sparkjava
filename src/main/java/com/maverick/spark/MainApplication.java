package com.maverick.spark;

import com.maverick.spark.controller.*;

/**
 * Created by abhinav on 2017-03-19.
 */
public class MainApplication {
	public static void main(String[] args) {
		new PingResource();
		new OrderResource();
	}
}

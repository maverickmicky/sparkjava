package com.maverick.spark.model;

import java.util.*;

/**
 * Created by abhinav on 2017-03-19.
 */
public class Order {
	Long number;
	Long customerNumber;
	Set<Long> items;
	String promoCode;
}

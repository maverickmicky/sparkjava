package com.maverick.spark.view;

import spark.*;
import spark.template.velocity.*;

import java.util.*;

/**
 * Created by abhinav on 2017-03-21.
 */
public final class RenderOrder {

	public static void main(final String[] args) {

		Spark.get("/hello", (request, response) -> {
			Map<String, Object> model = new HashMap<>();
			model.put("hello", "Velocity World");
			model.put("person", new Person("Foobar"));

			// The wm files are located under the resources directory
			return new ModelAndView(model, "hello.vm");
		}, new VelocityTemplateEngine());

	}

	public static class Person {
		private String name;

		public Person(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
	}
}
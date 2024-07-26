package edu.cpcc.labs.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import edu.cpcc.labs.model.Greeting;

@RestController
public class GreetingController {

	private static final String template = "Greetings, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/")
	@ResponseBody
	public String sayHello() {
		return "hello";
	}

	@GetMapping("/api/greetings/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {

		Greeting greetingObject = null;

		long newCounter = 0;

		newCounter = counter.incrementAndGet();

		if (newCounter % 2 != 0) {

			String templateWithName = String.format(template, name);

			greetingObject = new Greeting(newCounter, templateWithName);
		}

		System.out.println(greetingObject.toString());
		return greetingObject;

	}

}

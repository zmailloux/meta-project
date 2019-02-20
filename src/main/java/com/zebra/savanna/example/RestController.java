package com.zebra.savanna.example;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestController {

	private static final String template = "welcome to innersource yo, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/test")
	@ResponseBody
	public DataModel sayHello(@RequestParam(name = "name", required = false, defaultValue = "Stranger") String name) {
		return new DataModel(counter.incrementAndGet(), String.format(template, name));
	}
}

package com.priyanshu.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@RequestMapping("/topic")
	public List<Topic> getAllTopics() {
		return Arrays.asList(
				new Topic("spring","Spring-Framework","Basics of Spring-Framework"),
				new Topic("java","Java","Basics of Java"),
				new Topic("javascript","JavaScript","Basics of JavaScript")
				);
	}
}

package com.priyanshu.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = Arrays.asList(
			new Topic("spring","Spring-Framework","Basics of Spring-Framework"),
			new Topic("java","Java","Basics of Java"),
			new Topic("javascript","JavaScript","Basics of JavaScript")
			);
	
	public List<Topic> getAllTopics(){
		return topics;
	}

	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
}

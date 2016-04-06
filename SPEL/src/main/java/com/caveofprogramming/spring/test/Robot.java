package com.caveofprogramming.spring.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Robot {
	@Autowired
	private String id="Deafult";
	@Autowired
	private String speech="hello";

	public void setId(String id) {
		this.id = id;
	}

	public void setSpeech(String speech) {
		this.speech = speech;
	}

	public void speak() {
		System.out.println(id);
		System.out.println(speech);
	}
}

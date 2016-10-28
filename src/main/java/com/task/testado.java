package com.task;

import javax.annotation.PostConstruct;
import javax.xml.ws.ServiceMode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service	
public class testado {
	@Autowired
	taskJob t;
	
	@PostConstruct
	public void  init(){
		t.job1();
	}
	
}

package com.mps.misys.service;


import com.mps.misys.model.Backlog;

@org.springframework.stereotype.Component
public class BacklogServiceImpl implements BacklogService {
	
	private Backlog backlog = new Backlog();

	@Override
	public Backlog getBacklog() {
		return backlog;
	}
}
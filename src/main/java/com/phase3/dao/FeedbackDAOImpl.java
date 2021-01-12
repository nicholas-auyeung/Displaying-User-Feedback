package com.phase3.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phase3.entity.Feedback;
import com.phase3.repository.FeedbackRepository;

@Service
public class FeedbackDAOImpl implements FeedbackDAO{
	@Autowired
	FeedbackRepository repo;

	@Override
	public boolean addFeedback(Feedback fb) {
		repo.save(fb);
		return true;
	}

	@Override
	public boolean getFeedback(long fId) {
		repo.findById(fId);
		return true;
	}

	@Override
	public List<Feedback> getAllFeedback() {
		List<Feedback> allFeedback = (List<Feedback>)repo.findAll();
		return allFeedback;
	}

	
	
	

}

package com.phase3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phase3.dao.FeedbackDAO;
import com.phase3.entity.Feedback;

@Service
public class FeedbackServiceImpl implements FeedbackService{
	
	@Autowired
	FeedbackDAO dao;

	@Override
	public boolean addFeedback(Feedback fb) {
		dao.addFeedback(fb);
		return true;
	}

	@Override
	public boolean getFeedback(long fId) {
		dao.getFeedback(fId);
		return true;
	}

	@Override
	public List<Feedback> getAllFeedback() {
		return dao.getAllFeedback();
	}

	

}

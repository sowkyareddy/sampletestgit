package com.main.dao;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.model.Train;
import com.main.repository.TrainRepository;
import com.main.service.TrainService;

// TrainService service=new TarinDao();
//@Component-model
//@Service-service
//@Repository-repository
@Service
public class TrainDao implements TrainService {
	@Autowired
	private TrainRepository repository;

	/*
	 * 
	 * 
	 */
	public Train addTrains(Train train) {

 Train t=repository.save(train);
		return t;
	}

	@Override
	public List<Train> getAllTrain() {
	List<Train> list	= repository.findAll();
		return list;
	}

	public Train getTrainByNumbers(int trainNumber) {
		 Train t=repository.findById(trainNumber).get();
		return t;
	}

	
}
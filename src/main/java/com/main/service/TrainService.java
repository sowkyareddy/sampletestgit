package com.main.service;


import java.util.List;

import com.main.model.Train;


/*
 * addTrain() we can add train to DB
 * getALllTraun()
 * 
 * 
 * 
 * 
 */
public interface TrainService {

	public Train addTrains(Train train);
	
	public List<Train> getAllTrain();
	
	public Train getTrainByNumbers(int trainNumber);
	
	
	
}

package com.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
@Table(name="Train_Table2")
public class Train {
@Id
private int trainNumber;
private String trainName;
private String sourceStation;
private String destinationStation;
//"RUNNING
@Enumerated(EnumType.STRING )
private TrainStatus trainStatus;
@OneToOne(cascade=CascadeType.ALL)
private Route route;

@Override
public String toString() {
	return "Train [trainNumber=" + trainNumber + ", trainName=" + trainName + ", sourceStation=" + sourceStation
			+ ", destinationStation=" + destinationStation + ", trainStatus=" + trainStatus + ", route=" + route + "]";
}
public int getTrainNumber() {
	return trainNumber;
}
public void setTrainNumber(int trainNumber) {
	this.trainNumber = trainNumber;
}
public String getTrainName() {
	return trainName;
}
public void setTraiName(String trainName) {
	this.trainName = trainName;
}
public String getSourceStation() {
	return sourceStation;
}
public void setSourceStation(String sourceStation) {
	this.sourceStation = sourceStation;
}
public String getDestinationStation() {
	return destinationStation;
}
public void setDestinationStation(String destinationStation) {
	this.destinationStation = destinationStation;
}
public TrainStatus getTrainStatus() {
	return trainStatus;
}
public void setTrainStatus(TrainStatus trainStatus) {
	this.trainStatus = trainStatus;
}
public Route getRoute() {
	return route;
}
public void setRoute(Route route) {
	this.route = route;
}
}
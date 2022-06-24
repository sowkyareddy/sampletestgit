package com.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn; 	
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="Station_table2")
public class Station {
	@Id
	private int stationCode;
	private String stationName;
	private String state;
	@JsonBackReference
	//route_route_id
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="routeId", nullable=false)
	private Route route;
	public int getStationCode() {
		return stationCode;
	}
	public Route getRoute() {
		return route;
	}
	public void setRoute(Route route) {
		this.route = route;
	}
	public void setStationCode(int stationCode) {
		this.stationCode = stationCode;
	}
	public String getStationName() {
		return stationName;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Station [stationCode=" + stationCode + ", stationName=" + stationName + ", state=" + state + "]";
	}
}

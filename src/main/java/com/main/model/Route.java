package com.main.model;

import java.util.List;

import javax.persistence.CascadeType; 
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="Route_table2")
public class Route {
	//array, collection, map
	
	//one route--can have multilple sattion
@Id
private int routeId;
@JsonManagedReference
@OneToMany(mappedBy = "route" ,cascade=CascadeType.ALL)
private List<Station> stations;
public int getRouteId() {
	return routeId;
}
public void setRouteId(int routeId) {
	this.routeId = routeId;
}
public List<Station> getStations() {
	return stations;
}
public void setStations(List<Station> stations) {
	this.stations = stations;
}
@Override
public String toString() {
	return "Route [routeId=" + routeId + "]";
}

}

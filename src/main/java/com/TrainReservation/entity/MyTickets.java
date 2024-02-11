package com.TrainReservation.entity;

public class MyTickets {

	private int Train_id;
	private String Train_name;
    private String Departure;
    private String Arrival;
    private String Time;
public MyTickets(int train_id, String train_name, String departure, String arrival, String time) {
	super();
	Train_id = train_id;
	Train_name = train_name;
	Departure = departure;
	Arrival = arrival;
	Time = time;
	
	
	
}
public int getTrain_id() {
	return Train_id;
}
public void setTrain_id(int train_id) {
	Train_id = train_id;
}
public String getTrain_name() {
	return Train_name;
}
public void setTrain_name(String train_name) {
	Train_name = train_name;
}
public String getDeparture() {
	return Departure;
}
public void setDeparture(String departure) {
	Departure = departure;
}
public String getArrival() {
	return Arrival;
}
public void setArrival(String arrival) {
	Arrival = arrival;
}
public String getTime() {
	return Time;
}
public void setTime(String time) {
	Time = time;
}
}

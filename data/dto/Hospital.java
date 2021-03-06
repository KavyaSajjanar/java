package com.xworkz.data.dto;
import com.xworkz.data.dto.AppointmentDTO;
public class Hospital {
	private String name;
	private String location;
	private int noOfAppointments=4;
	private AppointmentDTO appointmentDTO;

	public Hospital(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}

	public void appointment(String name,long mobile,int age,String reason,String doctor) {
		this.appointmentDTO=new AppointmentDTO(name,mobile,reason,age,doctor);
	}

	public AppointmentDTO getAppointmentDTO() {
		return appointmentDTO;
	}

	public void setAppointmentDTO(AppointmentDTO appointmentDTO) {
		this.appointmentDTO = appointmentDTO;
	}
	}
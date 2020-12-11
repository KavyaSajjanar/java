package com.xworkz.data;
import com.xworkz.data.dto.Hospital;
import com.xworkz.data.dto.AppointmentDTO;
import com.xworkz.data.dto.AppointmentDTO;
import com.xworkz.data.dto.Hospital;
public class HospitalTester {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hospital hospital=new Hospital("Victoria","City Market");
		
		hospital.appointment("shar", 9739899498l, 34, "skin problem", "Dr.jamadar");
		
		AppointmentDTO appointment=hospital.getAppointmentDTO();
		System.out.println("patient name " +appointment.getPatientName());
		System.out.println("mobile number "+appointment.getMobileNumber());
		System.out.println("doctor name "+appointment.getDoctorName());
		

	}


	}



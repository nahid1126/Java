package com.nasim.model;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.OrderBy;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
public class LeaveRequest {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int leave_id;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fromDate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date toDate;
	private String leaveType;
	private String reason;
	private int duration;

	private String comments;
	
	private String acceptRejectFlag;
	
	@OneToOne
	private Employee_information users;
	
	


	public LeaveRequest() {
		super();
	}




	@Override
	public String toString() {
		return "LeaveRequest [leave_id=" + leave_id + ", fromDate=" + fromDate + ", toDate=" + toDate + ", leaveType="
				+ leaveType + ", reason=" + reason + ", duration=" + duration + ", comments=" + comments
				+ ", acceptRejectFlag=" + acceptRejectFlag + ", users=" + users + "]";
	}


	
	
}

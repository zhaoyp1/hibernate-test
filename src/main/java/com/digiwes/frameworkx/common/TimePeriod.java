package com.digiwes.frameworkx.common;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * A base / value business entity used to represent a period of time, between two time points
 */
public class TimePeriod implements Serializable {

	/**
	 * An instant of time, starting at the TimePeriod
	 * 
	 * Notes:
	 * If null, then represents to the beginning of time
	 */
	private Date startDateTime;
	/**
	 * An instant of time, ending at the TimePeriod:
	 * 
	 * Notes:
	 * If null, then represents to the end of time
	 */
	private Date endDateTime;

	public Date getStartDateTime() {
		return this.startDateTime;
	}

	public void setStartDateTime(Date startDateTime) {
		this.startDateTime = startDateTime;
	}

	public Date getEndDateTime() {
		return this.endDateTime;
	}

	public void setEndDateTime(Date endDateTime) {
		this.endDateTime = endDateTime;
	}

	public TimePeriod() {

	}

	/**
	 * 
	 * @param startDateTime
	 * @param endDateTime
	 */
	public TimePeriod(Date startDateTime, Date endDateTime) {
		this.startDateTime = startDateTime;
		this.endDateTime = endDateTime;
	}

	/**
	 * 
	 * @param time
	 */
	public boolean isInTimePeriod(Date time) {
		// TODO - implement TimePeriod.isInTimePeriod
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param validFor
	 */
	public boolean isInTimePeriod(TimePeriod validFor) {
		// TODO - implement TimePeriod.isInTimePeriod
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param validFor
	 */
	public boolean isOverlap(TimePeriod validFor) {
		// TODO - implement TimePeriod.isOverlap
		throw new UnsupportedOperationException();
	}

	@Override
	public String toString() {
		return "TimePeriod{" +
				"startDateTime=" + startDateTime +
				", endDateTime=" + endDateTime +
				'}';
	}
}
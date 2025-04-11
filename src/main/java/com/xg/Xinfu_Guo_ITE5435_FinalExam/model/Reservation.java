package com.xg.Xinfu_Guo_ITE5435_FinalExam.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalTime;

@Document(collection = "reservations")
public class Reservation {

    @Id
    private String id;

    private String firstName;
    private String lastName;
    private int passengerCount;
    private String travelClass;
    private String phoneNumber;
    private LocalTime time;
    private LocalDate departureDate;

    private String customerId;
    private String paymentId;

    public Reservation() {}

    public Reservation(String id, String firstName, String lastName, int passengerCount, String travelClass, String phoneNumber, LocalTime time, LocalDate departureDate, String customerId, String paymentId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.passengerCount = passengerCount;
        this.travelClass = travelClass;
        this.phoneNumber = phoneNumber;
        this.time = time;
        this.departureDate = departureDate;
        this.customerId = customerId;
        this.paymentId = paymentId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    public String getTravelClass() {
        return travelClass;
    }

    public void setTravelClass(String travelClass) {
        this.travelClass = travelClass;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }
}

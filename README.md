# Husky Air Reservation System - Final Exam Submission

This is a web-based reservation system built with **Spring Boot**, **MongoDB**, **REST APIs**, and **Thymeleaf**, developed for the final exam of course **ITE5435**.

The project allows users to submit flight reservations via a web form and supports full REST operations for three entities: **Reservation**, **Customer**, and **Payment**.

---

## 🔧 Technologies Used

- Java 21  
- Spring Boot 3.4  
- Spring Web (REST API)  
- Spring Data MongoDB  
- Thymeleaf  
- Jackson (for JSON handling)  
- MongoDB  
- Postman (for API testing)

---

## 📦 Project Structure

```
src/
├── controller/
│   ├── ReservationController.java
│   ├── CustomerController.java
│   ├── PaymentController.java
│   └── ReservationFormController.java
├── model/
│   ├── Reservation.java
│   ├── Customer.java
│   └── Payment.java
├── repository/
├── service/
└── templates/
    ├── reservation_form.html
    └── form_success.html
```

---

## 🚀 How to Run

### Prerequisites:
- Java 21+
- MongoDB running locally on port `27017`

### Steps:

```bash
# Run the Spring Boot app
./mvnw spring-boot:run
```

Then open your browser:

```
http://localhost:8080/form
```

Use the form to submit a new reservation. The data will be saved to MongoDB.

---

## 🔁 REST API Endpoints

### Reservation
- `POST /api/reservations`  
- `GET /api/reservations`  
- `GET /api/reservations/{id}`  
- `PUT /api/reservations/{id}`  
- `DELETE /api/reservations/{id}`  

### Customer
- `POST /api/customers`  
- `GET /api/customers`  

### Payment
- `POST /api/payments`  
- `GET /api/payments`  

---

## 🎬 Demo Video

📺 [Click to watch on YouTube](https://youtu.be/qNFvnif4ygA)

---

## 🧪 Sample Postman JSON Body (Reservation)

```json
{
  "firstName": "John",
  "lastName": "Doe",
  "passengerCount": 2,
  "travelClass": "Economy",
  "phoneNumber": "1234567890",
  "time": "15:30",
  "departureDate": "2025-04-25"
}
```

---

## 👨‍💻 Developed By

**Xinfu Guo**  
Student ID: `n01611988`  
Course: ITE5435 - J2EE Business Components  

package com.sda.hibernate.entity;

import javax.persistence.Column;
import java.time.LocalDateTime;

public class Worker {
    public void setFirstName(String FirstName) {
    }
    @Column(nullable = false, length = 50)
    public void setLastName(String LastName) {
    }

    public void setHireDate(LocalDateTime now) {
    }
}

package com.database.connectingdbms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Employee {
   @Id
   private long id;
   private String name;
   private String dept; 
   private String mobileNo;

}

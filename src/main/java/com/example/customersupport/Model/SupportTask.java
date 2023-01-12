package com.example.customersupport.Model;

/*
he support taskhas a unique id and a customerId for the
customer the task concerns. Furthermore,
the support task has a
priority(Stringvalues “LOW”, “MEDIUM”or “HIGH”), a text comment of maximum (1000 characters),

and a status (String values “PENDING”, “INPROGRESS” or “DONE”)*/

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.transaction.Status;
import jakarta.transaction.Transactional;

import java.util.EnumSet;
import java.util.Set;


@Entity
@Table(name = "SUPPORT")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class SupportTask {
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }


    //EnumSet<Status> status = EnumSet.of(Status.DONE, Status.PENDING, Status.INPROGRESS);

    public enum Status {
        PENDING, INPROGRESS, DONE
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;


    @Column(name= "CUSTID")
    protected long customerId;

    @Column(name="PRIO")
    private String priority;

    @Column(name="STATUS")
    private String status ;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getCustomerId() {
        return customerId;
    }
    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }


}

package com.atmira.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.atmira.constants.State;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "Project")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Project {
    
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    
    @Column(name = "name", nullable = false, length = 150)
    private String name;
    
    @Column(name = "hours", nullable = false)
    private int hours;
    
    @Column(name = "rate", nullable = false, precision = 2)
    private Float rate;
    
    @Column(name = "objectivepercent", nullable = false)
    private int objectivepercent;
    
    @Column(name = "initdate")
    private Date initDate;
    
    @Column(name = "estimatedenddate")
    private Date estimatedEndDate;
    
    @Column(name = "realenddate")
    private Date realEndDate;
    
    @Column(name = "state")
    @Enumerated(EnumType.STRING)
    private State state;
}

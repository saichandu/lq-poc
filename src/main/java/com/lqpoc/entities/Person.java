package com.lqpoc.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * <ul>
 * <li>Title: Person.java</li>
 * <li>Description: The class <code>Person</code> .</li>
 * <li>Created: Aug 28, 2021</li>
 * <li>@author 6112363</li>
 * </ul>
 */
@Entity
@Table(name = "Person")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Person implements Serializable {
    @Id
    private String name;

    @Column(name = "phone")
    private String phone;

    @Column(name = "created_dt")
    private Date createdDt;

    @Column(name = "country_code")
    private Integer countryCode;
}

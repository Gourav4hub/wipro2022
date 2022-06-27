package com.wipro.officeapp2.model;

import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name = "role")
@Data
public class Role 
{
    @Id
    @Column(name = "role_id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long roleId;

    @Column(name = "role_name",unique = true,nullable = false)
    private String name;

    @Column(name = "description",nullable = true)
    private String description;
}
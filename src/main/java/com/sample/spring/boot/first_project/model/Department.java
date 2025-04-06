package com.sample.spring.boot.first_project.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Department", schema = "college")
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Cacheable(value = false)
@IdClass(DepartmentID.class)
public class Department {
    @Id
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "hod_id", nullable = true)
    private Integer hodId;
}

package com.example.hibernate.entity;
/**
 * @author Nikolay Studenikin
 */

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(schema = "my_default", name = "persons")
public class Person {

    @EmbeddedId
    private PersonalData personalData;

    @Column(nullable = false, unique = true)
    private String phoneNumber;

    @Column(nullable = false)
    private String cityOfLiving;

    @OneToOne(optional = false)
    private Order order;
}
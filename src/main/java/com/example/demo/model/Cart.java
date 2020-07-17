package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="price")
    private int price;
    @Column(name = "description")
    private String description;
    @Column(name = "image")
    private String image;

    @ToString.Exclude
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;
}

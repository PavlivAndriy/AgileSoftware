package com.softserverinc.edu.entities;

import javax.persistence.*;

/**
 * Created by 37.0 on 02.08.2016.
 */

@Entity
public class Issue {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false)
    private Long id;

}

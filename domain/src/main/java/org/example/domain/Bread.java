package org.example.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Bread {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long breadId;

    @Column(name = "bread_name", nullable = false)
    private String breadName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn (name = "category",nullable = false)
    private Category category;



//test
}

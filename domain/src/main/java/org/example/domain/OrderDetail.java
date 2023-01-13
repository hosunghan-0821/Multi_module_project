package org.example.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.util.Lazy;

import javax.persistence.*;

@Getter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "detail_id", nullable = false)
    private Long orderDetailId;


    @Column
    private int orderCnt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn (name = "order_id",nullable = false)
    private Order orderId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn (name = "bread_id",nullable = false)
    private Bread breadId;



}

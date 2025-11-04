package kr.co.ch09.entity;

import jakarta.persistence.*;
import kr.co.ch09.dto.CartDTO;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "Cart")
public class Cart {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int cartId;
    private String userid;
    private int quantity;

    // private int pno;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pno")
    private Product product;

    public CartDTO toDTO(){
        return CartDTO.builder()
                .cartId(cartId)
                .userid(userid)
                .product(product.toDTO())
                .quantity(quantity)
                .build();
    }
}

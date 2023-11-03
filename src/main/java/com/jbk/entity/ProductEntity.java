package com.jbk.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.jbk.model.Product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "product")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductEntity {
	
	@Id
	@Column(unique = true,nullable = false )
	private Long productId;
	
	@Column(unique = true,nullable = false)
	private String productName;
	
	
	
	@Column(nullable = false)
	private Integer productQty;
	
	@Column(nullable = false)
	private Double productPrice;
	
	

}

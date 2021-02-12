package co.com.worldoffice.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "PRODUCTS")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductEntity implements Serializable{



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDPRODUCT")
	private long idProduct;

	@Column(name = "NAME")
	private String name;

	@Column(name = "TRADEMARK")
	private String trademark;

	@Column(name = "PRICE")
	private double price;

	@Column(name = "STOCK")
	private Integer stock;

	@Column(name = "STATUS")
	private String status;

	@Column(name = "DISCOUNT")
	private Integer discount;

}

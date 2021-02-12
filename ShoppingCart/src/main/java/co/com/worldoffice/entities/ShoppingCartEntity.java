package co.com.worldoffice.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "SHOPPINGCART")
@Builder
public class ShoppingCartEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idCart;

	@Column(name = "CURTOMER")
	private long IdCustomer;

	@CreationTimestamp
	@Column(name = "DATECART")
	@Temporal(TemporalType.DATE)
	private Date date;

	@Column(name = "STATUS")
	private String status;

}

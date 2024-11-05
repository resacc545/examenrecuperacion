package pe.edu.upeu.pruebaAPI2410.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name="coches")
public class Coche {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	@Column(name="placa")
	private String placa;
	@Column(name="puertas")
	private int puertas;
	
	@ManyToOne
	@JoinColumn(name="Marca_id", nullable = false)
	private Marca marca;
	
	@ManyToOne
	@JoinColumn(name="Tipo_id", nullable = false)
	private TipoCoche Tipo;
	
}

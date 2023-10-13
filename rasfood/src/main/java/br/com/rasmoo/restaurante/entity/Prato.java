package br.com.rasmoo.restaurante.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "pratos")
@Data
public class Prato {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private String nome;
  private String descricao;
  private Boolean disponivel;
  private BigDecimal valor;

  @Column(name = "data_de_registro")
  private LocalDateTime dataDeRegistro = LocalDateTime.now();

}

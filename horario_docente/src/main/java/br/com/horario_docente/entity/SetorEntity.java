package br.com.horario_docente.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

	@Entity
	@Table(name = "setor" , schema = "horario_docente")
	public class SetorEntity implements Serializable {

	     private static final long serialVersionUID = 1L;
	     
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "id_setor")
		private Long idsetor;
		
		@Column(name = "nome")
		private String nome;

		public Long getIdsetor() {
			return idsetor;
		}

		public void setIdsetor(Long idsetor) {
			this.idsetor = idsetor;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}
		
		
	}


package com.example.EntregasJa.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Encomenda {
   
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;
   
   @NotNull
   private String destinatario;

   @NotNull
   private String remetente;
   
   @NotNull
   private String nome;
   
   @NotNull
   private String numeroRastreio;
   
   @NotNull
   private String status;
  
   public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getNumeroRastreio() {
	return numeroRastreio;
}

public void setNumeroRastreio(String numeroRastreio) {
	this.numeroRastreio = numeroRastreio;
}

  public String getDestinatario() {
	return destinatario;
}

public void setDestinatario(String destinatario) {
	this.destinatario = destinatario;
}
public String getRemetente() {
	return remetente;
}

public void setRemetente(String remetente) {
	this.remetente = remetente;
}

}

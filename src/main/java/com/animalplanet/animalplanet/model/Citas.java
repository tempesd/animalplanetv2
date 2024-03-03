package com.animalplanet.animalplanet.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.*;

@Entity
@Table(name = "Citas")
public class Citas {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_Cita;

    private String doctor;

    private String propietario;

    private String servicio;

    @JsonFormat(pattern = "yyyy-MM-dd")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
	@Column(name = "fecha")
	private Date fecha;

    private String motivo;

    public Citas() {}
    

    @Override
	public String toString() {
		return "Citas [id_Cita=" + id_Cita + ", doctor=" + doctor + ", propietario=" + propietario + ", servicio="
				+ servicio + ", fecha=" + fecha + ", motivo=" + motivo + "]";
	}

	public Integer getId_Cita() {
        return id_Cita;
    }

    public void setId_Cita(Integer id_Cita) {
        this.id_Cita = id_Cita;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
}

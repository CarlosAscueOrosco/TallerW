package com.tallerweb.sda.repository;

import com.tallerweb.sda.model.Solicitud;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SolicitudRepository extends JpaRepository<Solicitud, Long> {
    List<Solicitud> findByBeneficiarioId(Long beneficiarioId);
}

package com.tallerweb.sda.service;

import com.tallerweb.sda.model.Beneficiario;
import com.tallerweb.sda.model.Solicitud;
import java.util.List;
import java.util.Optional;

public interface SolicitudService {
    List<Solicitud> getAllSolicitudes();
    Optional<Solicitud> getSolicitudById(Long id);
    List<Solicitud> getSolicitudesByBeneficiario(Long beneficiarioId);
    Solicitud saveSolicitud(Solicitud solicitud, Beneficiario beneficiario);
    void deleteSolicitud(Long id);
}
package com.tallerweb.sda.service.impl;

import com.tallerweb.sda.model.Beneficiario;
import com.tallerweb.sda.model.Solicitud;
import com.tallerweb.sda.repository.SolicitudRepository;
import com.tallerweb.sda.service.SolicitudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SolicitudServiceImpl implements SolicitudService {
    @Autowired
    private SolicitudRepository solicitudRepository;

    @Override
    public List<Solicitud> getAllSolicitudes() {
        return solicitudRepository.findAll();
    }

    @Override
    public Optional<Solicitud> getSolicitudById(Long id) {
        return solicitudRepository.findById(id);
    }

    @Override
    public List<Solicitud> getSolicitudesByBeneficiario(Long beneficiarioId) {
        return solicitudRepository.findByBeneficiarioId(beneficiarioId);
    }

    @Override
    public Solicitud saveSolicitud(Solicitud solicitud, Beneficiario beneficiario) {
        solicitud.setBeneficiario(beneficiario);
        return solicitudRepository.save(solicitud);
    }

    @Override
    public void deleteSolicitud(Long id) {
        solicitudRepository.deleteById(id);
    }
}
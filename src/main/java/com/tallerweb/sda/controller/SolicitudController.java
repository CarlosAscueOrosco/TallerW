package com.tallerweb.sda.controller;

import com.tallerweb.sda.model.Solicitud;
import com.tallerweb.sda.model.Beneficiario;
import com.tallerweb.sda.service.SolicitudService;
import com.tallerweb.sda.service.BeneficiarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/solicitudes")
public class SolicitudController {
    @Autowired
    private SolicitudService solicitudService;

    @Autowired
    private BeneficiarioService beneficiarioService;

    @GetMapping
    public List<Solicitud> getAllSolicitudes() {
        return solicitudService.getAllSolicitudes();
    }

    @GetMapping("/{id}")
    public Optional<Solicitud> getSolicitudById(@PathVariable Long id) {
        return solicitudService.getSolicitudById(id);
    }

    @GetMapping("/beneficiario/{beneficiarioId}")
    public List<Solicitud> getSolicitudesByBeneficiario(@PathVariable Long beneficiarioId) {
        return solicitudService.getSolicitudesByBeneficiario(beneficiarioId);
    }

    @PostMapping("/beneficiario/{beneficiarioId}")
    public ResponseEntity<Solicitud> createSolicitud(@PathVariable Long beneficiarioId, @RequestBody Solicitud solicitud) {
        return beneficiarioService.getBeneficiarioById(beneficiarioId)
                .map(beneficiario -> {
                    Solicitud savedSolicitud = solicitudService.saveSolicitud(solicitud, beneficiario);
                    return ResponseEntity.ok(savedSolicitud);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public void deleteSolicitud(@PathVariable Long id) {
        solicitudService.deleteSolicitud(id);
    }
}
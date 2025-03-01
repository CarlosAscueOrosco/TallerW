package com.tallerweb.sda.service;

import com.tallerweb.sda.model.Beneficiario;

import java.util.List;
import java.util.Optional;

public interface BeneficiarioService {
    List<Beneficiario> getAllBeneficiarios();
    Optional<Beneficiario> getBeneficiarioById(Long id);
    Beneficiario saveBeneficiario(Beneficiario beneficiario);
    void deleteBeneficiario(Long id);
}
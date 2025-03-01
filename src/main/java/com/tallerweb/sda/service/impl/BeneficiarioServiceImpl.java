package com.tallerweb.sda.service.impl;

import com.tallerweb.sda.model.Beneficiario;
import com.tallerweb.sda.repository.BeneficiarioRepository;
import com.tallerweb.sda.service.BeneficiarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BeneficiarioServiceImpl implements BeneficiarioService {
    @Autowired
    private BeneficiarioRepository beneficiarioRepository;

    @Override
    public List<Beneficiario> getAllBeneficiarios() {
        return beneficiarioRepository.findAll();
    }

    @Override
    public Optional<Beneficiario> getBeneficiarioById(Long id) {
        return beneficiarioRepository.findById(id);
    }

    @Override
    public Beneficiario saveBeneficiario(Beneficiario beneficiario) {
        return beneficiarioRepository.save(beneficiario);
    }

    @Override
    public void deleteBeneficiario(Long id) {
        beneficiarioRepository.deleteById(id);
    }
}
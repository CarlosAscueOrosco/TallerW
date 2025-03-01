package com.tallerweb.sda.controller;

import com.tallerweb.sda.model.Beneficiario;
import com.tallerweb.sda.service.BeneficiarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/beneficiarios")
public class BeneficiarioController {
    @Autowired
    private BeneficiarioService beneficiarioService;

    @GetMapping
    public List<Beneficiario> getAllBeneficiarios() {
        return beneficiarioService.getAllBeneficiarios();
    }

    @GetMapping("/{id}")
    public Optional<Beneficiario> getBeneficiarioById(@PathVariable Long id) {
        return beneficiarioService.getBeneficiarioById(id);
    }

    @PostMapping
    public Beneficiario createBeneficiario(@RequestBody Beneficiario beneficiario) {
        return beneficiarioService.saveBeneficiario(beneficiario);
    }

    @DeleteMapping("/{id}")
    public void deleteBeneficiario(@PathVariable Long id) {
        beneficiarioService.deleteBeneficiario(id);
    }
}
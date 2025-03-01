package com.tallerweb.sda.service.impl;

import com.tallerweb.sda.model.Donacion;
import com.tallerweb.sda.model.Donante;
import com.tallerweb.sda.repository.DonacionRepository;
import com.tallerweb.sda.service.DonacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DonacionServiceImpl implements DonacionService {
    @Autowired
    private DonacionRepository donacionRepository;

    @Override
    public List<Donacion> getAllDonaciones() {
        return donacionRepository.findAll();
    }

    @Override
    public Optional<Donacion> getDonacionById(Long id) {
        return donacionRepository.findById(id);
    }

    @Override
    public List<Donacion> getDonacionesByDonante(Long donanteId) {
        return donacionRepository.findByDonanteId(donanteId);
    }

    @Override
    public Donacion saveDonacion(Donacion donacion, Donante donante) {
        donacion.setDonante(donante);
        return donacionRepository.save(donacion);
    }

    @Override
    public void deleteDonacion(Long id) {
        donacionRepository.deleteById(id);
    }
}
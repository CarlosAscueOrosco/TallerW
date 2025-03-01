package com.tallerweb.sda.service.impl;

import com.tallerweb.sda.model.Donante;
import com.tallerweb.sda.repository.DonanteRepository;
import com.tallerweb.sda.service.DonanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DonanteServiceImpl implements DonanteService {
    @Autowired
    private DonanteRepository donanteRepository;

    @Override
    public List<Donante> getAllDonantes() {
        return donanteRepository.findAll();
    }

    @Override
    public Optional<Donante> getDonanteById(Long id) {
        return donanteRepository.findById(id);
    }

    @Override
    public Donante saveDonante(Donante donante) {
        return donanteRepository.save(donante);
    }

    @Override
    public void deleteDonante(Long id) {
        donanteRepository.deleteById(id);
    }
}

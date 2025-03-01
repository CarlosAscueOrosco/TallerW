package com.tallerweb.sda.service;

import com.tallerweb.sda.model.Donacion;
import com.tallerweb.sda.model.Donante;
import java.util.List;
import java.util.Optional;

public interface DonacionService {
    List<Donacion> getAllDonaciones();
    Optional<Donacion> getDonacionById(Long id);
    List<Donacion> getDonacionesByDonante(Long donanteId);
    Donacion saveDonacion(Donacion donacion, Donante donante);
    void deleteDonacion(Long id);

}
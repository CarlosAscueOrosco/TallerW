// Servicio Donante (Interfaz)
package com.tallerweb.sda.service;

import com.tallerweb.sda.model.Donante;

import java.util.List;
import java.util.Optional;

public interface DonanteService {
    List<Donante> getAllDonantes();
    Optional<Donante> getDonanteById(Long id);
    Donante saveDonante(Donante donante);
    void deleteDonante(Long id);
}
package com.api.parkingcontrol.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.parkingcontrol.models.ParkingSpotModel;

// extend o JpaRepository que recebe o nosso model e o identificador
// Why? por que o JpaRepository já possui vários métodos prontos para transações com o banco de dados, ex: buscar uma listagem de um determinado recurso, salvar, deletar, etc.
@Repository
public interface ParkingSpotRepository extends JpaRepository <ParkingSpotModel, UUID> {

    boolean existsByLicensePlateCar(String licensePlateCar);
    boolean existsByParkingSpotNumber(String parkingSpotNumber);
    boolean existsByApartmentAndBlock(String apartment, String block);
}

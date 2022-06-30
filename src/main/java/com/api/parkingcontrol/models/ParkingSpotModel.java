package com.api.parkingcontrol.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_PARKING_SPOT") // cria uma tabela no meu banco
public class ParkingSpotModel implements Serializable {
    //relacionado a conversões que vão ser feitas por baixo dos panos, de objetos java para bytes, para serem salvos no banco de dados.
    private static final long serialVersionUID = 1L;

    // MAPEAMENTOS
    @Id // como a classe é uma entidade ela precisa de um identificador
    @GeneratedValue(strategy = GenerationType.AUTO) // o id vai ser gerado de forma automática
    private UUID id;
    @Column(nullable = false, unique = true, length = 10) // o nº da vaga não vai pode ser null, vai ser um campo único, i.e, não vou ter dois cadastros de uma mesma vaga, e limitei o nº de caracters
    private String parkingSpotNumber; // número da vaga
    @Column(nullable = false, unique = true, length = 7) // aplica as restrições, da mesma forma do campo acima
    private String licensePlateCar; // placa do carro
    @Column(nullable = false, length = 70)
    private String brandCar; // marca do carro
    @Column(nullable = false, length = 70)
    private String modelCar; // modelo do carro
    @Column(nullable = false, length = 70)
    private String colorCar; // cor do carro
    @Column(nullable = false)
    private LocalDateTime registrationDate; // data de registro da vaga
    @Column(nullable = false, length = 130)
    private String responsibleName; // nome do responsável
    @Column(nullable = false, length = 30)
    private String apartment;
    @Column(nullable = false, length = 30)
    private String block;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getParkingSpotNumber() {
        return parkingSpotNumber;
    }

    public void setParkingSpotNumber(String parkingSpotNumber) {
        this.parkingSpotNumber = parkingSpotNumber;
    }

    public String getLicensePlateCar() {
        return licensePlateCar;
    }

    public void setLicensePlateCar(String licensePlateCar) {
        this.licensePlateCar = licensePlateCar;
    }

    public String getBrandCar() {
        return brandCar;
    }

    public void setBrandCar(String brandCar) {
        this.brandCar = brandCar;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public String getColorCar() {
        return colorCar;
    }

    public void setColorCar(String colorCar) {
        this.colorCar = colorCar;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getResponsibleName() {
        return responsibleName;
    }

    public void setResponsibleName(String responsibleName) {
        this.responsibleName = responsibleName;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }
}

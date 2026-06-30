package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class loggingmiddleware 
{
    @Entity
    @Table(name="depots")
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    
    public class evaluation
    {
        @Id
        private Long id;

        @NotBlank
        private String MechanicHours;
    }
}

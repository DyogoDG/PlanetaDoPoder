package br.com.unicuritiba.planetadopoder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unicuritiba.planetadopoder.models.Planeta;

public interface PlanetaRepository extends
JpaRepository<Planeta, Long> {
}


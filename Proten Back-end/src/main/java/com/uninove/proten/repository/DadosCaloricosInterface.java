package com.uninove.proten.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uninove.proten.model.DadosCaloricos;

@Repository
public interface DadosCaloricosInterface extends JpaRepository<DadosCaloricos, Long> {

}

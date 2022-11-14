package com.uninove.proten.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uninove.proten.model.Alimentos;

@Repository
public interface AlimentosRepository extends JpaRepository<Alimentos, Long> {

}

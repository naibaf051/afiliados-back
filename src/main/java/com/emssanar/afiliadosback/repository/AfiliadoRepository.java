package com.emssanar.afiliadosback.repository;

import com.emssanar.afiliadosback.entity.Afiliado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AfiliadoRepository extends JpaRepository<Afiliado, Integer> {

}

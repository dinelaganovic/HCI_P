package com.example.backend.Repo;

import com.example.backend.Entity.Kucica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface KucicaRepository extends JpaRepository<Kucica, Long> {
}

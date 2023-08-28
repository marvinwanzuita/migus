package com.mawit.migus.repository;

import com.mawit.migus.entity.Gosto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GostosRepository extends JpaRepository<Gosto, Long> {
}

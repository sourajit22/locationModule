package com.riddik.location.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.riddik.location.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}

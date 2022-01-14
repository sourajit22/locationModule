package com.riddik.location.service;

import java.util.List;

import com.riddik.location.entities.Location;

public interface LocationService {

	Location saveLocation(Location location);

	Location UpdateLocation(Location location);

	void deleteLocation(Location location);

	Location getLocationById(int id);

	List<Location> getAllLocations();

}

package com.revature.boot.service;

import java.util.List;
import java.util.Optional;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.boot.beans.Hotel;
import com.revature.boot.data.HotelRepository;

@Service
public class HotelService 
{
	
	private static final Logger log = Logger.getLogger(HotelService.class);
	
	@Autowired
	private HotelRepository repo;
	
	public Hotel save(Hotel room) 
	{
		return repo.save(room);
	}
	
	public Hotel findById(int id) 
	{
		Optional<Hotel> optional = repo.findById(id);//this returns an optional which returns generics.
		if(optional.isPresent()) 
		{
			return optional.get();
		}
		else
		{
			log.warn("Room " + id + " not found!");
			return null;
		}
		//return repo.findById(id).get();
	}
	
	public List<Hotel> findAll()
	{
		return repo.findAll();
	}
	
	public void delete(int id) 
	{
		repo.deleteById(id);
	}
	
	public List<Hotel> findByPriceRange(double low, double high)
	{
		return repo.findByPriceBetween(low, high);
		
		
	}
}

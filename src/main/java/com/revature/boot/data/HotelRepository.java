package com.revature.boot.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.revature.boot.beans.Hotel;

/**
 * Welcome to Spring Data
 * @author Workshop
 *
 */

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Integer>
{
	//query methods: findBy{PropertyName}.....fluff
	public List<Hotel> findByPriceBetween(double low, double high);
	
	//say you don't know how to build the query method you want,
	//there's something called jpql which is kind of like hql.
	
	@Query("from Hotel")
	public void noIdeaHowToDoThisThing();
			
}

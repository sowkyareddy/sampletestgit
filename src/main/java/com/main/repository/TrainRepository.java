package com.main.repository;


/*
 * save()
 * delete
 * 
 * 
 */

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.main.model.Train;


@Repository
public interface TrainRepository extends JpaRepository<Train, Integer> {
	/*
	 * Query q=em.createQuery("JPQL)
	 * q.set
	 * 
	 */
	
	
	
	@Query(value = "select t from Train t where t. trainName=:param1")
public Train getTrainByTrainName(@Param("param1")String trainName);
	
	
	
}

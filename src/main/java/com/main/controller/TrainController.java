package com.main.controller;

import java.util.List;                                                                             
                                                                                                   
import org.springframework.beans.factory.annotation.Autowired;                                     
import org.springframework.web.bind.annotation.GetMapping;                                         
import org.springframework.web.bind.annotation.PathVariable;                                       
import org.springframework.web.bind.annotation.PostMapping;                                        
import org.springframework.web.bind.annotation.RequestBody;                                        
import org.springframework.web.bind.annotation.RestController;

import com.main.dao.TrainDao;
import com.main.model.Train;                                     
                                                                                                   
                                                                 
                                                                                                   
@RestController                                                                                    
public class TrainController {                                                                     
	//end point url-localhost:8811/createTrain                                                     
	//web application                                                                              
	//web service---{   }--irctc api                                                               
	// client ---UI using Angular, HTML, PHP, JAVA                                                 
	                                                                                               
	// JSON,XML                                                                                    
	/*                                                                                             
	 * {                                                                                           
	 *                                                                                             
	 * "attributeName":value                                                                       
	 * "tariNumber":12344                                                                          
	 * }                                                                                           
	 *                                                                                             
	 */                                                                                            
	//POSTMAN--client                                                                              
	//by invoking url                                                                              
	//send request {  requset object, status, cookies,  } --json---java object                     
	//UI SERVER DB                                                                                 
	                                                                                               
	// localhost:8011/getAllTrain                                                                  
	                                                                                               
	// client(Pos Man ) and server--Tomcar Server                                                  
	//to add the train abject                                                                      
	//trainnumber, tarinName, tarinSource, traindestinat                                           
	//json object                                                                                  
	//Request header                                                                               
	//HttpMessageConvert                                                                           
	//Java object                                                                                  
	//HTTP protocol                                                                                
	//POST()--create resource                                                                      
	//GET                                                                                          
	//PUT                                                                                          
	//delete                                                                                       
	//any client --postman client to test our apis                                                 
	//Request Handler method                                                                       
	                                                                                               
	@Autowired                                                                                     
	private TrainDao dao;                                                                          
	//This is my Request Handler Method                                                            
	//localhost:8811/createTrain                                                                   
	//http:www.cpagemini:port/                                                                     
	@PostMapping(path = "/createTrain")                                                            
	public Train createTrain(@RequestBody Train train)                                             
	{                                                                                              
	                                                                                               
		                                                                                           
	return	dao.addTrains(train);                                                                   
	}                                                                                              
	@GetMapping(path="/getAllTrain")                                                               
	public List<Train> getAllTrain()                                                               
	{                                                                                              
		return dao.getAllTrain();                                                                  
	}                                                                                              
	                                                                                               
	                                                                                               
	@GetMapping(path="/getIdTrain/{tNo}")                                                      
	public Train geTrainById(@PathVariable int tNo)                                                
	{                                                                                              
		return dao.getTrainByNumbers(tNo);                                                          
	}                                                                                              
	                                                                                               
	                                                                                               
	                                                                                               
	                                                                                               
                                                                                                   
}                                                                                                  
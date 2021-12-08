package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.ClientServiceImpl;
import com.example.demo.Service.DetailFactureServiceImpl;
import com.example.demo.entities.Client;
import com.example.demo.entities.DetailFacture;

@RestController
public class DetailFactureRestController {
	@Autowired
	DetailFactureServiceImpl DFService ;
	//http://localhost:8081/SpringMVC/servlet/getAllDetailFacture
	@GetMapping("/getAllDetailFacture")
	public List<DetailFacture> getDF(){
	List<DetailFacture> listDF = DFService.retrieveAllDetailFacture();
	return listDF;
	}
	@GetMapping("/getDF/{id_DetailFacture}")

	public DetailFacture retrieveDF(@PathVariable("id_DetailFacture") Long id_DetailFacture) {
	return DFService.retrieveDetailFacture(id_DetailFacture);
	}
	@PostMapping("/add-DetailFacture")

	public Long addDetailFacture(@RequestBody DetailFacture c)
	{
	Long DF = DFService.addDetailFacture(c);
	return DF;
	}
	
	@DeleteMapping("/remove-DF/{detailFacture-id}")
	public void removeDF(@PathVariable("detailFacture-id") Long id_DetailFacture ){
	DFService.deleteDetailFacture(id_DetailFacture);
	}
	@PutMapping("/modify-DF")
	@ResponseBody
	public DetailFacture modifyDF(@RequestBody DetailFacture DF) {
	return DFService.updateDetailFacture(DF);
	}


}

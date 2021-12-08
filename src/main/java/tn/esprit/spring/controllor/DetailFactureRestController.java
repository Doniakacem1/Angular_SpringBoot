package tn.esprit.spring.controllor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.DAO.entity.DetailFacture;
import tn.esprit.spring.service.IDetailFactureService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class DetailFactureRestController {
	@Autowired
	IDetailFactureService DFService ;
	//http://localhost:8081/SpringMVC/servlet/getAllDetailFacture
	@GetMapping("/getAllDetailFacture")
	public List<DetailFacture> getDF(){
	List<DetailFacture> listDF = DFService.retrieveAllDetailFacture();
	return listDF;
	}
	//http://localhost:8081/SpringMVC/servlet/getDF/1
	@GetMapping("/getDF/{id_DetailFacture}")

	public DetailFacture retrieveDF(@PathVariable("id_DetailFacture") Long id_DetailFacture) {
	return DFService.retrieveDetailFacture(id_DetailFacture);
	}
	//http://localhost:8081/SpringMVC/servlet/add-DetailFacture
	@PostMapping("/add-DetailFacture")

	public DetailFacture addDetailFacture(@RequestBody DetailFacture c)
	{
		DetailFacture DF = DFService.addDetailFacture(c);
	return DF;
	}
	//http://localhost:8081/SpringMVC/servlet/remove-DF/2
	@DeleteMapping("/remove-DF/{detailFacture-id}")
	public void removeDF(@PathVariable("detailFacture-id") Long id_DetailFacture ){
	DFService.deleteDetailFacture(id_DetailFacture);
	}
	//http://localhost:8081/SpringMVC/servlet/modify-DF/2
	@PutMapping("/modify-DF")
	
	public DetailFacture modifyDF(@RequestBody DetailFacture DF) {
	return DFService.updateDetailFacture(DF);
	}

}

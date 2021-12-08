package com.example.demo.Controller;
import java.io.ByteArrayInputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.IFournisseurService;
import com.example.demo.entities.Client;
import com.example.demo.entities.Fournisseur;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;


@CrossOrigin(origins="http://localhost:4200")
@RestController
public class FournisseurRestController {
	@Autowired
	IFournisseurService fournisseurService;

	// http://localhost:8081/SpringMVC/servlet/getFournisseur
	@GetMapping("/getFournisseur")

	public List<Fournisseur> getFournisseur() {
	List<Fournisseur> listFournisseur = fournisseurService.retrieveAllFournisseur();
	return listFournisseur;
	}


	// http://localhost:8081/SpringMVC/servlet/addFournisseur
	@PostMapping("/addFournisseur")

	public Fournisseur addFournisseur(@RequestBody Fournisseur f)
	{
		Fournisseur fournisseur = fournisseurService.addFournisseur(f);
	return fournisseur;

	}

	// http://localhost:8081/SpringMVC/servlet/remove-fournisseur/{fournisseur-id}
	@DeleteMapping("/remove-fournisseur/{fournisseur-id}")

	public void removeFournisseur(@PathVariable("fournisseur-id") Long idFournisseur) {
	fournisseurService.deleteFournisseur(idFournisseur);;
	}
	// http://localhost:8081/SpringMVC/servlet/modify-fournisseur
	@PutMapping("/modify-fournisseur")

	public Fournisseur modifyFournisseur(@RequestBody Fournisseur fournisseur) {
	return fournisseurService.updateFournisseur(fournisseur);
	}
	@GetMapping("/getFournisseur/{id_Fournisseur}")

	public Fournisseur retrieveClient(@PathVariable("id_Fournisseur") Long id_Fournisseur) {
	return fournisseurService.retrieveFournisseur(id_Fournisseur);
	}
	@GetMapping("/list")
	public List<Fournisseur> getFs() {
		List<Fournisseur> listFs = fournisseurService.getFournisseurs();
		return listFs;
	}	
	/*@RequestMapping(value = "/pdfreport", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_PDF_VALUE)
    public ResponseEntity<InputStreamResource> citiesReport() {

        List<Fournisseur> cities = (List<Fournisseur>) fournisseurService.findAll();

        ByteArrayInputStream bis = GeneratePdfReport.citiesReport(cities);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "inline; filename=citiesreport.pdf");

        return ResponseEntity
                .ok()
                .headers(headers)
                .contentType(MediaType.APPLICATION_PDF)
                .body(new InputStreamResource(bis));
    }
*/
}

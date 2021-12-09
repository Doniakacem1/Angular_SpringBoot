/*package com.example.demo.Controller;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import java.io.ByteArrayInputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.IFactureService;
import com.example.demo.entities.Facture;


@RestController
@CrossOrigin(origins="http://localhost:4200")

public class FactureRestController {
@Autowired
IFactureService factureService;

// http://localhost:8081/SpringMVC/servlet/getFactures
@GetMapping("/getFactures")

public List<Facture> getFactures() {
List<Facture> listFactures = factureService.retrieveAllFacture();
return listFactures;
}

// http://localhost:8081/SpringMVC/servlet/retrieve-facture/1
@GetMapping("/retrieve-facture/{facture-id}")

public Facture retrieveFacture(@PathVariable("facture-id") Long factureId) {
return factureService.retrieveFacture(factureId);
}

// http://localhost:8081/SpringMVC/servlet/add-facture
@PostMapping("/add-facture")

public Facture addFacture(@RequestBody Facture f) {
Facture facture = factureService.addFacture(f);
return facture;
}
// http://localhost:8081/SpringMVC/servlet/remove-facture/{facture-id}
@DeleteMapping("/remove-facture/{facture-id}")

public void removeFacture(@PathVariable("facture-id") Long factureId) {
factureService.deleteFacture(factureId);
}
// http://localhost:8081/SpringMVC/servlet/modify-facture
@PutMapping("/modify-facture")

public Facture modifyFacture(@RequestBody Facture facture) {
return factureService.updateFacture(facture);
}
//  http://localhost:8081/SpringMVC/servlet/addFacture
@PostMapping("/addFacture/{idc}")
@ResponseBody
public Facture addFacture(@RequestBody Facture f, @PathVariable ("idc") Long idClient )
{
/*
  public ResponseEntity<Facture>   addFacture(@RequestBody Facture f,@PathVariable ("idc") Long idClient )
*/
/*return factureService.addFacture(f, idClient );

}


//http://localhost:8081/SpringMVC/facture/cancelfacture/{idFActure}
@PutMapping("cancelfacture/{idFacture}")
@ResponseBody
    public Facture cancelFacture(@PathVariable("idFacture") Long idFacture){
return factureService.cancelFacture(idFacture);
}
/*
@RequestMapping(value = "/pdfreport", method = RequestMethod.GET,
           produces = MediaType.APPLICATION_PDF_VALUE)
   public ResponseEntity<InputStreamResource> citiesReport() {

       List<Facture> cities = (List<Facture>) factureService.findAll();

       ByteArrayInputStream bis = GeneratePdfReport.citiesReport(cities);

       HttpHeaders headers = new HttpHeaders();
       headers.add("Content-Disposition", "inline; filename=citiesreport.pdf");

       return ResponseEntity
               .ok()
               .headers(headers)
               .contentType(MediaType.APPLICATION_PDF)
               .body(new InputStreamResource(bis));
   }*/
//affichage de la liste des facture par le Status active
//http://localhost:8089/SpringMVC/facture/getNbFactureActive/{active}
/*@GetMapping("/getNbFactureActive")
@ResponseBody
public Long getNbFactureActive() {
return factureService.getNbFactureActive();
}
}
*/
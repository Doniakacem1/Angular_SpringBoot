package com.example.demo.Controller;
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

public Long addFacture(@RequestBody Facture f) {
Long facture = factureService.addFacture(f);
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

}
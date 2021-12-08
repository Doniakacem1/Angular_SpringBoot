package com.example.demo.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.IRayonService;
import com.example.demo.entities.Rayon;
@RestController
public class RayonRestController {
@Autowired
IRayonService rayonService;

// http://localhost:8081/SpringMVC/servlet/getRayons
@GetMapping("/getRayons")

public List<Rayon> getRayons() {
List<Rayon> listFactures = rayonService.retrieveAllRayon();
return listFactures;
}

// http://localhost:8081/SpringMVC/servlet/retrieve-rayon/1
@GetMapping("/retrieve-rayon/{rayon-id}")

public Rayon retrieveRayon(@PathVariable("rayon-id") Long rayonId) {
return rayonService.retrieveRayon(rayonId);
}

// http://localhost:8081/SpringMVC/servlet/add-rayon
@PostMapping("/add-rayon")

public Long addRayon(@RequestBody Rayon r) {
Long rayon = rayonService.addRayon(r);
return rayon;
}

// http://localhost:8081/SpringMVC/servlet/remove-rayon/{rayon-id}
@DeleteMapping("/remove-rayon/{rayon-id}")

public void removeRayon(@PathVariable("rayon-id") Long rayonId) {
rayonService.deleteRayon(rayonId);
}
// http://localhost:8081/SpringMVC/servlet/modify-rayon
@PutMapping("/modify-rayon")

public Rayon modifyRayon(@RequestBody Rayon rayon) {
return rayonService.updateRayon(rayon);
}
}

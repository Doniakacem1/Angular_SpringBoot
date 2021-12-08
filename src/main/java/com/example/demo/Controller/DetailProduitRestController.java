package com.example.demo.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Service.IDetailProduitService;
import com.example.demo.entities.DetailProduit;
import com.example.demo.entities.Stock;


@RestController
public class DetailProduitRestController {
	@Autowired
	IDetailProduitService DetailProduitService;
	//http://localhost:8081/SpringMVC/servlet/getAllDetailProduit
	@GetMapping("/getAllDetailProduit")
	public List<DetailProduit> getDetailProduit() {
	return DetailProduitService.retrieveAllDetailProduit();

	}
	//http://localhost:8081/SpringMVC/servlet/retrieveDetailProduit/1
	    @GetMapping("/retrieveDetailProduit/{id_DetailProduit}")
	public DetailProduit retrieveDetailProduit(@PathVariable("id_DetailProduit") long DetailProduitId) {
	return DetailProduitService.retrieveDetailProduit(DetailProduitId);
	}
	   
	    //http://localhost:8081/SpringMVC/servlet/add-DetailProduit
	  @PostMapping("/add-DetailProduit")
	  public Long addDP(@RequestBody DetailProduit c)
		{
		Long dp = DetailProduitService.addDetailProduit(c);
		return dp;
		}
	  //http://localhost:8081/SpringMVC/servlet/remove-DetailProduit/{DetailProduit-id}
	  @DeleteMapping("/remove-DetailProduit/{DetailProduit-id}")

	  public void deleteDetailProduit(@PathVariable("DetailProduit-id") Long DetailProduitId) {
	  DetailProduitService.deleteDetailProduit(DetailProduitId);
	  }
	 
	    //http://localhost:8081/SpringMVC/servlet/update-DetailProduit
	    @PutMapping("/update-DetailProduit")
	    @ResponseBody
	    public DetailProduit modifyDetailProduit(@RequestBody DetailProduit dp)
	    {
	    return DetailProduitService.updateDetailProduit(dp);
	    } 
	    }


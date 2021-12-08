package tn.esprit.spring;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import tn.esprit.spring.DAO.entity.DetailFacture;
import tn.esprit.spring.service.IDetailFactureService;


public class detailFactureServiceImplTest {
	@Autowired
	IDetailFactureService detailfactureService;
	@Test
	public void testAddDetailFacture() {
	List<DetailFacture> factures = detailfactureService.retrieveAllDetailFacture();
	int expected=factures.size();
	DetailFacture f = new DetailFacture();
    f.setPourcentageRemise(50);
    f.setMontantRemise(123);
    f.setPrixTotatl(123);
    f.setQte(20);
    DetailFacture savedFact= detailfactureService.addDetailFacture(f);
	assertEquals(expected+1, detailfactureService.retrieveAllDetailFacture().size());
	assertNotNull(savedFact.getMontantRemise());
	detailfactureService.deleteDetailFacture(savedFact.getIdDetailFacture());
}
}
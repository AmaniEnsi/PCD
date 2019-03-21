package org.opendevup;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.opendevup.dao.EtudiantRepository;
import org.opendevup.entities.Etudiant;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;




@SpringBootApplication

public class ProjetApplication {

	public static void main(String[] args) throws ParseException {
		ApplicationContext ctx= SpringApplication.run(ProjetApplication.class, args);
		EtudiantRepository etudiantRepository= ctx.getBean(EtudiantRepository.class);
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	    etudiantRepository.save(new Etudiant("Toukébri","Amani",df.parse("1995-11-18"),"amani.toukebri@ensi-uma.tn","amani.jpg"));
	    etudiantRepository.save(new Etudiant("Ben Ahmed","Ilhem",df.parse("1996-11-7"),"ilhem.benahmed@ensi-uma.tn","ilhem.jpg"));
	    etudiantRepository.save(new Etudiant("Ahmed","Nour",df.parse("1996-05-18"),"nour.ahmed@ensi-uma.tn","nour.jpg"));
	    
		//Page<Etudiant> etds = etudiantRepository.chercherEtudiants("%A%",new PageRequest(0, 1));
	    //etds.forEach(e->System.out.println(e.getNom()));
	    
	    
	}

}

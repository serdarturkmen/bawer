package gov.diski.edevlet.repository;

import gov.diski.edevlet.model.Abone;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AboneRepository extends JpaRepository<Abone, Integer>{
	
	Abone findByAboneNo(int id);

}

package it.nttdata.concessionario.repository;

import it.nttdata.concessionario.model.Concessionario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ConcessionarioRepository extends CrudRepository<Concessionario,Long> {

    @Query("SELECT COUNT (c) FROM Concessionario c")
    public Integer countRegion();

}

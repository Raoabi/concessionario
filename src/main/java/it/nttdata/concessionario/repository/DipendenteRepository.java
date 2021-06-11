package it.nttdata.concessionario.repository;

import it.nttdata.concessionario.model.Dipendente;
import org.springframework.data.repository.CrudRepository;

public interface DipendenteRepository extends CrudRepository<Dipendente, Long> {
}

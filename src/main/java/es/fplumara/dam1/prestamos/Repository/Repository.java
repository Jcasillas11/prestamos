package es.fplumara.dam1.prestamos.Repository;

import es.fplumara.dam1.prestamos.model.Identificable;

import java.util.List;
import java.util.Optional;

public interface Repository <T extends Identificable> {

    void save (T Repositorio);
    Optional<T> findById (String id);
    List<T> ListAll();
    void deleteById (String id);
}

package es.fplumara.dam1.prestamos.Repository.Implements;

import es.fplumara.dam1.prestamos.model.Identificable;
import es.fplumara.dam1.prestamos.Repository.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class BaseRepository<T extends Identificable> implements Repository<T> {

    private Map<String, T> map = new HashMap<>();

    @Override
    public void deleteById(String id) {

    }

    @Override
    public List<T> ListAll() {
        return List.of();
    }

    @Override
    public Optional<T> findById(String id) {
        return Optional.empty();
    }

    @Override
    public void save(T Repositorio) {

    }
}
package co.com.softka.CarApp.DTAS;

import co.com.softka.CarApp.Entities.Podio;
import co.com.softka.CarApp.Interfaces.PodioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PodioDTA {

    @Autowired
    private PodioRepository repository;

    public Iterable<Podio> list(){ return repository.findAll(); }

    public Podio save(Podio podio){
        return repository.save(podio);
    }

    public void delete(Long id){ repository.delete(get(id)); }

    public Podio get(Long id){
        return repository.findById(id).orElseThrow();
    }

}





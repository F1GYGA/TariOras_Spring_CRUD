package proiect.pwabd.tariorasspring.controller;

import java.security.AlgorithmConstraints;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.bytebuddy.asm.Advice.AllArguments;
import proiect.pwabd.tariorasspring.repository.TaraRepository;
import proiect.pwabd.tariorasspring.model.Tara;


@RestController
@RequestMapping(value="/tariorasjson")
public class TaraRestController {
    
    private final TaraRepository taraRepository;
    
    @Autowired
    public TaraRestController(TaraRepository taraRepository){
        this.taraRepository = taraRepository;
    }
    
    @GetMapping(value = "/getlistatari")
    public List<Tara> getAll(){
        return taraRepository.findAll();
        
    }

    @GetMapping(value ="/gettarabyid/{id}")
    public Optional<Tara> getTara(@PathVariable("id") Integer id){
        return taraRepository.findById(id);
    }

    @PostMapping(value ="/adaugaretara")
    public Tara persist(@RequestBody Tara tara){
        return taraRepository.save(tara);
    }
    
    @PutMapping(value= "/actualizaretara")
    public Tara update(@RequestBody Tara tara){
        return taraRepository.save(tara);
    }

    @DeleteMapping(value = "stergeretarabyID/{id}")
    public void deleteTara(@PathVariable("id") Integer id){
        taraRepository.deleteById(id);
    }

    
}

package co.com.softka.CarApp.Controllers;

import co.com.softka.CarApp.DTAS.PodioDTA;
import co.com.softka.CarApp.DTOS.PodioDTO;
import co.com.softka.CarApp.Entities.Podio;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(path = "/game")
public class PodioController {

    @Autowired
    private PodioDTA service;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping(path = "/podio")
    public PodioDTO save(@Validated @RequestBody PodioDTO podiodto) throws ParseException {
        Podio podio =convertToEntity(podiodto);
        Podio podioSave = service.save(podio);
        return convertToDto(podioSave);
    }
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleValidationExceptions(
            MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach(error -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        return errors;
    }

    @GetMapping(path = "/{idPodio}/podio")
    public PodioDTO get(@PathVariable("idPodio") Long id) {
        return convertToDto(service.get(id));
    }

    private PodioDTO convertToDto(Podio podio) {
        return modelMapper.map(podio, PodioDTO.class);
    }

    private Podio convertToEntity(PodioDTO podiodto) throws ParseException {
        return modelMapper.map(podiodto, Podio.class);
    }

}


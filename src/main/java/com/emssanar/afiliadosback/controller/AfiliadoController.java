package com.emssanar.afiliadosback.controller;

import com.emssanar.afiliadosback.dto.ResponseDto;
import com.emssanar.afiliadosback.entity.Afiliado;
import com.emssanar.afiliadosback.service.AfiliadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
@RequestMapping(path = "afiliado")
public class AfiliadoController {
    @Autowired
    private AfiliadoService afiliadoService;

    @PostMapping
    public ResponseEntity<ResponseDto> crearAfiliado(@RequestBody Afiliado prestamo) {
        try {
            Afiliado nuevo = afiliadoService.registrarAfiliado(prestamo);
            ResponseDto exitoso = new ResponseDto(200, "Exitoso", nuevo);
            return new ResponseEntity<>(exitoso, HttpStatus.OK);
        } catch (Exception ex) {
            ResponseDto error = new ResponseDto(400, ex.getMessage(), null);
            return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("{id}")
    public ResponseEntity<ResponseDto> actualizarAfiliado(@PathVariable("id") int id, @RequestBody Afiliado prestamo) {
        try {
            Afiliado nuevo = afiliadoService.actualizarAfiliado(prestamo, id);
            ResponseDto exitoso = new ResponseDto(200, "Exitoso", nuevo);
            return new ResponseEntity<>(exitoso, HttpStatus.OK);
        } catch (Exception ex) {
            ResponseDto error = new ResponseDto(400, ex.getMessage(), null);
            return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("{id}")
    public ResponseEntity<ResponseDto> consultarAfiliado(@PathVariable("id") int id) {
        try {
            Afiliado afiliado = afiliadoService.consultarAfiliado(id);
            ResponseDto exitoso = new ResponseDto(200, "Exitoso", afiliado);
            return new ResponseEntity<>(exitoso, HttpStatus.OK);
        } catch (Exception ex) {
            ResponseDto error = new ResponseDto(400, ex.getMessage(), null);
            return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("todos")
    public ResponseEntity<Object> consultarTodos() {
        try {
            List<Afiliado> list = afiliadoService.consultarTodos();
            return new ResponseEntity<>(list, HttpStatus.OK);
        } catch (Exception ex) {
            ResponseDto error = new ResponseDto(400, ex.getMessage(), null);
            return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Object> eliminarAfiliado(@PathVariable("id") int id) {
        try {
            int idElim = afiliadoService.eliminarAfiliado(id);
            return new ResponseEntity<>(idElim, HttpStatus.OK);
        } catch (Exception ex) {
            ResponseDto error = new ResponseDto(400, ex.getMessage(), null);
            return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
        }
    }
}

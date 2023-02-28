package com.example.controladores;

import com.example.modelos.Usuarios;
import com.example.servicios.IUsuariosServece;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
@AllArgsConstructor
public class UsuariosController {
    private final IUsuariosServece usuariosServece;

    @GetMapping
    public ResponseEntity<List<Usuarios>> getUsuarios(){
        return new ResponseEntity<>(this.usuariosServece.getUsuarios(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Usuarios> createUsuarios(@RequestBody Usuarios usuario){
        return new ResponseEntity<>(this.usuariosServece.createUsuario(usuario), HttpStatus.OK);
    }
}

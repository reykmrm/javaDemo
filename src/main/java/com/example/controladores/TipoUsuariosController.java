package com.example.controladores;

import com.example.modelos.TipoUsuarios;
import com.example.modelos.Usuarios;
import com.example.servicios.ITipoUsuariosService;
import com.example.servicios.IUsuariosServece;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/tipoUsuarios")
@AllArgsConstructor
public class TipoUsuariosController {

    private final ITipoUsuariosService tipoUsuariosService;
    @GetMapping
    public ResponseEntity<List<TipoUsuarios>> getUsuarios(){
        return new ResponseEntity<>(this.tipoUsuariosService.getTipoUsuarios(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<TipoUsuarios> createUsuarios(@RequestBody TipoUsuarios tipoUsuarios){
        return new ResponseEntity<>(this.tipoUsuariosService.createTipoUsuarios(tipoUsuarios), HttpStatus.OK);
    }
}

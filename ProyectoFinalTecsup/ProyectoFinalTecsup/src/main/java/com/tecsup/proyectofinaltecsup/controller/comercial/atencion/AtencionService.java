package com.tecsup.proyectofinaltecsup.controller.comercial.atencion;

import com.tecsup.proyectofinaltecsup.model.Mascota;
import com.tecsup.proyectofinaltecsup.model.Propietario;
import com.tecsup.proyectofinaltecsup.model.Veterinario;
import com.tecsup.proyectofinaltecsup.model.Visita;
import java.util.List;

public interface AtencionService {

    List<Visita> allVisita();
    
    List<Visita> allVisitaFinalizada();

    Visita findVisita(Visita visita);

    void saveVisita(Visita visita);

    List<Propietario> allPropietario();

    List<Mascota> allMascota();

    List<Veterinario> allVeterinario();

}

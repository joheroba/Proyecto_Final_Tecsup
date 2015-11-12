package com.tecsup.proyectofinaltecsup.dao;

import com.tecsup.proyectofinaltecsup.helper.GenericDAO;
import com.tecsup.proyectofinaltecsup.model.Mascota;
import com.tecsup.proyectofinaltecsup.model.Propietario;
import java.util.List;

public interface MascotaDAO extends GenericDAO<Mascota> {

    List<Mascota> allByPropietario(Propietario propietario);
    
}

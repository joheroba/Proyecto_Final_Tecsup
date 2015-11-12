package com.tecsup.proyectofinaltecsup.dao;

import com.tecsup.proyectofinaltecsup.helper.GenericDAO;
import com.tecsup.proyectofinaltecsup.model.Visita;
import java.util.List;

public interface VisitaDAO extends GenericDAO<Visita> {

    List<Visita> allFinalizada();
    
}

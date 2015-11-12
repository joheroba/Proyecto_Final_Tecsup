package com.tecsup.proyectofinaltecsup.controller.comercial.atencion;

import com.tecsup.proyectofinaltecsup.dao.MascotaDAO;
import com.tecsup.proyectofinaltecsup.dao.PropietarioDAO;
import com.tecsup.proyectofinaltecsup.dao.VeterinarioDAO;
import com.tecsup.proyectofinaltecsup.dao.VisitaDAO;
import com.tecsup.proyectofinaltecsup.model.Mascota;
import com.tecsup.proyectofinaltecsup.model.Propietario;
import com.tecsup.proyectofinaltecsup.model.Veterinario;
import com.tecsup.proyectofinaltecsup.model.Visita;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AtencionServiceImp implements AtencionService {

    @Autowired
    PropietarioDAO propietarioDAO;

    @Autowired
    MascotaDAO mascotaDAO;

    @Autowired
    VeterinarioDAO veterinarioDAO;

    @Autowired
    VisitaDAO visitaDAO;

    @Override
    public List<Visita> allVisita() {
        return visitaDAO.all();
    }
 
    @Override
    public List<Visita> allVisitaFinalizada() {
        return visitaDAO.allFinalizada();
    }

    @Override
    public Visita findVisita(Visita visita) {
        return visitaDAO.find(visita);
    }

    @Override
    public void saveVisita(Visita visita) {
        if (visita.getId() == null) {
            visita.setFechaIngreso(new Date());
            visitaDAO.saveDAO(visita);
        } else {

            if (visita.isFinalizado()) {
                visita.setFechaSalida(new Date());
            }

            visitaDAO.updateDAO(visita);
        }

    }

    @Override
    public List<Propietario> allPropietario() {
        return propietarioDAO.all();
    }

    @Override
    public List<Mascota> allMascota() {
        return mascotaDAO.all();
    }

    @Override
    public List<Veterinario> allVeterinario() {
        return veterinarioDAO.all();
    }

}

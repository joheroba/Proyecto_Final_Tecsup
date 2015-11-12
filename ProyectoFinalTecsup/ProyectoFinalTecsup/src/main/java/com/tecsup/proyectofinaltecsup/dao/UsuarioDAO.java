package com.tecsup.proyectofinaltecsup.dao;

import com.tecsup.proyectofinaltecsup.helper.GenericDAO;
import com.tecsup.proyectofinaltecsup.model.Usuario;

public interface UsuarioDAO extends GenericDAO<Usuario> {

    Usuario findByLogin(String usuario);
    
}

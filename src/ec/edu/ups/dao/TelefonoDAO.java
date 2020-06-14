/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.idao.ITelefonoDAO;
import ec.edu.ups.modelo.Telefono;
import java.util.ArrayList;

/**
 *
 * @author ariel
 */
public class TelefonoDAO implements ITelefonoDAO {

    private ArrayList telefonos;

    public TelefonoDAO() {
        telefonos = new ArrayList<Telefono>();
    }

    @Override
    public void create(Telefono telefono) {
        telefonos.add(telefono);
    }

    @Override
    public Telefono read(String codigo) {
        return null;
    }

    @Override
    public void update(Telefono telefono) {
    }

    @Override
    public void delete(Telefono telefono) {
    }

    @Override
    public ArrayList<Telefono> mostrar() {
        return telefonos;
    }
}

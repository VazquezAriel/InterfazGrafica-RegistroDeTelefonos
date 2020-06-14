/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.idao.ITelefonoDAO;
import ec.edu.ups.modelo.Telefono;
import ec.edu.ups.vista.Ventana_CrearTelefono;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ariel
 */
public class ControladorTelefono {
    
    private Ventana_CrearTelefono vCrearTelefono;
    private ITelefonoDAO telefonoDAO;

    public ControladorTelefono() {
    }

    public ControladorTelefono(Ventana_CrearTelefono vCrearTelefono, ITelefonoDAO telefonoDAO) {
        this.vCrearTelefono = vCrearTelefono;
        this.telefonoDAO = telefonoDAO;
    }

    public void crearTelefono(Telefono telefono) {
        telefonoDAO.create(telefono);
        JOptionPane.showMessageDialog(vCrearTelefono, "Telefono creado con exito");
    }
    
    public ArrayList<Telefono> mostrarTelefonos() {
        return telefonoDAO.mostrar();
    }

}

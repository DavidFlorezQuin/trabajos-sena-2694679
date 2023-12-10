/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Entity.Cliente;
import Utils.FunctionString;

/**
 *
 * @author david
 */
public class ClienteC {

    public void GuardarRegistro(String nombre, String telefono, String correo, String direccion) {

        FunctionString fs = new FunctionString();

        if (nombre == null || nombre.isEmpty() || telefono == null || telefono.isEmpty() || correo == null || correo.isEmpty()) {
            fs.ShowJOptionPane("Todos los campos son obligatorios");
        } else {
            Cliente cliente = new Cliente();
            cliente.setNombre(nombre);
            cliente.setTelefono(telefono);
            cliente.setCorreo(correo);
            cliente.setDireccion(direccion);
            cliente.Agregar();
            cliente.Consultar();

            fs.ShowJOptionPane("Usuario creado con exito");
        }
    }
    public void ModificarRegistro(Long id, String nombre, String telefono, String correo, String direccion) {

        FunctionString fs = new FunctionString();

        if (nombre == null || nombre.isEmpty() || telefono == null || telefono.isEmpty() || correo == null || correo.isEmpty()) {
            fs.ShowJOptionPane("Todos los campos son obligatorios");
        } else {
            Cliente cliente = new Cliente();
            cliente.setId(id);
            cliente.setNombre(nombre);
            cliente.setTelefono(telefono);
            cliente.setCorreo(correo);
            cliente.setDireccion(direccion);
            cliente.Modificar();
            cliente.Consultar();

            fs.ShowJOptionPane("Modificado con éxito");
        }
    }

}

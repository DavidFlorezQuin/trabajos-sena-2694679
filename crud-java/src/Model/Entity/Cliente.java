/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Entity;

import Conexion.Conexion;
import Model.Interfase.Accion;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author ariel
 */
public class Cliente implements Accion {

    private Long id;
    private String nombre;
    private String correo;
    private String telefono;
    private String direccion;
    public Conexion conn = new Conexion();
    public DefaultTableModel modelo;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Conexion getConn() {
        return conn;
    }

    public void setConn(Conexion conn) {
        this.conn = conn;
    }
    
    
    @Override
    public void Agregar() {
        String sql;
        
        sql = "INSERT INTO cliente ("
            +   "nombre, "
            +   "correo, "
            +   "telefono, "
            +   "direccion, "
            +   "created_at"
            + ") VALUES ("
            +   "' "+this.getNombre()+"', "
            +   "' "+this.getCorreo()+"', "
            +   "' "+this.getTelefono()+"', "
            +   "' "+this.getDireccion()+"', "
            +   " NOW()"
            + ");";
        conn.ejecutarSQL(sql);

    }

    @Override
    public void Modificar() {

    String sql = "UPDATE cliente SET "
            + "nombre = '" + this.getNombre() + "', "
            + "correo = '" + this.getCorreo() + "', "
            + "telefono = '" + this.getTelefono() + "', "
            + "direccion = '" + this.getDireccion() + "' "
            + "WHERE id = " + this.getId();

    conn.ejecutarSQL(sql);
    }

    @Override
    public void Consultar() {
        String sql = "SELECT * FROM cliente";
        ResultSet resultado = conn.consultarSQL(sql);
        if (resultado != null) {
            modelo = new DefaultTableModel();
            // Agregar las columnas a la tabla
            modelo.addColumn("ID");
            modelo.addColumn("Nombre");
            modelo.addColumn("Telefono");
            modelo.addColumn("Correo");
            modelo.addColumn("Direccion");

            try {
                while (resultado.next()) {
                    Object[] fila = new Object[5];
                    fila[0] = resultado.getInt("id");
                    fila[1] = resultado.getString("nombre");
                    fila[2] = resultado.getString("telefono");
                    fila[3] = resultado.getString("correo");
                    fila[4] = resultado.getString("direccion");
                    modelo.addRow(fila);
                }
            } catch (SQLException e) {
                System.err.println("Error al procesar los resultados: " + e.getMessage());
            } finally {
                conn.cerrarConexion();
            }
        }
    }

    @Override
    public void EliminarFisico() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void EliminarLogico() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public String ConsultarWhereAnd() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }



}

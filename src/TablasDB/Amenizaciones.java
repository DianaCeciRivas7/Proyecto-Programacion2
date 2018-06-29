package TablasDB;

import java.sql.ResultSet;

public class Amenizaciones {

    Conexion cn = new Conexion();

    public void AgregarAmenizaciones(Object p[]) throws Exception {

        try {
            cn.conectar();
            cn.UID("INSERT into Amenizaciones(Cod_Amenizacion,Nombre_Amenizacion,Costo_Amenizacion,Telefono) values(\"" + p[0] + "\",\"" + p[1] + "\",\"" + p[2] + "\",\"" + p[3] + "\");");
            cn.desconectar();
        } catch (Exception e) {
            System.out.println("No logra ingresar");
        } finally {
            cn.desconectar();
        }

    }

    public void EliminarAmenizaciones(int p) throws Exception {
        try {
            cn.conectar();
            cn.UID("DELETE FROM Amenizaciones WHERE Cod_Amenizacion='" + p + "'");
            cn.desconectar();
        } catch (Exception e) {
            System.out.println("No logra eliminar");
        } finally {
            cn.desconectar();
        }
    }

    public void ModificarAmenizaciones(Object t[]) throws Exception {
        try {
            cn.conectar();
            cn.UID("UPDATE Amenizaciones set Nombre_Amenizacion=\"" + t[1] + "\", Costo_Amenizacion=\"" + t[2] + "\", Telefono=\"" + t[3] + "\" where Cod_Amenizacion=" + t[0] + "; ");
            cn.desconectar();
        } catch (Exception e) {
            System.out.println("No logra modificar");

        } finally {
            cn.desconectar();
        }
    }

    public ResultSet obtenerMaxCodAmenizacion() {
        return cn.getValores("select max(Cod_Amenizacion) as maximo from Amenizaciones;");
    }

    public ResultSet obtenerNombreAmenizaciones() {
        return cn.getValores("select Nombre_Amenizacion  from Amenizaciones;");
    }

    public ResultSet obtenerCodAmenizacion(String nom) {
        return cn.getValores("select Cod_Amenizacion from Amenizaciones where Nombre_Amenizacion='" + nom + "' ;");
    }
    
    public ResultSet obtenerConteoAmenizaciones() {
        return cn.getValores("select count(Cod_Amenizacion) as conteo from Amenizaciones;");
    }
}

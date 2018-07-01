package TablasDB;

import java.sql.ResultSet;

public class Actividades {

    Conexion cn = new Conexion();

    public void AgregarActividades(Object p[]) throws Exception {

        try {
            cn.conectar();
            cn.UID("INSERT into Actividades(Cod_Actividad,Nombre_Actividad,Fecha) values(\"" + p[0] + "\",\"" + p[1] + "\",\"" + p[2] + "\");");
            cn.desconectar();
        } catch (Exception e) {
            System.out.println("No logra ingresar");
        } finally {
            cn.desconectar();
        }

    }

    public void EliminarActividades(int p) throws Exception {
        try {
            cn.conectar();
            cn.UID("DELETE FROM Actividades WHERE Cod_Actividad='" + p + "'");
            cn.desconectar();
        } catch (Exception e) {
            System.out.println("No logra eliminar");
        } finally {
            cn.desconectar();
        }
    }

    public void ModificarActividades(Object t[]) throws Exception {
        try {
            cn.conectar();
            cn.UID("UPDATE Actividades set Nombre_Actividad=\"" + t[1] + "\", Fecha=\"" + t[2] + "\" where Cod_Actividad=" + t[0] + "; ");
            cn.desconectar();
        } catch (Exception e) {
            System.out.println("No logra modificar");

        } finally {
            cn.desconectar();
        }
    }

    public ResultSet obtenerMaxCodActividad() {
        return cn.getValores("select max(Cod_Actividad) as maximo from Actividades;");
    }

    public ResultSet obtenerNombreActividades() {
        return cn.getValores("select Nombre_Actividad from Actividades;");
    }

    public ResultSet obtenerCodActividad(String nom) {
        return cn.getValores("select Cod_Actividad from Actividades where Nombre_Actividad='" + nom + "' ;");
    }

    public ResultSet obtenerConteoActividades() {
        return cn.getValores("select count(Cod_Actividad) as conteo from Actividades;");
    }
    
    public ResultSet obtenerActividades() {
        return cn.getValores("select * from Actividades;");
    }
}

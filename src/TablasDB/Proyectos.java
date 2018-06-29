package TablasDB;

import java.sql.ResultSet;

public class Proyectos {

    Conexion cn = new Conexion();

    public void AgregarProyectos(Object p[]) throws Exception {

        try {
            cn.conectar();
            cn.UID("INSERT into Proyectos(Cod_Proyecto,Descripcion,Costo_Previsto) values(\"" + p[0] + "\",\"" + p[1] + "\",\"" + p[2] + "\");");
            cn.desconectar();
        } catch (Exception e) {
            System.out.println("No logra ingresar");
        } finally {
            cn.desconectar();
        }

    }

    public void EliminarProyectos(int p) throws Exception {
        try {
            cn.conectar();
            cn.UID("DELETE FROM Proyectos WHERE Cod_Proyecto='" + p + "'");
            cn.desconectar();
        } catch (Exception e) {
            System.out.println("No logra eliminar");
        } finally {
            cn.desconectar();
        }
    }

    public void ModificarProyectos(Object t[]) throws Exception {
        try {
            cn.conectar();
            cn.UID("UPDATE Proyectos set Descripción=\"" + t[1] + "\", Costo_Previsto=\"" + t[2] + "\" where Cod_Proyecto=" + t[0] + "; ");
            cn.desconectar();
        } catch (Exception e) {
            System.out.println("No logra modificar");

        } finally {
            cn.desconectar();
        }
    }

    public ResultSet obtenerMaxCodProyecto() {
        return cn.getValores("select max(Cod_Proyecto) as maximo from Proyectos;");
    }

    public ResultSet obtenerDescripcionProyectos() {
        return cn.getValores("select Descripcion  from Proyectos;");
    }

    public ResultSet obtenerCodProyecto(String descripcion) {
        return cn.getValores("select Cod_Proyecto from Proyectos where Descripcion='" + descripcion + "' ;");
    }
    
    public ResultSet obtenerConteoProyectos() {
        return cn.getValores("select count(Cod_Proyecto) as conteo from Proyectos;");
    }
}

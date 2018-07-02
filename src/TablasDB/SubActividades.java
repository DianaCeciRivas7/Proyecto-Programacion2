package TablasDB;

import java.sql.ResultSet;

public class SubActividades {

    Conexion cn = new Conexion();

    public void AgregarSubActividades(Object p[]) throws Exception {

        try {
            cn.conectar();
            cn.UID("INSERT into SubActividades(Cod_Actividad_fk,Cod_SubActividad,Nombre_SubActividad,Descripcion,Fecha_Realizacion,Ingreso,Egreso) values(\"" + p[0] + "\",\"" + p[1] + "\",\"" + p[2] + "\",\"" + p[3] + "\",\"" + p[4] + "\",\"" + p[5] + "\",\"" + p[6] + "\");");
            cn.desconectar();
        } catch (Exception e) {
            System.out.println("No logra ingresar");
        } finally {
            cn.desconectar();
        }

    }

    public void EliminarSubActividades(int p) throws Exception {
        try {
            cn.conectar();
            cn.UID("DELETE FROM SubActividades WHERE Cod_Actividad_fk='" + p + "'");
            cn.desconectar();
        } catch (Exception e) {
            System.out.println("No logra eliminar");
        } finally {
            cn.desconectar();
        }
    }

    public void EliminarSubActividadesSingular(int p) throws Exception {
        try {
            cn.conectar();
            cn.UID("DELETE FROM SubActividades WHERE Cod_SubActividad='" + p + "'");
            cn.desconectar();
        } catch (Exception e) {
            System.out.println("No logra eliminar");
        } finally {
            cn.desconectar();
        }
    }

    public void ModificarSubActividades(Object t[]) throws Exception {
        try {
            cn.conectar();
            cn.UID("UPDATE SubActividades set Cod_SubActividad=\"" + t[1] + "\", Nombre_SubActividad=\"" + t[2] + "\", Descripcion=\"" + t[3] + "\", Fecha_Realizacion=\"" + t[4] + "\", Ingreso=\"" + t[5] + "\", Egreso=\"" + t[6] + "\" where Cod_Actividad_fk=" + t[0] + "; ");
            cn.desconectar();
        } catch (Exception e) {
            System.out.println("No logra modificar");

        } finally {
            cn.desconectar();
        }
    }

    public ResultSet obtenerMaxCodSubActividad() {
        return cn.getValores("select max(Cod_SubActividad) as maximo from SubActividades;");
    }

    public ResultSet obtenerConteoSubActividades() {
        return cn.getValores("select count(Cod_SubActividad) as conteo from SubActividades;");
    }

    public ResultSet obtenerSubActividades() {
        return cn.getValores("select SubActividades.Cod_Actividad_fk, Actividades.Nombre_Actividad, SubActividades.Cod_SubActividad,SubActividades.Nombre_SubActividad, SubActividades.Descripcion, SubActividades.Fecha_Realizacion, SubActividades.Ingreso, SubActividades.Egreso from SubActividades inner join Actividades on Actividades.Cod_Actividad=SubActividades.Cod_Actividad_fk;");
    }

    public ResultSet obtenerIngresoTotal(int codigoFiesta) {
        return cn.getValores("select sum(Ingreso) as ingresoTotal from SubActividades inner join ActividadesPorFiesta on ActividadesPorFiesta.Cod_Actividad_fk=SubActividades.Cod_Actividad_fk where ActividadesPorFiesta.Cod_Fiesta_fk =" + codigoFiesta + " ;");
    }

    public ResultSet obtenerEgresoTotal(int codigoFiesta) {
        return cn.getValores("select sum(Egreso) as egresoTotal from SubActividades inner join ActividadesPorFiesta on ActividadesPorFiesta.Cod_Actividad_fk=SubActividades.Cod_Actividad_fk where ActividadesPorFiesta.Cod_Fiesta_fk =" + codigoFiesta + " ;");
    }

    public ResultSet obtenerNombreSubActividad(int p, int q) {
        return cn.getValores("select Nombre_SubActividad from SubActividades where Cod_SubActividad=" + p + " and Cod_Actividad_fk=" + q + " ;");
    }

    public ResultSet obtenerSubActividad(int p, int q) {
        return cn.getValores("select * from SubActividades where Cod_Actividad_fk=" + p + " and Cod_SubActividad=" + q + " ;");
    }
}

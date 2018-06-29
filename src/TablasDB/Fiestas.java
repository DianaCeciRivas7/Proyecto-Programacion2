package TablasDB;

import java.sql.ResultSet;

public class Fiestas {

    Conexion cn = new Conexion();

    public void AgregarFiestas(Object p[]) throws Exception {

        try {
            cn.conectar();
            cn.UID("INSERT into Fiestas(Cod_Fiesta,Nombre_Fiesta,FechaRealizacion,Ganancia_Prevista,Cod_Amenizacion_fk,Cod_Local_fk,Cod_Proyecto_fk) values(\"" + p[0] + "\",\"" + p[1] + "\",\"" + p[2] + "\",\"" + p[3] + "\",\"" + p[4] + "\",\"" + p[5] + "\",\"" + p[6] + "\");");
            cn.desconectar();
        } catch (Exception e) {
            System.out.println("No logra ingresar");
        } finally {
            cn.desconectar();
        }

    }

    public void EliminarFiestas(int p) throws Exception {
        try {
            cn.conectar();
            cn.UID("DELETE FROM Fiestas WHERE Cod_Fiesta='" + p + "'");
            cn.desconectar();
        } catch (Exception e) {
            System.out.println("No logra eliminar");
        } finally {
            cn.desconectar();
        }
    }

    public void ModificarFiestas(Object t[]) throws Exception {
        try {
            cn.conectar();
            cn.UID("UPDATE Fiestas set Nombre_Fiesta=\"" + t[1] + "\", FechaRealizacion=\"" + t[2] + "\", GananciaPrevista=\"" + t[3] + "\", Cod_Amenizacion_fk=\"" + t[4] + "\", Cod_Local_fk=\"" + t[5] + "\", Cod_Proyecto_fk=\"" + t[6] + "\" where Cod_Fiesta=" + t[0] + "; ");
            cn.desconectar();
        } catch (Exception e) {
            System.out.println("No logra modificar");

        } finally {
            cn.desconectar();
        }
    }

    public ResultSet obtenerMaxCodFiesta() {
        return cn.getValores("select max(Cod_Fiesta) as maximo from Fiestas;");
    }

    public ResultSet obtenerFiestas() {
        return cn.getValores("select Fiestas.Cod_Fiesta, Fiestas.Nombre_Fiesta, Fiestas.FechaRealizacion, Fiestas.Ganancia_Prevista, Amenizaciones.Nombre_Amenizacion, Locales.Nombre_Local, Proyectos.Descripcion from Fiestas inner join Amenizaciones on Amenizaciones.Cod_Amenizacion=Fiestas.Cod_Amenizacion_fk inner join Locales on Locales.Cod_Local=Fiestas.Cod_Local_fk inner join Proyectos on Proyectos.Cod_Proyecto=Fiestas.Cod_Proyecto_fk;");
    }
}

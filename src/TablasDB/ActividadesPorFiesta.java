package TablasDB;

import java.sql.ResultSet;

public class ActividadesPorFiesta {

    Conexion cn = new Conexion();

    public void AgregarActividadesPorFiesta(Object p[]) throws Exception {

        try {
            cn.conectar();
            cn.UID("INSERT into ActividadesPorFiesta(Cod_Fiesta_fk,Cod_Actividad_fk) values(\"" + p[0] + "\",\"" + p[1] + "\");");
            cn.desconectar();
        } catch (Exception e) {
            System.out.println("No logra ingresar");
        } finally {
            cn.desconectar();
        }

    }
    
    public void ModificarActividadesPorFiesta(Object t[]) throws Exception {
        try {
            cn.conectar();
            cn.UID("UPDATE ActividadesPorFiesta set Cod_Fiesta_fk=\"" + t[0] + "\" where Cod_Actividad_fk=" + t[1] + "; ");
            cn.desconectar();
        } catch (Exception e) {
            System.out.println("No logra modificar");

        } finally {
            cn.desconectar();
        }
    }
    
    public void EliminarActividadesPorFiestaCodFiesta(int p) throws Exception {
        try {
            cn.conectar();
            cn.UID("DELETE FROM ActividadesPorFiesta WHERE Cod_Fiesta_fk='" + p + "'");
            cn.desconectar();
        } catch (Exception e) {
            System.out.println("No logra eliminar");
        } finally {
            cn.desconectar();
        }
    }

    public void EliminarActividadesPorFiestaCodActividad(int p) throws Exception {
        try {
            cn.conectar();
            cn.UID("DELETE FROM ActividadesPorFiesta WHERE Cod_Actividad_fk='" + p + "'");
            cn.desconectar();
        } catch (Exception e) {
            System.out.println("No logra eliminar");
        } finally {
            cn.desconectar();
        }
    }

    public ResultSet obtenerActividadesPorFiesta() {
        return cn.getValores("select ActividadesPorFiesta.Cod_Fiesta_fk, Fiestas.Nombre_Fiesta, Actividades.Nombre_Actividad, SubActividades.Nombre_SubActividad, SubActividades.Descripcion, SubActividades.Fecha_Realizacion, SubActividades.Ingreso, SubActividades.Egreso from ActividadesPorFiesta inner join Fiestas on Fiestas.Cod_Fiesta=ActividadesPorFiesta.Cod_Fiesta_fk inner join Actividades on Actividades.Cod_Actividad=ActividadesPorFiesta.Cod_Actividad_fk inner join SubActividades on SubActividades.Cod_Actividad_fk=ActividadesPorFiesta.Cod_Actividad_fk order by Fiestas.Nombre_Fiesta;");
    }

    public ResultSet obtenerCodigosFiesta() {
        return cn.getValores("select Cod_Fiesta_fk from ActividadesPorFiesta;");
    }

    public ResultSet obtenerActividadesRegistradas(int codigoFiesta) {
        return cn.getValores("select Fiestas.Nombre_Fiesta,Fiestas.FechaRealizacion,Fiestas.Ganancia_Prevista from ActividadesPorFiesta inner join Fiestas on Fiestas.Cod_Fiesta=ActividadesPorFiesta.Cod_Fiesta_fk where ActividadesPorFiesta.Cod_Fiesta_fk=" + codigoFiesta + ";");
    }

    public ResultSet obtenerCodigoFiesta(int p) {
        return cn.getValores("select Cod_Fiesta_fk from ActividadesPorFiesta where Cod_Actividad_fk=" + p + " ;");
    }

}

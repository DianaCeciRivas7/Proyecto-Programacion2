
package TablasDB;

public class SubActividades {
    
     Conexion cn = new Conexion();

    public void AgregarSubActividades(Object p[]) throws Exception {

        try {
            cn.conectar();
            cn.UID("INSERT into subActividades(Cod_Actividad_fk,Cod_SubActividad,Nombre_SubActividad,Descripcion,Fecha_Realizacion,Ingreso,Egreso) values(\"" + p[0] + "\",\"" + p[1] + "\",\"" + p[2] + "\",\"" + p[3] + "\",\"" + p[4] + "\",\"" + p[5] + "\",\"" + p[6] + "\");");
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

    public void ModificarSubActividades(Object t[]) throws Exception {
        try {
            cn.conectar();
            cn.UID("UPDATE SubActividades set Cod_SubActividad=\"" + t[1] + "\", Nombre_SubActividad=\"" + t[2] + "\", Descripcion=\"" + t[3] +"\", Fecha_Realizacion=\"" + t[4] +"\", Ingreso=\"" + t[5] + "\", Egreso=\"" + t[6] + "\" where Cod_Actividad_fk=" + t[0] + "; ");
            cn.desconectar();
        } catch (Exception e) {
            System.out.println("No logra modificar");

        } finally {
            cn.desconectar();
        }
    }
   
}

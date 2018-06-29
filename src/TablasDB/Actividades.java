
package TablasDB;

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

}

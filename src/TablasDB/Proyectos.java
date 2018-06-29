
package TablasDB;

public class Proyectos {
    
        Conexion cn = new Conexion();

    public void AgregarProyectos(Object p[]) throws Exception {

        try {
            cn.conectar();
            cn.UID("INSERT into Proyectoss(Cod_Proyecto,Descripción,Costo_Previsto) values(\"" + p[0] + "\",\"" + p[1] + "\",\"" + p[2] + "\");");
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

    
}


package TablasDB;

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

    public void EliminarActividadesPorFiesta(int p) throws Exception {
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

   
    
  
}

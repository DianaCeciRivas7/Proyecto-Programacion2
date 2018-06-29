
package TablasDB;


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
            cn.UID("UPDATE Fiestas set Nombre_Fiesta=\"" + t[1] + "\", FechaRealizacion=\"" + t[2] + "\", GananciaPrevista=\"" + t[3] +"\", Cod_Amenizacion_fk=\"" + t[4] +"\", Cod_Local_fk=\"" + t[5] + "\", Cod_Proyecto_fk=\"" + t[6] + "\" where Cod_Fiesta=" + t[0] + "; ");
            cn.desconectar();
        } catch (Exception e) {
            System.out.println("No logra modificar");

        } finally {
            cn.desconectar();
        }
    }
   
}

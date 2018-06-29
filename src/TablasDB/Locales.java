
package TablasDB;

public class Locales {
    
        Conexion cn = new Conexion();

    public void AgregarLocales(Object p[]) throws Exception {

        try {
            cn.conectar();
            cn.UID("INSERT into Locales(Cod_Local,Nombre_Local,Dirección,Costo_Renta,Telefono_local) values(\"" + p[0] + "\",\"" + p[1] + "\",\"" + p[2] + "\",\"" + p[3] + "\",\"" + p[4] + "\");");
            cn.desconectar();
        } catch (Exception e) {
            System.out.println("No logra ingresar");
        } finally {
            cn.desconectar();
        }

    }

    public void EliminarLocales(int p) throws Exception {
        try {
            cn.conectar();
            cn.UID("DELETE FROM Localeses WHERE Cod_Local='" + p + "'");
            cn.desconectar();
        } catch (Exception e) {
            System.out.println("No logra eliminar");
        } finally {
            cn.desconectar();
        }
    }

    public void ModificarLocales(Object t[]) throws Exception {
        try {
            cn.conectar();
            cn.UID("UPDATE Locales set Nombre_Local=\"" + t[1] + "\", Dirección=\"" + t[2] +  "\", Costo_Renta=\"" + t[3] +   "\", Telefono_Local=\"" + t[4] +"\" where Cod_Director=" + t[0] + "; ");
            cn.desconectar();
        } catch (Exception e) {
            System.out.println("No logra modificar");

        } finally {
            cn.desconectar();
        }
    }

    
}


package Metodos_sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTextField;
import Metodos_sql.AgregarProductos;

public class Metodos_sql {
    public static ConexionBD conexion=new ConexionBD();
    public static PreparedStatement sentencia_preparada;
    public static ResultSet resultado;
    public static String sql;
    public static int resultado_numero=0;
    
    public int guardar(String nombre,String email,String contraseña){
        int resultado=0;
        Connection conexion=null;
        String sentencia_guardar=("INSERT INTO usuarios(nombre,email,contraseña) VALUES(?,?,?)");
        
        try{
            conexion=ConexionBD.conectar();
            sentencia_preparada=conexion.prepareStatement(sentencia_guardar);
            sentencia_preparada.setString(1,nombre);
            sentencia_preparada.setString(2,email);
            sentencia_preparada.setString(3,contraseña);
            
            resultado=sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();
        }catch(SQLException e){
            System.out.println(e);
        }
        return resultado;
        
    }
   
    
    
    
    
    public static String buscarNombre(String correo){
        String busqueda_nombre=null;
        Connection conexion=null;
        try{
            conexion=ConexionBD.conectar();
            String sentencia_buscar=("SELECT nombre FROM USUARIOS WHERE nombre= '"+ correo + "'");
            sentencia_preparada=conexion.prepareStatement(sentencia_buscar);
            resultado=sentencia_preparada.executeQuery();
            if(resultado.next()){
                String nombre=resultado.getString("nombre");
                busqueda_nombre=(nombre+"");          
            }
            conexion.close();
            
        }catch(Exception e){
            System.out.println(e);
        }
        return busqueda_nombre;
    }
    public static String buscarganancia(String ganancia){
        String busqueda_nombre=null;
        Connection conexion=null;
        try{
            conexion=ConexionBD.conectar();
            String sentencia_buscar=("SELECT ganancia FROM precios WHERE Codigo= '"+ ganancia + "'");
            sentencia_preparada=conexion.prepareStatement(sentencia_buscar);
            resultado=sentencia_preparada.executeQuery();
            if(resultado.next()){
                String nombre=resultado.getString("ganancia");
                busqueda_nombre=(nombre+"");          
            }
            conexion.close();
            
        }catch(Exception e){
            System.out.println(e);
        }
        return busqueda_nombre;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    public static String buscarusuarioRegistrado(String usuario,String contraseña){
        String busqueda_usuario=null;
        Connection conexion=null;
        try{
            conexion=ConexionBD.conectar();
            
            
           String sentencia_buscar_usuario=("SELECT nombre,contraseña FROM usuarios WHERE nombre= '"+usuario+"' && contraseña= '"+contraseña+"'");
           sentencia_preparada=conexion.prepareStatement(sentencia_buscar_usuario);
           resultado=sentencia_preparada.executeQuery();
            if(resultado.next()){
                busqueda_usuario="usuario encontrado";
            }else{
                 busqueda_usuario="usuario no encontrado";
            }
            conexion.close();
        
        }catch(Exception e){
            System.out.println(e);
        }
        return busqueda_usuario;
    }

    
    public int guardarProduct(String codigo,String nombre,String Pbolsa,String pz,String preciopz){
        int resultado=0;
        Connection conexion=null;
        String sentencia_guardar=("INSERT INTO productos(Codigo,Nombre,bolsa,Piezas,pieza) VALUES(?,?,?,?,?)");
        
        try{
            conexion=ConexionBD.conectar();
            sentencia_preparada=conexion.prepareStatement(sentencia_guardar);
            sentencia_preparada.setString(1,codigo);
            sentencia_preparada.setString(2,nombre);
            sentencia_preparada.setString(3,Pbolsa);
            sentencia_preparada.setString(4,pz);
            sentencia_preparada.setString(5,preciopz);
            
            
            resultado=sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();
        }catch(SQLException e){
            System.out.println(e);
        }
        return resultado;
        
    }
    
    public int id_auto(){
        int id=1;
         Connection conexion=null;
        try{
            
            conexion=ConexionBD.conectar();
            String sentencia_id=("SELECT MAX(Codigo) FROM productos");
            sentencia_preparada=conexion.prepareStatement(sentencia_id);
            resultado=sentencia_preparada.executeQuery();
            while(resultado.next()){
                id=resultado.getInt(1)+1;
            }
             conexion.close();
        }catch(SQLException e){
            System.out.println(e);
    }
    
    return id;
    
    
    }
    
    public boolean  eliminap(int id){
        String sql ="DELETE FROM productos WHERE Codigo=?";
         Connection conexion=null;
         try{
              conexion=ConexionBD.conectar();
               sentencia_preparada=conexion.prepareStatement(sql);
               sentencia_preparada.setInt(1,id);
               sentencia_preparada.execute();
                return true;
               
         }catch (SQLException e){
              System.out.println(e.toString());
              return false;
         }finally{
             try{
                 conexion.close();
             }catch (SQLException ex){
                 System.out.println(ex.toString());
             }
         }
       
    }
    
    
   
    
    public void pasard(){
        
        Connection conexion=null;
        String sentencia_guardar=("INSERT INTO login_bd.precios SELECT Codigo,Nombre,pieza,null,null FROM login_bd.productos");
        
        try{
            conexion=ConexionBD.conectar();
            sentencia_preparada=conexion.prepareStatement(sentencia_guardar);  
            int resultado=sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();
        }catch(SQLException e){
            System.out.println(e);
        }
        
    }
   
    
     public int guardarPllevar(String codigo,String nombre,String Pz){
        int resultado=0;
        Connection conexion=null;
        String sentencia_guardar=("INSERT INTO temp(Codigo,Nombre,Piezasllevadas) VALUES(?,?,?)");
        
        try{
            conexion=ConexionBD.conectar();
            sentencia_preparada=conexion.prepareStatement(sentencia_guardar);
            sentencia_preparada.setString(1,codigo);
            sentencia_preparada.setString(2,nombre);
            sentencia_preparada.setString(3,Pz);
          
            resultado=sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();
        }catch(SQLException e){
            System.out.println(e);
        }
        return resultado;
        
    }
    
     
     
     
     
     
     
     
     
     
}

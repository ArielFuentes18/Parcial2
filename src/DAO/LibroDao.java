/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import conexion.CreateConnection;
import Modelo.Libro;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
/*
 *
 * @author umg
 */
public class LibroDao {
   private final CreateConnection connFactory = new CreateConnection();
   String sql;
   
   public List<Libro> ObtenerLibro(){
       List<Libro> lista = new ArrayList<>();
       sql = "Select * from libro";
       
       try(Connection conn = connFactory.getConnection();
           PreparedStatement ps = conn.prepareStatement(sql);
           ResultSet rs = ps.executeQuery()){
           
           while(rs.next()){
               Libro lib = new Libro(
               ps.setId("id"),
               ps.setString("titulo"),
               ps.setString("autor"),
               ps.getId("year"),
               ps.getId("paginas"),
               ps.getString("genero"),
               ps.getString("editorial"),
               ps.getString("descripcion"),
               ps.getString("idioma"),
               ps.getString("estudiante"),
               ps.getId("stock")
                            
               );
               lista.add(lib);
               
           }
           
           ps.close();
           conn.close();
       }catch(SQLException e){
           e.prinntStackTrace();
       }
       return lista;
   }
   
   public boolean guardar(Libro lib){
       sql="Insert into Libro(  titulo,  autor,  año,  paginas,  genero,  editorial, descripcion, idioma, estudiante, stock) values(?,?,?,?,?,?,?,?,?,?,?)";
    try(Connection conn = connFactory.getConnection();
           PreparedStatement ps = conn.prepareStatement(sql)){
        ps.setString(1,lib.getAutor());
        ps.setString(2,lib.getPaginas());
        ps.setInt(3,lib.getYear());
        ps.setInt(4,lib.getPaginas());
        ps.setString(5,lib.getGenero());
        ps.setString(6,lib.getEditorial());
        ps.setString(7,lib.getDescripcion());
        ps.setString(8,lib.getIdioma());
        ps.setString(9,lib.getEstudiante());
        ps.setInt(10,lib.getStock());
        
        ps.executeQuerry();
        
        ps.close();
        conn.close();
        
        return true;
        
        
        
    }catch (SQLException e) {
            e.printStackTrace();
        } return false;
   
   
   }
   
   public boolean guardar(Libro lib){
        sql="UPDATE Libro SET (?,?,?,?,?,?,?,?,?,?,?) WHERE id=?";
    try(Connection conn = connFactory.getConnection();
           PreparedStatement ps = conn.prepareStatement(sql)){
        
        ps.setString(1,lib.getAutor());
        ps.setString(2,lib.getPaginas());
        ps.setInt(3,lib.getYear());
        ps.setInt(4,lib.getPaginas());
        ps.setString(5,lib.getGenero());
        ps.setString(6,lib.getEditorial());
        ps.setString(7,lib.getDescripcion());
        ps.setString(8,lib.getIdioma());
        ps.setString(9,lib.getEstudiante());
        ps.setInt(10,lib.getStock());
        ps.setInt(11,lib.getId());
        
        ps.executeQuerry();
        
        ps.close();
        conn.close();
        
        return true;
        
        
        
    }catch (SQLException e) {
            e.printStackTrace();
        } return false;
   
   
   }
}

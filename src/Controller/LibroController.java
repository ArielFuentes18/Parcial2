/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import DAO.LibroDao;
import java.util.List;
import java.util.*;
import java.sql.*;
/**
 *
 * @author umg
 */
public class LibroController {
    private final LibroDao dao = new LibroDao();
    
    public List<Libro> ObtenerClientes(){
        return dao.ObtenerLibro();      
    }
    
    public boolean guardarLibros( String titulo, String autor, int year, int paginas, String genero, String editorial, String descripcion, String idioma, String estudiante, int stock){
        Libro lib = new Libro(0,  titulo,  autor,  year,  paginas,  genero,  editorial,  descripcion,  idioma,  estudiante,  stock);
        dao.guardar(lib);
    }
    
    public boolean actualizarLibros( int id,String titulo, String autor, int year, int paginas, String genero, String editorial, String descripcion, String idioma, String estudiante, int stock){
        Libro lib = new Libro(id,  titulo,  autor,  year,  paginas,  genero,  editorial,  descripcion,  idioma,  estudiante,  stock);
        dao.guardar(lib);
    }
   
}

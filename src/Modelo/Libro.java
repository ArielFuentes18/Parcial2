/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author umg
 */
public class Libro {
    int id;
    String titulo;
    String autor;
    int year;
    int paginas;
    String genero;
    String editorial;
    String descripcion;
    String idioma;
    String estudiante;
    int stock;

    public Libro() {
        this.id = 0;
        this.titulo = "";
        this.autor = "";
        this.year = 0;
        this.paginas = 0;
        this.genero = "";
        this.editorial = "";
        this.descripcion = "";
        this.idioma = "";
        this.estudiante = "";
        this.stock = 0;
    }
    
    public Libro(int id, String titulo, String autor, int year, int paginas, String genero, String editorial, String descripcion, String idioma, String estudiante, int stock) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.year = year;
        this.paginas = paginas;
        this.genero = genero;
        this.editorial = editorial;
        this.descripcion = descripcion;
        this.idioma = idioma;
        this.estudiante = estudiante;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(String estudiante) {
        this.estudiante = estudiante;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    
           
}

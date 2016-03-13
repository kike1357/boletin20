package boletin20;

import javax.swing.JOptionPane;


public class Libros {
    
    private String titulo;
    private String autor;
    private String isbn;
    private float precio;
    private int nUnidades;

    /**
     *
     * @param titulo
     * @param autor
     * @param isbn
     * @param precio
     * @param nUnidades
     */
    public Libros(String titulo, String autor, String isbn, float precio, int nUnidades) {
        titulo = JOptionPane.showInputDialog("Introduce titulo del libro");
        autor = JOptionPane.showInputDialog("Introduce autor");
        isbn = JOptionPane.showInputDialog("Introduce ISBN");
        precio = Integer.parseInt(JOptionPane.showInputDialog("Introduce precio"));
        nUnidades ++;
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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getnUnidades() {
        return nUnidades;
    }

    public void setnUnidades(int nUnidades) {
        this.nUnidades = nUnidades;
    }
    
    }


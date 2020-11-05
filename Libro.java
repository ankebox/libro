
/**
 * Una clase que representa objetos libro.
 * Esta clase podria formar parte de un
 * proyecto mas grande, como el de una aplicacion de
 * una biblioteca
 * 
 * @author Miguel Bayon 
 * @version 1.0
 */
public class Libro {

    private String autor;
    private String titulo;
    private int numeroPaginas;
    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroPaginasLibro)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = numeroPaginasLibro;
    }

    public String getAutor(){
       return autor;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public void imprimeAutor(){
        System. out. println("autor" + autor);
    }
    
    public void imprimeTitulo(){
        System. out. println("titulo" + titulo);
    }
    
    public int muestraNumeroPaginas(){
        return numeroPaginas;
    }
    
    public void imprimirDetalles(){
        System. out. println("Titulo, " + titulo + "  Autor, " + autor + "  Numero de paginas, " + numeroPaginas);
    }
    
    public String getDetalles(){ 
        return ("Titulo, " + titulo + "  Autor, " + autor + "  Numero de paginas, " + numeroPaginas);
    }
}

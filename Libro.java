
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
    private String numeroReferencia;
    private int vecesPrestado;
    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroPaginasLibro)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = numeroPaginasLibro;
        numeroReferencia = "";
        vecesPrestado = 0;
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
        if(numeroReferencia != ""){
            System. out. println("Titulo, " + titulo + "  Autor, " + autor + "  Numero de paginas, " + numeroPaginas + " Numero referencia, " + numeroReferencia + " Veces prestado, " + vecesPrestado);
        }
        else{
            System. out. println("Titulo, " + titulo + "  Autor, " + autor + "  Numero de paginas, " + numeroPaginas + " Numero referencia, ZZZ  Veces prestado, " + vecesPrestado);
        }
    }
    
    public String getDetalles(){ 
        String aDevolver = "";
        if (numeroReferencia != aDevolver){
            aDevolver = numeroReferencia;
        }
        else{
            aDevolver = "ZZZ";
        }
        return ("Titulo, " + titulo + " Autor, " + autor + " Numero de paginas, " + numeroPaginas + " Numero referencia, " + aDevolver + " Veces Prestado, " + vecesPrestado);
    }
    
    public String getNumeroReferencia(){
        return numeroReferencia;
    }
    
    public void setNumeroReferencia(String numeroReferenciaDe){
        if(numeroReferenciaDe.length() < 3){
            System. out. println("ERROR el numero de referencia introducido tener 3 o mas letras");
        }
        else{
            numeroReferencia = numeroReferenciaDe;
        }
    }
    
    public void prestar(){
        vecesPrestado = vecesPrestado + 1;
    }
    
    public int getVecesPrestado(){
        return vecesPrestado;
    }
    
}

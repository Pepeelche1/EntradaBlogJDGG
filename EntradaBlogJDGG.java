package com.company;


/**
 * Clase para manejar entradas a un blog
 * @author Jose Daniel Guijarro
 * @since 6/2/23
 */
public class EntradaBlogJDGG{
    /**
     * El separador es el caracter que separa
     * ENTRADA DE del nombre del autor
     */
    public static char separador=':';
private int id;
private String texto;
private String autor;

    /**
     * Constructor de la clase, recibe el numero de la entrada, el autor
     * y el texto de la entrada, si el numero es negativo lanza una excepcion
     * @param id
     * @param autor
     * @param texto
     * @throws IllegalArgumentException
     */
    public EntradaBlogJDGG(int id,String autor,String texto)throws IllegalArgumentException{
        if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
        this.id=id;
        this.autor=autor;
        this.texto=texto;
        }
@Override
public String toString(){
        String cad="";
        cad+="\nENTRADA DE"+separador+autor;
        cad+="\n "+texto;
        return cad;
        }

    /**
     *
     * @return numero de la entrada
     */
    public int getId(){
        return this.id;
        }

    /**
     *
     * @return texto de la entrada
     */
    public String getTexto(){
        return this.texto;
        }

    /**
     *
     * @return autor de la entrada.
     */
    public String getAutor(){
        return this.autor.toUpperCase();
        }

public static void main(String[] args) {
        EntradaBlogJDGG e1=new EntradaBlogJDGG (4,"Jose Daniel","Últimas noticias, está disponible BixBy 2.0");
        System.out.println(e1);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud3;


import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import sourcedb.Director;
import sourcedb.Genero;
import sourcedb.HibernateUtil;
import sourcedb.Pelicula;

/**
 *
 * @author Shy
 */
public class Peliculas {
    
    private Session sesion;

    public Peliculas() {
        sesion = HibernateUtil.getSessionFactory().openSession(); 
    }
 
    public List<Pelicula> ObtenerPelicula() {
        Transaction transaccion = sesion.beginTransaction();
        
        Query query = sesion.createQuery("from Pelicula");
        
        List<Pelicula> pelicula = query.list();
        
        transaccion.commit();
        
//        for (int i = 0; i < pelicula.size(); i++) {
//            
//            System.out.println(pelicula.get(i).getTitulopelicula());
//            //System.out.println(pelicula.get(i));
//            System.out.println(pelicula.get(i).getDirector().getNacionalidad());
//            
//        }
        sesion.clear();
        
        return pelicula;
    }
    
    public List<Director> ObtenerDirector() {
        Transaction transaccion = sesion.beginTransaction();
        
        Query query = sesion.createQuery("from Director");
        
        List<Director> director = query.list();
        
        transaccion.commit();
        
//        for (int i = 0; i < pelicula.size(); i++) {
//            
//            System.out.println(pelicula.get(i).getTitulopelicula());
//            //System.out.println(pelicula.get(i));
//            System.out.println(pelicula.get(i).getDirector().getNacionalidad());
//            
//        }
        sesion.clear();
        
        return director;
    }
    
    public List<Genero> ObtenerGenero() {
        Transaction transaccion = sesion.beginTransaction();
        
        Query query = sesion.createQuery("from Genero");
        
        List<Genero> genero = query.list();
        
        transaccion.commit();
        
//        for (int i = 0; i < pelicula.size(); i++) {
//            
//            System.out.println(pelicula.get(i).getTitulopelicula());
//            //System.out.println(pelicula.get(i));
//            System.out.println(pelicula.get(i).getDirector().getNacionalidad());
//            
//        }
        sesion.clear();
        
        return genero;
    }
    
//    public void ObtPeli() {
//        Transaction transaccion = sesion.beginTransaction();
//        
//        Query query = sesion.createQuery("from Pelicula");
//        
//        List<Pelicula> pelicula = query.list();
//        
//        transaccion.commit();
//        
//        sesion.clear();
//        
//    }
    
    public void InsertarPelicula(String Titulo, String TituloOriginal, String Duracion, String Descripcion, Director director, Genero genero ) {
        
        
        Transaction transaccion = sesion.beginTransaction();
        
        Pelicula pelicula = new Pelicula();
        pelicula.setTitulopelicula(Titulo);
        pelicula.setTitulooriginal(TituloOriginal);
//        pelicula.setIdpelicula(15);
        pelicula.setDuracion(Duracion);
        pelicula.setImgpelicula("img/pelicula.png");
        pelicula.setDirector(director);
        pelicula.setGenero(genero);
        pelicula.setDescripcion(Descripcion);
        
        sesion.save(pelicula);
        
        transaccion.commit();
        
        sesion.clear();
        
    }
    
    public void ActualizarPelicula(String ID, String Titulo, String TituloOriginal, String Duracion, String Descripcion, Director director, Genero genero) {
        
        Transaction transaccion = sesion.beginTransaction();
        
        Pelicula pelicula = new Pelicula();
        pelicula.setTitulopelicula(Titulo);
        pelicula.setTitulooriginal(TituloOriginal);
        pelicula.setIdpelicula(Integer.parseInt(ID));
        pelicula.setDuracion(Duracion);
        pelicula.setImgpelicula("img/pelicula.png");
        pelicula.setDirector(director);
        pelicula.setGenero(genero);
        pelicula.setDescripcion(Descripcion);
        
        sesion.update(pelicula);
        
        transaccion.commit();
        sesion.clear();
        
        
    }
    
    public void EliminarPelicula(String ID, String Titulo, String TituloOriginal, String Duracion, String Descripcion, Director director, Genero genero) {
        
        Transaction transaccion = sesion.beginTransaction();
        
        Pelicula pelicula = new Pelicula();
        pelicula.setTitulopelicula(Titulo);
        pelicula.setTitulooriginal(TituloOriginal);
        pelicula.setIdpelicula(Integer.parseInt(ID));
        pelicula.setDuracion(Duracion);
        pelicula.setImgpelicula("img/pelicula.png");
        pelicula.setDirector(director);
        pelicula.setGenero(genero);
        pelicula.setDescripcion(Descripcion);
        
        sesion.delete(pelicula);
        
        transaccion.commit();
        sesion.clear();
        
        
    }
    
    public void InsertarDirector(String nombre, String nacionalidad) {
        
        
        Transaction transaccion = sesion.beginTransaction();
        
        Director dirs = new Director();
        
        dirs.setNombre(nombre);
        dirs.setNacionalidad(nacionalidad);
        
        
        sesion.save(dirs);
        
        transaccion.commit();
        
        sesion.clear();
        
    }
    
    public void Eliminardirector(Director director) {
        
        Transaction transaccion = sesion.beginTransaction();
        
        Director dirs = new Director();
        
        dirs.setIddirector(director.getIddirector());
        dirs.setNombre(director.getNombre());
        dirs.setNacionalidad(director.getNacionalidad());
        
        
        
        sesion.delete(dirs);
        
        transaccion.commit();
        sesion.clear();
        
        
    }
    
    public void InsertarGenero(String nombre) {
        
        
        Transaction transaccion = sesion.beginTransaction();
        
        Genero genero = new Genero();
        
        genero.setGeneropelicula(nombre);
        
        
        sesion.save(genero);
        
        transaccion.commit();
        
        sesion.clear();
        
    }
    
    public void EliminarGenero(Genero genero) {
        
        
        Transaction transaccion = sesion.beginTransaction();
        
        Genero gnr = new Genero();
        
        gnr.setIdgenero(genero.getIdgenero());
        gnr.setGeneropelicula(genero.getGeneropelicula());
        
        
        sesion.delete(gnr);
        
        transaccion.commit();
        
        sesion.clear();
        
    }
}



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.canela.ui;

import java.util.ArrayList;
import java.util.List;
import mx.itson.canela.entidades.Ingrediente;
import mx.itson.canela.entidades.Receta;
import mx.itson.canela.numeradores.Dificultad;

/**
 *
 * @author alumnog
 */
public class Main {
    
public static void main(String[] args){
    
    Receta receta = new Receta();
    
    receta.setNombre("Frankie Brownie");
    receta.setDescripcion("Hornea una receta de FRANKIE BROWNIES con Leche Condensada LA LECHERA® para este Halloween y ofrécelas en tu reunión, con amigos, o con tu familia.");
    receta.setNumeroPorciones(6);
    receta.setTiempo(62);
    
    List<Ingrediente> ingredientes = new ArrayList<>();
    
    Ingrediente ingrediente1 = new Ingrediente();
    ingrediente1.setNombre("1 Caja de Harina para Brownies");
    ingredientes.add(ingrediente1);
    
    Ingrediente ingrediente2 = new Ingrediente();
    ingrediente2.setNombre("3 Cucharadas de Agua");
    ingredientes.add(ingrediente2);
    
    receta.setIngredientes(ingredientes);
    
    
    receta.setDificultad(Dificultad.INTERMEDIO);
    
    //Puras pinches Twice y no mamadas
    
    
    
}
    
    
}
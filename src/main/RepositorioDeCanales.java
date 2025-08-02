package main;

import java.util.ArrayList;
import java.util.List;

public class RepositorioDeCanales {
    private static final RepositorioDeCanales instancia = new RepositorioDeCanales();
    private List<Canal> canales = new ArrayList<>();

    private RepositorioDeCanales(){

    }

    public static RepositorioDeCanales getIntancia(){
        return instancia;
    }

    public Boolean contieneA(Canal canal){
        return canales.stream().anyMatch(c -> c.sonElMismo(canal));
    }

    public List<Canal> getCanales(){
        return new ArrayList<>(this.canales);
    }
    public  void  añadirCanal(Canal canal){
        if(this.contieneA(canal)){
            throw new IllegalArgumentException("Este canal  ya se encuentra registrado");
        }
        canales.add(canal);
    }
    public void removerCanal(Canal canal){
        if(!this.contieneA(canal)){
            throw new IllegalArgumentException("Este canal no se encuentra registrado");
        }
        canales.removeIf(c -> c.sonElMismo(canal));
    }
}

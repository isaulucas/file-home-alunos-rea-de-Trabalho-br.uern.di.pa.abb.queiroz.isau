package br.uern.di.pa.abb.queiroz.isau;

import br.uern.di.pa.abb.queiroz.isau.Papagaio;
import br.uern.di.pa.abb.queiroz.isau.Currupio;

public class App {
     public static void main(String args[]){
    Papagaio papagaio = new Papagaio(10);
    Currupio currupio = new Currupio(20);
    
 papagaio.cantar();
 System.out.println("Papagaio voa " + papagaio.voar(5)); 
 System.out.println("Papagaio voa" + papagaio.voar(12));
 
 currupio.cantar();
 System.out.println("Currupio voa " + currupio.voar(5)); 
 System.out.println("Currupio voa" + currupio.voar(12));
}
}

package br.uern.di.pa.abb.queiroz.isau;   

import br.uern.di.pa.abb.queiroz.isau.Passaro;

public  class Currupio extends Passaro{
    private int distancia_maxima = 0;
    
    public Currupio(int valor){
        this.distancia_maxima=valor;
    
}
  
    
    @Override
  public void cantar(){
  System.out.println("Piu friu fru frio Pio"); 
  }
  
    
    @Override
  public int voar(int valor){
  int distancia = 0;
  if (valor > this.distancia_maxima){
      distancia = this.distancia_maxima;
  }
  else{
    distancia = valor;}
  return distancia; 
} 
  }

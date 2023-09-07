public class SmartTv {
    boolean ligada=false;
    int canal=1;
    int volume = 25;

    public void aumentarVolume(){
        volume++;
        System.out.println("Volume aumentado para: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Volume diminuído para: " + volume);
    }

    public void ligar(){
        ligada=true;
    }

    public void desligar(){
        ligada=false;
    }

    public void mudarCanal (int novoCanal){
        this.canal = novoCanal;
    }

    public void aumentarCanal(){
        this.canal++;
    }

    public void diminuirCanal(){
        this.canal--;
    }
}

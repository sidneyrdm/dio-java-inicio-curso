public class SmartTv {
    
    boolean ligada = false;
    int canal = 1;
    int volume = 7;

    public void ligar(){
        this.ligada = true;
    }

    public void desligar(){
        this.ligada = false;
    }

    public void aumentarVolume(){
        this.volume++;
    }

    public void dimuirVolume(){
        this.volume--;
    }
    public void aumentarCanal(){
        this.canal++;
    }

    public void dimuirCanal(){
        this.canal--;
    }

}

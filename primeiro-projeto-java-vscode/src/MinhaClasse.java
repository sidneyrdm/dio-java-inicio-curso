public class MinhaClasse {  
    public static void main(String[] args){

        SmartTv smartTv = new SmartTv();

        System.out.println("a tv está ligada? "+smartTv.ligada);
        System.out.println("a tv está em que volume? "+smartTv.volume);
        System.out.println("a tv está em que canal? "+smartTv.canal);

        smartTv.ligar();
        System.out.println("NOVO STATUS - a tv está ligada? "+smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("NOVO STATUS - em que volume? "+smartTv.volume);
       

    }
}

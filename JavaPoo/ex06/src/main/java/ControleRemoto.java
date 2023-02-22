public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;
    private boolean menu;

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = true;
        this.tocando = false;
        this.menu = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    private boolean isMenu(){
        return menu;
    }

    private void setMenu(boolean menu){
        this.menu = menu;
    }
    
    @Override
    public void ligar() {
        this.setLigado(true);
        System.out.println("[o]Ligado.");
    }

    @Override
    public void desligar() {
        this.setLigado(false);
        System.out.println("[x]Desligado");
    }

    @Override
    public void abrirMenu() {
        this.menu = true;
        if(this.isLigado()){
            if(this.isTocando()){
                 System.out.println("Está Tocando...");
            }else{
                System.out.println("Pause ");
            }
           System.out.print("Volume: " + this.getVolume());
           if(this.getVolume()> 0){
               for(int i = 0; i <= this.getVolume(); i += 10){
                   System.out.print("|");
               }
           }
           System.out.println(" ");   
        }
        
    }

    @Override
    public void fecharMenu() {
        if(this.isLigado()){
           System.out.println("Fechando menu..."); 
        }
        
    }

    @Override
    public void maisvolume() {
        if(this.isLigado()){
            this.setVolume(this.getVolume() + 5);
        }
    }

    @Override
    public void menosVolume() {
        if(this.isLigado() && this.getVolume() > 0){
            this.setVolume(this.getVolume() - 5);
        }
    }

    @Override
    public void ligarMudo() {
        if(this.isLigado() && this.getVolume() > 0){
            this.setVolume(0);
            System.out.println("[Mudo]");
        }
    }

    @Override
    public void desligarMudo() {
        if(this.isLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.isLigado() && !(this.isTocando())){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.isLigado() && this.isTocando()){
            this.setTocando(false);
        }
    }
    
    
}

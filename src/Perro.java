public class Perro extends Anmal {
    public Perro(){

    }

    @Override
    public void sonido(){
        System.out.println(this.getNombre()+" dice GUAU ");
    }
    public void rascar(){
        System.out.println(this.getNombre()+" rasca la puerta ");
    }
}

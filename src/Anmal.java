public abstract class Anmal {
    private String nombre;

    public Anmal(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void comer(){
        System.out.println("esta comiendo");
    }

    public void caminar(){
        System.out.println("esta caminando");
    }
    public void jugar(){
        System.out.println("esta jugando");
    }
    public abstract void rascar();

    public abstract void sonido();
}

public class Player {

//    atributos:
    public static int getTeam;
    private String nome;
    private int vida;
    private int team;
    private Arma arma;

//    metodos:
    public void atirar() throws InterruptedException {
        arma.atirar();
    }
    
    public int getTeam() {
        return this.team;
    }

    public void equipar() {
        arma.equipar();
    }

    public void tomarDano(int dano) {
        vida -= dano;
        if (vida <= 0) {
            System.out.println(nome + " morreu!");
        } else {
            System.out.println(nome + " tomou " + dano + " de dano e agora tem " + vida + " de vida.");
        }
    }
}

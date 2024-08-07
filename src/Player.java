public class Player {
    public static int getTeam;
    private String nome;
    private int vida;
    private int team;
    private Arma arma;

    public Player(String nome, int vida, int team, Arma arma) {
        this.nome = nome;
        this.vida = vida;
        this.team = team;
        this.arma = arma;
    }

    public void atirar() throws InterruptedException {
        arma.atirar();
    }
    
    public int getTeam() {
        return team;
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

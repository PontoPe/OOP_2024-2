//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MeuJogo{
    public static void main(String[] args) {

        Team Spetznas = new Team();
        Spetznas.name = "Spetznas";
        Spetznas.score = 0;

        Team TaskForce = new Team();
        TaskForce.name = "TaskForce";
        TaskForce.score = 0;

        Arma MP7 = new Arma();
        MP7.nome = "MP7";
        MP7.dano = 24;
        MP7.capacidade = 30;
        MP7.maxRange = 100;
        MP7.tempoRecarga = 1100;
        MP7.team = 1;
        MP7.fireRate = 900;

        Arma AK47 = new Arma();
        AK47.nome = "AK47";
        AK47.dano = 30;
        AK47.capacidade = 30;
        AK47.maxRange = 200;
        AK47.tempoRecarga = 1500;
        AK47.team = 2;
        AK47.fireRate = 550;

        Arma M4A1 = new Arma();
        M4A1.nome = "M4A1";
        M4A1.dano = 27;
        M4A1.capacidade = 30;
        M4A1.maxRange = 150;
        M4A1.tempoRecarga = 1200;
        M4A1.team = 1;
        M4A1.fireRate = 700;

        Player player1 = new Player();
        Player player2 = new Player();

        player1.arma = MP7;
        player1.nome = "PontoPe";
        player1.vida = 100;
        player1.team = Spetznas;

        player2.arma = M4A1;
        player2.nome = "mimiza";
        player2.vida = 100;
        player2.team = TaskForce;

        System.out.println(player1.nome + ", do time " + player1.team.name + " equipou a " + player1.arma.nome + "\n" + player2.nome + ", do time " + player2.team.name + " equipou a " + player2.arma.nome );

        System.out.println("Iniciando o jogo...");
        System.out.println(player1.nome + " vai ao meio de campo, enquanto " + player2.nome + " vai pelo flanco direito!");
        System.out.println(player2.nome + " avista " + player1.nome + " pelas costas e atira!");
        System.out.println(player1.nome + " toma " + 2*player2.arma.dano + " de dano e agora tem " + (player1.vida - 2*player2.arma.dano) + " de vida, mas tem tempo de virar para tras e entregar " + 3*player1.arma.dano + " de dano para " + player2.nome + " que por sua vez tem " + (player2.vida - 3*player1.arma.dano) + " de vida.");
        System.out.println("Mas os dois jogadores conseguem sair vivos da trocacao.");

    }
}
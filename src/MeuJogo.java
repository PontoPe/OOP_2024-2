//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MeuJogo{
    public static void main(String[] args) {

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
    }
}
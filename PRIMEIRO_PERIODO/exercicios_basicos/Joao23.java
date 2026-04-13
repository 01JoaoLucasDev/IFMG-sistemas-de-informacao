package exercicios_basicos;

// IFMG - Campus Sabará
// EXERCICIO 23 - João Lucas da Costa Bernardo
public class Joao23 {
    public static void main(String[] args) {

        int totalA = 1450, totalB = 1150, totalC = 900;
        int interAB = 350, interAC = 400, interBC = 300;
        int interABC = 100;
        int totalPesquisa = 3000;


        int apenasAB = interAB - interABC;
        int apenasAC = interAC - interABC;
        int apenasBC = interBC - interABC;


        int apenasA = totalA - (apenasAB + apenasAC + interABC);
        int apenasB = totalB - (apenasAB + apenasBC + interABC);
        int apenasC = totalC - (apenasAC + apenasBC + interABC);


        int totalGostam = apenasA + apenasB + apenasC + apenasAB + apenasAC + apenasBC + interABC;
        int nenhuma = totalPesquisa - totalGostam;



        System.out.println("Gostam apenas de A: " + apenasA);
        System.out.println("Gostam apenas de B: " + apenasB);
        System.out.println("Gostam apenas de C: " + apenasC);
        System.out.println("Não gostam de nenhuma: " + nenhuma);
    }
}
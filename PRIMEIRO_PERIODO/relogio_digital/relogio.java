package relogio_digital;

public class relogio {
    public static void main(String[] args) {
        for (int hora = 0; hora < 24; hora++) {
            for (int minuto = 0; minuto < 60; minuto++) {
                for (int segundo = 0; segundo < 60; segundo++) {
                    if (hora < 12) {
                        System.out.printf("%02d:%02d:%02d\n AM ", hora, minuto, segundo);
                    } else {
                        System.out.printf("%02d:%02d:%02d\n PM ", hora, minuto, segundo);
                    }
                }
            }
        }
    }
    
}

import java.util.concurrent.ThreadLocalRandom;

public class Tirada implements Runnable {


    Dado dadoclass = new Dado();

    @Override
    public void run() {
        int resultado;
        for (int i = 0; i < 10000; i++) {
            resultado = ThreadLocalRandom.current().nextInt(0, 6);
            dadoclass.suma(resultado);
        }
    }



    protected void imprimir() {


        for (int i = 0;i < dadoclass.dado.length;i++) {
            System.out.printf("Numero %d: %s\n", (i + 1), dadoclass.dado[i]);
        }


        System.out.printf("%s + %s + %s + %s + %s + %s = %s",dadoclass.dado[0].toString(),dadoclass.dado[1].toString(),dadoclass.dado[2].toString(),
                dadoclass.dado[3].toString(),
                dadoclass.dado[4].toString(),
                dadoclass.dado[5].toString(),
                dadoclass.total.toString());
    }
}

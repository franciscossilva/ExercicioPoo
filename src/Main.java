public class Main {
    public static void main(String[] args) {
        Renault renault = new Renault("2020","12.000","Azul","4");
        renault.iniciarmotor();
        renault.acelerar();
        renault.frear();
        renault.frear();
        renault.Informaçoes();

        System.out.println();

        Fiat fiat = new Fiat("2000","3.000","Vermelho","2");
        fiat.iniciarmotor();
        fiat.acelerar();
        fiat.frear();
        fiat.Informaçoes();


        System.out.println();

        Hyundai hyundai = new Hyundai("2023","25000","Branco","4");
        hyundai.iniciarmotor();
        hyundai.acelerar();
        hyundai.acelerar();
        hyundai.frear();
        hyundai.Informaçoes();
    }
}
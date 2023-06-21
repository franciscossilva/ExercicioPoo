public class Hyundai extends Carro{
    public Hyundai(int ano,double valor,String cor ,int portas){
        super("Hyundai",ano,valor,cor,portas);
        this.velocidade=5;
    }
    @Override
public void iniciarmotor(){
    System.out.println("Iniciando o motor. Minha velocidade é: "+ velocidade+"KM/H");
    }
    @Override
    public void frear(){
        velocidade-=2;
        System.out.println("Freando. Minha velocidade esta em: "+ velocidade+ "KM/H");
    }
    @Override
    public void acelerar(){
        velocidade+=15;
        System.out.println("Acelerando minha velocidade esta: "+ velocidade+ "KM/h");
    }
}
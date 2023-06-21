public class Fiat extends Carro{
    public Fiat(String ano,double valor,String cor,int portas){
        super("Fiat",ano,valor,cor,portas);
        this.velocidade=3;
    }
    @Override
    public void iniciarmotor(){
        System.out.println("Iniciando o motor. minha velocidade esta em: "+ velocidade+"KM/H");
    }
    @Override
    public void frear(){
        velocidade-=6;
        System.out.println("Freando a a minha velocidade esta em: "+ velocidade+ "KM/H");
    }
    @Override
    public void acelerar (){
        velocidade+=12;
        System.out.println("Acelerando. Minha velocidade é : "+ velocidade+"KM/H");

    }
}

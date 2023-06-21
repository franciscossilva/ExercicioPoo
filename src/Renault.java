public class Renault extends Carro {
    public Renault(int ano,double valor,String cor,int portas){
        super("Renault",ano,valor,cor,portas);
    }
    @Override
public void iniciarmotor(){
    System.out.println("Iniciando o motor, minha velocidede está em : "+ velocidade+" KM/H");}
    @Override
public void frear(){
    velocidade-= 5;
    System.out.println("Freando. A minha velocidade está: "+ velocidade+ "KM/H");}
    @Override
    public void acelerar(){
        velocidade+=10;
        System.out.println("Acelerando. Minha velocidade está em: "+ velocidade+ "KM/H");
    }

}

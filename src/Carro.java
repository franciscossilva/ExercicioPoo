public abstract class Carro {
    private String marca;
    private int ano;
    private double valor;
    private String cor;
    private int portas;
    protected int velocidade;

    public Carro(String marca, int ano, double valor, String cor, int portas) {
        this.marca = marca;
        this.ano = ano;
        this.valor = valor;
        this.cor = cor;
        this.portas = portas;
        this.velocidade = 0;
    }

    public abstract void iniciarMotor();

    public abstract void frear();

    public abstract void acelerar();

    public void Informaçoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
        System.out.println("Valor: " + valor);
        System.out.println("Cor: " + cor);
        System.out.println("Portas: " + portas);
        System.out.println("Velocidade: " + velocidade + "km/h");
    }
}


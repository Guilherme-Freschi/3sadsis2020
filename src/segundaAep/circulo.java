package exercicio3e4;

public class circulo {
    public double raio;

    public circulo(double r) {
        setRaio(r);
    }

    //metodo altera raio*
    public void setRaio(double r) {
        if (r < 0)
            throw new RuntimeException("O raio não pode ser negativo.");
        else
            raio = r;
    }
    //metododo informa raio

    public double getRaio() {
        return raio;
    }

    public double diametro() {
        return raio * 2;
    }
    public boolean verificarDiametro(){
        try {
            if(this.diametro()<0) {
                throw new RuntimeException("Não possui raio.");
            }
            return true;
            }catch (Exception exc) {
            System.out.println("Mensagem exceção: " + exc.getMessage());
            return false;
        }
    }

    //metodo calcular circunferencia
    public double circunferencia() {
        return 2 * Math.PI * raio;           //Match.PI retorna valor de PI
    }
    public void exibeDados(){
        System.out.println("============================================\n");
        System.out.println("Raio é: " + getRaio());
        System.out.println("Diametro é: " +diametro());

    }
}

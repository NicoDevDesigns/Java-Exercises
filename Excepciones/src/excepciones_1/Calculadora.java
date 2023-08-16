package excepciones_1;

public class Calculadora {
    public double dividir(int numerador, int divisor) throws DivisionPorZeroException{
        if(divisor==0){
            throw new DivisionPorZeroException("No se puede dividir por cero");
        }
        return numerador/(double)divisor;
    }
    public double dividir(String numerador, String divisor) throws DivisionPorZeroException, FormatoNumeroException {
        try {
            int num = Integer.parseInt(numerador);
            int dev = Integer.parseInt(divisor);
            return dividir(num,dev);
        }catch (NumberFormatException e){
            throw new FormatoNumeroException("Ingresar numeros!");
        }




    }
}

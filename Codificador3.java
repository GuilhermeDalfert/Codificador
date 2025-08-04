import java.time.LocalDate;

public class Codificador3 implements Codificador{

    @Override
    public String getNome() {
        return "Codificador Inversor";
    }

    @Override
    public LocalDate getDataCriacao() {
        return LocalDate.of(2025,8,4);
    }

    @Override
    public int getNivelSeguranca() {
        return 1;
    }

    @Override
    public String codifica(String str) {
        StringBuilder encoded = new StringBuilder(str);
        encoded = encoded.reverse();
        return encoded.toString();
    }

    @Override
    public String decodifica(String str) {
        StringBuilder decoded = new StringBuilder(str);
        decoded = decoded.reverse();
        return decoded.toString();
    }
    
}

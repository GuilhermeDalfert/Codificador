import java.time.LocalDate;

public class Codificador1 implements Codificador {

    public String getNome(){
        return "Codificador1";
    }

    // Retorna a data de imlementação do codificador (pode ser usado como versao)
    public LocalDate getDataCriacao(){
        return LocalDate.of(2025, 8, 4);
    }

    // Retorna o nivel de segurança do codificador (1 = muito baixo, 100 = muito alto)
    public int getNivelSeguranca()
    {
        return 30;
    }

    // Recebe um string e retorna o correspondente codificado
    public String codifica(String str){
        StringBuilder codigo = new StringBuilder();

        for (int i = 0; i < str.length(); i++){
            codigo.append((char) (str.charAt(i) + 5));
        }

        return codigo.toString();
    }

    // Recebe um string codificado e retorna o correspondente decodificado
    public String decodifica(String str){
        StringBuilder decodigo = new StringBuilder();

        for (int i = 0; i < str.length(); i++){
            decodigo.append((char)(str.charAt(i)-5));
        }
        return decodigo.toString();
    }
}
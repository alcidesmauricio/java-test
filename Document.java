public class Documento {
    private String cnpj;

    private String numerodocumento;

    // Construtor padrão
    public Documento() {
    }

    // Construtor com parâmetro
    public Documento(String cnpj) {
        this.cnpj = cnpj;
    }

    public Documento(String numerodocumento) {
        this.numerodocumento = numerodocumento;
    }

    // Getter para cnpj
    public String getCnpj() {
        return cnpj;
    }

    // Setter para cnpj
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    // Getter para numerodocumento
    public String getnumerodocumento() {
        return numerodocumento;
    }

    // Setter para numerodocumento
    public void setnumerodocumento(String numerodocumento) {
        this.numerodocumento = numerodocumento;
    }

    // Método para exibir informações do objeto
    @Override
    public String toString() {
        return "Documento{" +
                "cnpj='" + cnpj + '\'' +
                '}';
    }
}
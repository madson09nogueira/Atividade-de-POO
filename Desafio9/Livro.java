public class Livro {
    String titulo;
    String autor;
    int codigo;
    boolean disponivel;

    public Livro (String titulo, String autor, int codigo, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.codigo = codigo;
        this.disponivel = disponivel;
    }

    boolean emprestar() {
        if (disponivel) {
            disponivel = false;
            return true;
        } else { 
            return false;
        }
    }

    boolean devolver() {
        if (!disponivel) {
            disponivel = true;
            return true;
        } else {
            return false;
        }
    }

    String mostrarDados() {
        String status;
        if (disponivel) {
            status = "Disponivel";
        } else {
            status = "Indisponivel";
        }

        return "Titulo: " + titulo
        +      "\nAutor: " + autor
        +      "\nCódigo: " + codigo
        +      "\nDisponibilidade: " + status;
            
    }
}

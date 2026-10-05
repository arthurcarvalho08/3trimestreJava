public class livro{
    private int paginas;
    private String autor;
    private String titulo;
}

public livro(int paginas, String autor, String titulo){
    this.paginas = paginas;
    this.autor = autor;
    this.titulo = titulo;
}

public int getpaginas(){
    return paginas;
}

public void setpaginas(int paginas){
    this.paginas = paginas;
}

public int getautor(){
    return autor;
}

public void setautor(String autor){
    this.autor = autor;
}

public int gettitulo(){
    return titulo;
}

public void settitulo(String titulo){
    this.titulo = titulo;
}

public int get
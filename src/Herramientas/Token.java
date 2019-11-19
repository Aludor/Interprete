package Herramientas;

import java.util.ArrayList;

public class Token {
    private String tipo;
    private String lexema;
    private ArrayList<Token> hijos;

    public Token(String tipo, String lexema) {
        this.hijos = new ArrayList<>();
        this.tipo = tipo;
        this.lexema = lexema;
    }
    
    public void agregarHijos(Token t){
        this.hijos.add(t);
    }

    public ArrayList<Token> getHijos() {
        return hijos;
    }

    public void setHijos(ArrayList<Token> hijos) {
        this.hijos = hijos;
    }
 
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLexema() {
        return lexema;
    }

    public void setLexema(String lexema) {
        this.lexema = lexema;
    }
    
}

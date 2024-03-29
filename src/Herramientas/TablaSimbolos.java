package Herramientas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TablaSimbolos {

    private static RandomAccessFile archivo;
    private static PalReserv[] Tokens;

    public TablaSimbolos() {
        try {
            File Tabl = new File("src" + File.separator + "Herramientas" + File.separator + "TablaSimbolos.txt");
            if (Tabl.exists()) {
                Tabl.delete();
            }
            LeerTokens();
            archivo = new RandomAccessFile("src" + File.separator + "Herramientas" + File.separator + "TablaSimbolos.txt", "rw");
            archivo.writeChars("LEXEMA\t\t|");
            archivo.writeChars("\t");
            archivo.writeChars("TOKEN");
            archivo.writeChars("\n");

        } catch (FileNotFoundException ex) {
            Logger.getLogger(TablaSimbolos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TablaSimbolos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void LeerTokens() {
        try {
            RandomAccessFile archivo1 = new RandomAccessFile("src" + File.separator + "Herramientas" + File.separator + "Tokens.txt", "r");

            Tokens = new PalReserv[26];
            for (int i = 0; i < Tokens.length; i++) {
                Tokens[i] = new PalReserv();
            }

            String leido = archivo1.readLine();
            char caracter;
            while (leido != null) {
                caracter = leido.charAt(0);
                Tokens[(int) (caracter - 97)].setToken(leido);
                leido = archivo1.readLine();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TablaSimbolos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TablaSimbolos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void Buscar(String lexema) {
        char car = lexema.charAt(0);
        if (Tokens[(int) (car - 97)].Econtrado(lexema)) {
            EscribirToken(lexema);
        } else {
            EscribirIdentificador(lexema);
        }
    }

    public static void EscribirToken(String lexema) {
        try {
            archivo.writeChars(lexema + "\t\t|");
            archivo.writeChars("\t");
            archivo.writeChars("Pal Resv");
            archivo.writeChars("\n");
        } catch (IOException ex) {
            Logger.getLogger(TablaSimbolos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void EscribirIdentificador(String lexema) {
        try {
            archivo.writeChars(lexema + "\t\t|");
            archivo.writeChars("\t");
            archivo.writeChars("Identi");
            archivo.writeChars("\n");
        } catch (IOException ex) {
            Logger.getLogger(TablaSimbolos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void EscribirOperacionesBas(String lexema) {
        try {
            archivo.writeChars(lexema + "\t\t|");
            archivo.writeChars("\t");
            archivo.writeChars("Operador");
            archivo.writeChars("\n");
        } catch (IOException ex) {
            Logger.getLogger(TablaSimbolos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void EscribirSimbolos(String lexema) {
        try {
            archivo.writeChars(lexema + "\t\t|");
            archivo.writeChars("\t");
            archivo.writeChars("Simbolo");
            archivo.writeChars("\n");
        } catch (IOException ex) {
            Logger.getLogger(TablaSimbolos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void EscribirNumeros(String lexema) {
        try {
            archivo.writeChars(lexema + "\t\t|");
            archivo.writeChars("\t");
            archivo.writeChars("Numero");
            archivo.writeChars("\n");
        } catch (IOException ex) {
            Logger.getLogger(TablaSimbolos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void EscribirLogico(String lexema) {
        try {
            archivo.writeChars(lexema + "\t\t|");
            archivo.writeChars("\t");
            archivo.writeChars("Logico");
            archivo.writeChars("\n");
        } catch (IOException ex) {
            Logger.getLogger(TablaSimbolos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

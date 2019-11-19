package Herramientas;

import java.util.ArrayList;

public class PalReserv {

    private ArrayList<String> token;

    public PalReserv() {
        token = new ArrayList<>();
    }

    public void setToken(String token) {
        this.token.add(token);
    }

    public boolean Econtrado(String token) {
        int i = 0;
        boolean encontrado = false;

        while (i < this.token.size() && !encontrado) {
            if (token.equals(this.token.get(i))) {
                encontrado = true;
            }
            i++;
        }
        return encontrado;
    }

}

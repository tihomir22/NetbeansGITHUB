/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema07agenda;

/**
 *
 * @author mati
 */
public class Agenda {

    private int anyo;
    private Pagina[] paginas;
    public Pagina abierta;

    public Agenda(int anyo, Pagina[] paginas, Pagina abierta) {
        this.anyo = anyo;
        this.paginas = paginas;
        this.abierta = abierta;
    }

    Agenda() {

    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public Pagina[] getPaginas() {
        return paginas;
    }

    public void setPaginas(Pagina[] paginas) {
        this.paginas = paginas;
    }

    public Pagina getAbierta() {
        return abierta;
    }

    public void setAbierta(Pagina abierta) {
        this.abierta = abierta;
    }

    Agenda(int anyo) {
        this.anyo = anyo;
        if (anyo % 4 == 0) {
            inicializa(true);
        } else {
            inicializa(false);
        }

    }

    private void inicializa(boolean b) {
        this.paginas = new Pagina[b ? 366 : 365];
        int dia = 0;

        for (int i = 1; i <= 31; i++) {
            paginas[dia++] = new Pagina(i, 1);
        }
        for (int i = 1; i <= (b ? 29 : 28); i++) {
            paginas[dia++] = new Pagina(i, 2);
        }
        for (int i = 1; i <= 31; i++) {
            paginas[dia++] = new Pagina(i, 3);
        }
        for (int i = 1; i <= 30; i++) {
            paginas[dia++] = new Pagina(i, 4);
        }
        for (int i = 1; i <= 31; i++) {
            paginas[dia++] = new Pagina(i, 5);
        }
        for (int i = 1; i <= 30; i++) {
            paginas[dia++] = new Pagina(i, 6);
        }
        for (int i = 1; i <= 31; i++) {
            paginas[dia++] = new Pagina(i, 7);
        }
        for (int i = 1; i <= 31; i++) {
            paginas[dia++] = new Pagina(i, 8);
        }
        for (int i = 1; i <= 30; i++) {
            paginas[dia++] = new Pagina(i, 9);
        }
        for (int i = 1; i <= 31; i++) {
            paginas[dia++] = new Pagina(i, 10);
        }
        for (int i = 1; i <= 30; i++) {
            paginas[dia++] = new Pagina(i, 11);
        }
        for (int i = 1; i <= 31; i++) {
            paginas[dia++] = new Pagina(i, 12);
        }

    }

    public Pagina buscarPagina(int dia, int mes) {
        Pagina busqueda = null, temp;
        int cont = 0;
        boolean encontrado = false;

        while (cont < paginas.length && encontrado == false) {
            temp = paginas[cont++];
            if (temp.getDia() == dia && temp.getMes() == mes) {
                busqueda = temp;
                encontrado = true;

            }

        }
        return busqueda;
    }

    public boolean hayCita(int hora, int min) {
        for (int i = 0; i < this.abierta.getCitas().size(); i++) {
            if (this.abierta.getCitas().get(i).getHora() == hora || this.abierta.getCitas().get(i).getMinutos() == min) {
                System.out.println("Existe cita para esa hora , esta ocupado");
                return false;
                
            }
        }
        return false;
    }

    public boolean comprobarMesDia(int dia, int mes) {
        if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (dia > 0 && dia <= 31)) {
            return true;

        }
        if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia > 0 && dia <= 30)) {
            return true;

        }
        if ((mes == 2) && (dia > 0 && dia <= 28 || dia == 29)) {
            return true;

        }
        return false;
    }

    public boolean comprobarHoraMinutos(int hora, int minutos) {
        if (hora > 0 && hora < 24) {
            if (minutos >= 0 && minutos < 60) {
                return true;
            }
        }
        System.out.println("Formato de hora y minutos incorrecto, introduzcalos otra vez");
        return false;
    }

}

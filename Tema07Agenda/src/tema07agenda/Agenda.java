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
    Agenda (int anyo){
        this.anyo=anyo;
        if(anyo %4 == 0){
            inicializa(true);
        }else inicializa(false);
    
    }
    private void inicializa (boolean b){
        this.paginas=new Pagina[b ? 366 : 365];
        int dia=0;
        for(int i=1;i<=31;i++){
            paginas[dia++]=new Pagina(i,1);
        }
        for(int i=1;i<=(b ? 29:28);i++){
            paginas[dia++]=new Pagina(i,2);
        }
        for(int i=1;i<=31;i++){
            paginas[dia++]=new Pagina(i,3);
        }
        for(int i=1;i<=30;i++){
            paginas[dia++]=new Pagina(i,4);
        }
        for(int i=1;i<=31;i++){
            paginas[dia++]=new Pagina(i,5);
        }
    
    }
}

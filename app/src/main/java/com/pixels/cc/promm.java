package com.pixels.cc;

public class promm {
    private String Materia,Promedio,Primer,Segundo,Tercer,Promet;

    public promm() {
    }
    public promm(String materia,String promedio,String primer,String segundo,String tercer,String promet) {
        this.Materia = materia;
        this.Promedio = promedio;
        this.Primer = primer;
        this.Segundo = segundo;
        this.Tercer = tercer;
        this.Promet = promet;

    }

    public String getMateria() {

        return Materia;
    }

    public void setMateria(String materia) {
        Materia = materia;
    }
    public String getPromedio() {

        return Promedio;
    }

    public void setPromedio(String promedio) {
        Promedio = promedio;
    }
    public String getPrimer() {

        return Primer;
    }

    public void setPrimer(String primer) {
        Primer = primer;
    }
    public String getSegundo() {

        return Segundo;
    }

    public void setSegundo(String segundo) {
        Segundo = segundo;
    }
    public String getTercer() {

        return Tercer;
    }

    public void setTercer(String tercer) {
        Tercer = tercer;
    }
    public String getPromet() {

        return Promet;
    }

    public void setPromet(String promet) {
        Promet = promet;
    }
}

package proiect.pwabd.tariorasspring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Tara {
    @Id
    @GeneratedValue
    private int id;
    private String continent;
    private String nume_tara;
    private int nr_populatie;
    

    public Tara(String continent, String nume_tara, int nr_populatie) {
        super();
        this.continent = continent;
        this.nume_tara = nume_tara;
        this.nr_populatie = nr_populatie;
    }

    public Tara() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getNume_tara() {
        return nume_tara;
    }

    public void setNume_tara(String nume_tara) {
        this.nume_tara = nume_tara;
    }

    public int getNr_populatie() {
        return nr_populatie;
    }

    public void setNr_populatie(int nr_populatie) {
        this.nr_populatie = nr_populatie;
    }

    @Override
    public String toString() {
        return "Tara [id=" + id + ", continent=" + continent + ", nume_tara=" + nume_tara + ", nr_populatie="
                + nr_populatie + "]";
    }

   
}

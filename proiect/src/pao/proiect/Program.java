package pao.proiect;

import java.time.LocalDate;
import java.util.ArrayList;

public class Program {
    private LocalDate dataInceput;
    private LocalDate dataSfarsit;
    private ArrayList<Spectacol>[] program = new ArrayList[8];          //pentru fiecare zi a saptamanii programez niste spectacole

    public Program(LocalDate dataInceput, LocalDate dataSfarsit) {
        this.dataInceput = dataInceput;
        this.dataSfarsit = dataSfarsit;
        for (int i = 1 ; i < 8 ; i++)
        {
            program[i] = new ArrayList<Spectacol>();
        }
    }

    public LocalDate getDataInceput() {
        return dataInceput;
    }

    public LocalDate getDataSfarsit() {
        return dataSfarsit;
    }

    public ArrayList<Spectacol>[] getProgram() {
        return program;
    }

}

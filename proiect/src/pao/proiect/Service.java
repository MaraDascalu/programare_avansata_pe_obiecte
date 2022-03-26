package pao.proiect;

import java.util.ArrayList;
import java.util.HashMap;

public class Service {

    public void adaugaSpectacol(Program p, int ziua, Spectacol spectacol){
        ArrayList<Spectacol>[] program = p.getProgram();
        program[ziua].add(spectacol);
    }

    public void eliminaSpectacol(Program p, String numeSpectacol){
        ArrayList<Spectacol>[] program = p.getProgram();
        for (int i = 1 ; i < 8 ; i++){
            for (int j = 0; j < program[i].size(); j++)
                if (program[i].get(j).getDenumire().equals(numeSpectacol)) {
                    program[i].remove(j);
                    break;
                }
        }
    }

    public void afiseazaProgram(Program p){
        ArrayList<Spectacol>[] program = p.getProgram();
        for (int i = 1; i < 8 ; i++){
            System.out.println("Ziua " + i);
            for (int j = 0; j < program[i].size(); j++){
                System.out.println("    " + program[i].get(j).getDenumire());
            }
        }
    }

    public void afiseazaProgramZi(Program p, int ziua){
        ArrayList<Spectacol>[] program = p.getProgram();
        System.out.println(program[ziua]);
    }

    public String[] saliTeatru(Program p, String teatru){        //afiseaza salile din programul curent care se afla in teatrul dat ca param
        ArrayList<Spectacol>[] program = p.getProgram();
        String[] lista = new String[10];
        int cnt = 0;
        for (int i = 1 ; i < 8; i++)
            for (int j = 0 ; j < program[i].size() ; j++)
                if (program[i].get(j).getLocatie().getTeatru() == teatru)
                    lista[cnt++] = program[i].get(j).getLocatie().getDenumire();
        return lista;
    }

    public int totalPlata(Cos c){
        HashMap<Bilet, Integer> bilete = c.getBilete();
        int total = 0;
        for (Bilet b : bilete.keySet()){
            total += b.getSpectacol().getPret() * bilete.get(b);
        }

        return total;
    }
    public void afiseazaCos(Cos c){
        HashMap<Bilet, Integer> bilete = c.getBilete();
        for (Bilet b : bilete.keySet()){
            System.out.println("specatcol: " + b.getSpectacol().getDenumire() + " cantitate: " + bilete.get(b));
        }
    }

    public void adaugaBilet(Cos c, Bilet bilet, int cantitate){
        HashMap<Bilet, Integer> bilete = c.getBilete();
        Spectacol spectacol = bilet.getSpectacol();
        if (verificaDisponibilitateBilete(spectacol, cantitate) != -1){
            bilete.put(bilet, cantitate);
            int numarBileteVandute = spectacol.getNumarBileteVandute() + cantitate;
            spectacol.setNumarBileteVandute(numarBileteVandute);
        }
        else System.out.println("Numar de bilete indisponibil!");
    }

    public void eliminaBilet(Cos c, int numar){
        HashMap<Bilet, Integer> bilete = c.getBilete();
        for (Bilet b : bilete.keySet()){
            if (b.getId() == numar)
            {
                int numarBilete = b.getSpectacol().getNumarBileteVandute() - bilete.get(b);
                b.getSpectacol().setNumarBileteVandute(numarBilete);
                bilete.remove(b);
                break;
            }
        }
        System.out.println("Numar de bilet invalid!");
    }

    public int verificaDisponibilitateBilete(Spectacol s, int cantitate){
        int numarTotalBilete = s.getLocatie().getCapacitateMaxima();
        int numarBileteVandute = s.getNumarBileteVandute();
        if (numarTotalBilete - numarBileteVandute > cantitate){
            System.out.println("Exista bilete disponibile");
            return numarTotalBilete - numarBileteVandute;
        }
        return -1;
    }
}

package clase;

public class Facade {
    public String verificareAsezareMasa(Masa masa){
        Picolo picolo = new Picolo();
        Ospatar ospatar = new Ospatar();

        if(masa.isEsteLibera()){
            if(picolo.debaraseazaMasa(masa)){
                if(ospatar.esteAranjata(masa)){
                    return "Masa cu numarul " + masa.getNrMasa() + " este libera si aranjata!";
                }else{
                    return "Masa cu numarul " + masa.getNrMasa() + " nu este aranjata!";
                }
            }else{
                return "Masa cu numarul " + masa.getNrMasa() + " trebuie debarasata!";
            }
        }else{
            return "NU exista nicio masa libera si pregatita!";
        }
    }
}

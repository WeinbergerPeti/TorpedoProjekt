package main;

public class Torpedo 
{
    private int hajoHoszz;
    private int palyaHossz;
    private int probakSzamlalo;
    private boolean talalatE;

    public Torpedo(int hajoHoszz, int palyaHossz, int probakSzamlalo, boolean talalatE) 
    {
        this.hajoHoszz = hajoHoszz;
        this.palyaHossz = palyaHossz;
        this.probakSzamlalo = probakSzamlalo;
        this.talalatE = talalatE;
    }

    public Torpedo(int hajoHoszz, int palyaHossz) 
    {
        this(hajoHoszz,palyaHossz,0,false);
    }

    public int getHajoHoszz() {
        return hajoHoszz;
    }

    public int getPalyaHossz() {
        return palyaHossz;
    }

    public int getProbakSzamlalo() {
        return probakSzamlalo;
    }

    public boolean isTalalatE() 
    {
        return talalatE;
    }

    public void setHajoHoszz(int hajoHoszz) {
        this.hajoHoszz = hajoHoszz;
    }

    public void setPalyaHossz(int palyaHossz) {
        this.palyaHossz = palyaHossz;
    }
    
    public String[] palyahossz(){
        String [] palyatomb = {"_", "_", "_", "_", "_", "_", "_"} ;
         for (int i = 0; i < palyatomb.length; i++) {
             System.out.print(palyatomb[i]+" ");
        }
         System.out.println("");
         return palyatomb;
                  
    }
    
    

    public void hajoElhelyez()
    {
        hajoHoszz=3;
        palyaHossz=7;
        String hajoTomb;
        char vonal='_';
        for (int i = 0; i < palyaHossz-hajoHoszz; i++) 
        {
            System.out.println(vonal);
        }
    }
}

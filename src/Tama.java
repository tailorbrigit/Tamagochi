import java.util.Scanner;

public class Tama extends Leny{
    public String nev;
    public int ehseg = -5;
    public Tama(String nev) {
        this.nev = nev;
    }

    @Override
    public void ertelmezo(){
        Scanner sc = new Scanner(System.in);

        String parancs = "";
        while(!parancs.equals("vege")){
        System.out.print(this.nev + "> ");
        parancs = sc.nextLine();
        eheztetes();
        //éheztetés:
       
            
    }
}
    
    private void eheztetes(){

        this.ehseg++;
        if(this.ehseg >0){
            System.out.println("Éhes vagyok!");
        }
    }
}

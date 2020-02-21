import java.util.Scanner;
class Dragon{
    private String name;
    private String species;
    private String habitat;
    private int power;

    public void tambah(String name, String species, String habitat, int power){
        this.name = name;
        this.species = species;
        this.habitat = habitat;
        this.power = power;
    }
    public void detail(){
        System.out.println("This dragon is " + this.name + " from species " + this.species + " his habitat is " + this.habitat + " and his power is " + this.power);
    }
}
/**
 * Dragon
 */
public class DragonWorld {

    public static void main(String[] args) {
        Scanner hehe = new Scanner(System.in);
        Dragon baru[] = new Dragon[100];
        /**Dragon fire = new Dragon();
        fire.tambah("Lava Dragon ", "Fire ", "Cave ", 368);
        fire.detail();

        Dragon water = new Dragon();
        water.tambah("Tsunami Dragon ", "Water ", "Ocean ", 368);
        water.detail();

        Dragon earth = new Dragon();
        earth.tambah("Earth Dragon ", "Rock ","Cave ", 600);
        earth.detail();

        Dragon wind = new Dragon();
        wind.tambah("Crystal Dragon ", "Wind ","Cloud ", 600);
        wind.detail();*/

        for (int i=1; i<=3; i++){
            System.out.print("Insert dragon's name : ");
            String nameDragons = hehe.next();
            System.out.print("Insert dragon's species : ");
            String speciesDragons = hehe.next();
            System.out.print("Insert dragon's habitat : ");
            String habitatDragons = hehe.next();
            System.out.print("Insert dragon's power : ");
            int powerDragons = hehe.nextInt();
            baru[i] = new Dragon();
            baru[i].tambah(nameDragons, speciesDragons, habitatDragons, powerDragons);
        }
        for(int i=1; i<=3; i++){
            baru[i].detail();
        }
    }
}

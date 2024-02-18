import java.util.Scanner;
import java.util.Random;

public class App {

    public static int spelarHälsa = 1000;
    public static int spelarHälsaBase = 1000;
    public static int motståndarHälsaBase = 1000;
    public static int motståndarHälsa = 1000; 
    public static String[]attackNamn = {"Palmstrike","Right hook","Spin kick","Low sweep","Front kick","Body slam","Slap","Uppercut","Quick slap","Heavy hit","Wuxi finger hold","Head rush"};
    public static int []attackSkada = {7, 8,10,4,7,5,4,8,2,8,1,12};
    public static String[]attackNamnAlla = new String[15];
    public static int[]attackSkadaAlla = new int[15];
    public static Random rand = new Random();
    
    public static void main(String[] args) throws Exception {
        String spela = "ja";        
        Scanner tb = new Scanner(System.in);
        while (spela.equalsIgnoreCase("ja")) {
            System.out.println("Du befinner dig på en båt påväg mot sydamerikas regnskogar. Som praktikant arbete ska du studera Dendrobatidae grodan, även känd som pilgiftsgrodan. Efter flera timmar av konstant tom horisont kommer en väldigt smal och ilsken kemist och ställer dig inför ett val.");
            Thread.sleep(15000);
            System.out.println("Det är tufft i skogarna. säger han. Jag kan ge dig en liten boost av styrka med mina hemgjorda steroider eller så kan du få lite kunskap för att verkligen förstå allt som händer i skogen.");
            Thread.sleep(10000);
            int val1=0;
            while (val1==0) {
                System.out.println("Väljer du 1: styrkan, 2: kunskapen eller 3: vill du försöka bli vän med kemisten?");
                
                String inval1=tb.nextLine();
                try {
                    val1 = Integer.parseInt(inval1);
                } catch (Exception e) {
                    System.out.println("Svara i siffror");
                    val1=0;
                }
                if (val1>4 || val1<0) {
                    System.out.println("Svara med de gällande siffrorna: 1, 2 eller 3");
                    val1=0;
            }
        }
            System.out.println("Efter kemisten givit dig det du bett om tar du dig ner till under deck, en konsekvens av att vara uttråkad. Vapenrummet är fullt med, ja vapen i alla former. Dina ögon dras först till ett svärd. Svärdet verkar vara av asiatiskt ursprung och glänser när solen speglas av det. Till vänster om svärdet har någon sattit upp en flintlock pistol på väggen. Den hade varit dödlig om skotten träffade tänker du medans dina ögon seglar mot elefanten i rummet. Kanonen står ståtligt, laddad och redo för att sänka skepp.");
            Thread.sleep(10000);;
            System.out.println("Du bestämmer dig att ta med ett vapen till skogen.");
            int val2=0;
            while (val2==0) {
                System.out.println("Väljer du 1: svärdet, 2: pistolen eller 3: vill du försöka ta med kanonen till skogen?");
                
                String inval2 = tb.nextLine();
                try {
                    val2 = Integer.parseInt(inval2);
                } catch (Exception e) {
                    System.out.println("Svara i siffor");
                    val2=0;
                }
                if (val2>4 || val2<0) {
                    System.out.println("Svara med de gällande siffrorna: 1, 2 eller 3");
                    val2=0;
                }
            }
            System.out.println("Efter du valt ditt vapen svartntar allt för ögonen och du kollapsar. När du väl kan öppna ögenon hänger du över en öppen eld och ska bli uppäten av en kannibal. Du lyckas göra dig fri och nu är det upp till dig att överleva. Lycka till");
            Thread.sleep(7000);
            System.out.println("");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("-------------------------------------");
            System.out.println("-------24 Hour Amazon Survival-------");
            System.out.println("-------------------------------------");
            System.out.println("");
            System.out.println();
            System.out.println();
            System.out.println();
            
            motståndarHälsa = motståndarHälsaBase;
            spelarHälsa = spelarHälsaBase;
            int styrka = 10;
            int kunskap = 3;
            if (val1==1) {
                styrka=styrka +5;
            }
            else if (val1==2){
                kunskap++;
            }
            else if(val1==3){
                styrka=styrka*2;
                kunskap=kunskap*2;
            }
            for(int i=0; i<attackNamn.length; i++){
                attackNamnAlla[i] = attackNamn[i];
                attackSkadaAlla[i] = attackSkada[i];
            }
            if (val2==1) {
                attackNamnAlla[12]= "Swipe";
                attackSkadaAlla[12]=4;
                attackNamnAlla[13]="Poke";
                attackSkadaAlla[13]=3;
                attackNamnAlla[14]="Omnislash";
                attackSkadaAlla[14]=10;
            }
            else if (val2==2){
                attackNamnAlla[12]="Triple shot";
                attackSkadaAlla[12]=6;
                attackNamnAlla[13]="Quick shot";
                attackSkadaAlla[13]=2;
                attackNamnAlla[14]="The collector";
                attackSkadaAlla[14]=7;
            }
            else if (val2==3) {
                attackNamnAlla[12]="Launch";
                attackSkadaAlla[12]=2;
                attackNamnAlla[13]="Canonslap";
                attackSkadaAlla[13]=3;
                attackNamnAlla[14]="Canonshot";
                attackSkadaAlla[14]=12;
            }
            while (true) {
            motståndarHälsa = motståndarHälsa-spelarAttack(styrka, kunskap);
            System.out.println("Motståndarhälsa: "+motståndarHälsa);
            spelarHälsa = spelarHälsa - motståndarAttack();
            System.out.println("Din hälsa: "+spelarHälsa);
            if (spelarHälsa<=0) {
                System.out.println("Du förlorar, hur fan de ska vara tutorial mobs");
                break;
            }
            else if (motståndarHälsa<=0) {
                System.out.println("Du får leva ännu en dag");
                break;
            }
        }
            System.out.println("Vill du spela igen?");
            spela = tb.nextLine();

        }
    }
    static int spelarAttack (int styrka, int kunskap){
        Scanner in = new Scanner(System.in);
        int attackVal = 0;
        
        int[]attackRandom= new int[kunskap];
        for (int i=0; i<kunskap;i++){
            attackRandom[i] =   rand.nextInt(14);
        }
            for(int i=0;i<kunskap;i++){
            System.out.println("Attack "+(i+1)+": "+attackNamnAlla[attackRandom[i]]);
            }
            boolean bryt=false;
            do {
                attackVal = in.nextInt();
                for (int i=0;i<kunskap;i++){
                    if (attackVal==(i+1)) {
                        bryt=true;
                        break;
                    }
                }
                if (bryt==false) {
                    System.out.println("Svara med gällande siffror");
            }
        }while(bryt==false);
            
        int skada = attackSkadaAlla[attackRandom[attackVal-1]];
        System.out.println(skada);
        skada = skada*styrka;
        System.out.println(skada);
       
        
        System.out.println(skada);
        return skada;
        
        }
        static int motståndarAttack (){
            Random rand = new Random();
            int motsåndarSlag = rand.nextInt(8);
            int skadanGjord = attackSkada[motsåndarSlag]*10;
            System.out.println("Motståndaren använder: "+attackNamn[motsåndarSlag]+ " Och skadar dig för "+skadanGjord);
            return skadanGjord;
        }
    }


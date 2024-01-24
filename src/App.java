import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String spela = "ja";
        Scanner tb = new Scanner(System.in);
        while (spela.equalsIgnoreCase("ja")) {
            System.out.println("Du befinner dig på en båt påväg mot sydamerikas regnskogar. Som praktikant arbete ska du studera Dendrobatidae grodan, även känd som pilgiftsgrodan. Efter flera timmar av konstant tom horisont kommer en väldigt smal och ilsken kemist och ställer dig inför ett val.");
            //Thread.sleep(15000);
            System.out.println("Det är tufft i skogarna. säger han. Jag kan ge dig en liten boost av styrka med mina hemgjorda steroider eller så kan du få lite kunskap för att verkligen förstå allt som händer i skogen.");
            int val1=0;
            while (val1!=1 || val1!=2 || val1!=3) {
                System.out.println("Väljer du 1: styrkan, 2: kunskapen eller 3: vill du försöka bli vän med kemisten?");
                System.out.println("Svara i siffror");
                val1=tb.nextInt();
                if (val1==1) {
                    break;
                }
                else if (val1==2){
                    break;
                }
                else if (val1==3){}
                break;
            }
            System.out.println("Efter kemisten givit dig det du bett om tar du dig ner till under deck, en konsekvens av att vara uttråkad. Vapenrummet är fullt med, ja vapen i alla former. Dina ögon dras först till ett svärd. Svärdet verkar vara av asiatiskt ursprung och glänser när solen speglas av det. Till vänster om svärdet har någon sattit upp en flintlock pistol på väggen. Den hade varit dödlig om skotten träffade tänker du medans dina ögon seglar mot elefanten i rummet. Kanonen står ståtligt, laddad och redo för att sänka skepp.");
            System.out.println("Du bestämmer dig att ta med ett vapen till skogen.");
            int val2=0;
            while (val2!=1 || val2!=2 || val2!=3) {
                System.out.println("Väljer du 1: svärdet, 2: pistolen eller 3: vill du försöka ta med kanonen till skogen?");
                System.out.println("Svara i siffror");
                val2=tb.nextInt();
                if (val2==1) {
                    break;
                }
                else if (val2==2){
                    break;
                }
                else if (val2==3){}
                break;
            }
            System.out.println("Efter du valt ditt vapen svartntar allt för ögonen och du kollapsar. När du väl kan öppna ögenon hänger du över en öppen eld och ska bli uppäten av en kannibal. Du lyckas göra dig fri och nu är det upp till dig att överleva. Lycka till");
            System.out.println("");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("---------------------------------");
            System.out.println("-----24 Hour Amazon Survival-----");
            System.out.println("---------------------------------");
            System.out.println("");
            System.out.println();
            System.out.println();
            System.out.println();

            int strength = 10;
            int intelligence = 3;
            if (val1==1) {
                strength=strength +5;
            }
            else if (val1==2){
                intelligence++;
            }
            else if(val1==3){
                strength=strength*2;
                intelligence=intelligence*2;
            }
            String[]attackNamn = {"Palmstrike","Right hook","Spin kick","Low sweep","Front kick"};
            int []attackSkada = {7, 8,10,4,7};
            

            
            spela="false";
        }
    }
}

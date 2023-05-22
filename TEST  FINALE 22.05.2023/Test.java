import java.util.Scanner;

public class Test {
        // CREO IL PRIMO ARRAY DOMANDE
        private static String[] domande = {
            "Cos'è Java quali sono le sue caratteristiche",
            "Cosa sono le condizioni e quali conosciamo",
            "Cosa sono i cicli e quali conosciamo",
            "Cosa sono i metodi e cosa sono le classi e gli oggetti e cosa hanno in comune questi due elementi",
            "Cosa sono le tre regole fondamentali quali sono e qual'è la quarta"
        };
        // CREO UN SECONDO ARRAY RISPOSTE
        private static String[] risposte = {
            "Java è un linguaggio di programmazione ad alto livello, orientato agli ogetti. Java è noto per la sua sicurezza e facilità di utilizzo. Java è usato nella maggior parte dello sviluppo di applicazioni desktop, mobile, web e molto altro ancora. Tra le principali caratteristiche possiamo riconoscere che è orientato agli oggetti, cioè segue il paradigma della OOP, consentendo al programmatore di creare classi e oggetti che interagiscono tra loro per modellare il problema da risolvere. Possiamo riassumere che per orientato agli oggetti sta a significare che in Java tutto è un oggetto, ad eccezione dei tipi primitivi di dati. Per OOP intendiamo l'incapsulamento, ereditarietà, polimorfismo e astrazione.",
            "In Java le condizioni sono costrutti che consentono di eseguire determinati blocchi di codice in base al verificarsi una determinata condizione. Le condizioni sono fondamentali per fontrollere il flusso di esecuzione del programma e prendere decisioni basate su valori o stati specifici. Tra le principali condizioni che conosciamo troviamo: L'istruzione if, che permette di eseguire un blocco di codice solo se una condizione specificata è vera. Lo switch che consente di selezionare uno dei diversi blocchi di codice da eseguire, ed è spesso utilizzato quando si ha una serie di condizioni diverse da gestire ad esempio un menu.",
            "I cicli sono costrutti che consentono di ripetere l'esecuzione di un blocco di codice per un certo numero di volte, o fino al verificarsi di una determinata condizione. I cicli sono utilizzati per automatizzare l'esecuzione di operazioni ripetitive e per controllare il flusso di un programma. Tra i vari cicli troviamo il ciclo for, che è composto da tre parti: inizializzazione, condizione e incremento. Poi troviamo il ciclo while il quale viene utilizzato per eseguire un blocco di codice finquando una determinata condizione sia vera, e la condizione viene valutata all'inizio di ogni iterazione. E infine troviamo il Do-while, simile al while, ma la condizione viene valutata alla fine di ogni iterazione. Ciò garantisce che il blocco di codice venga eseguito almeno una volta anche se la condizione è falsa. ",
            "In Java i metodi, le classi e gli oggetti sono concetti fondamentali della programmazione orientata agli oggetti. I metodi sono una sequenza di istruzioni che forniscono la logida di esecuzione e le funzionalità specifiche per un oggetto o per una classe. Ogni metodo ha un nome univoco e può accettare dei parametri e restituire un valore. Essi vengono definiti all'interno di una classe. I metodi sono utili per organizzare il codice e permette quindi una riutilizzabilità. Una classe è una struttura che definisce un nuovo tipo di dato. Essa rappresentà un'entità concettuale o un oggetto del mondo reale e definisce le proprietà e i comportamenti che tale oggetto può avere. Le classi sono i blocchi di costruzione fondamentali di un programma Java e vengono utilizzate per creare oggetti. Un oggetto è un istanza di una classe. Significa che quando viene creata un'istanza di una classe si ottiene un oggetto reale che può essere utilizzato nel programma. ",
            "Le regole fondamentali in java sono 4: Incapsulamento, ereditarietà, polimorfismo e astrazione. Per Incapsulamento intendiamo il concetto di raggruppare dati(attributi) e le operazioni(metodi) che operano su tali dati in una singola entità chiamata classe. L'obbiettivo dell'incapsulamento è nascondere l'implementazione interna degli oggetti e fornire un'interfaccia chiara e stabile per interagire con essi. L'ereditarietà permette di creare nuove classi che acquisiscono le proprietò e i comportamenti di una classe esistente. Essa favorisce la creazione di una gerarchia di classi, consentendo di utilizzare il codice esistente, estenderlo e specializzarlo. Il polimorfismo è la capacità di un oggetto di apparire sotto diverse forme, cioè gli oggetti di diverse classi possono essere trattati come istanze di una classe genitore comune. Infine l'astrazione è il processo di identificazione e definizione di contetti essenziali e rilevanti per il dominio del problema. Nella OOP l'astrazione viene realizzata tramite le classi, che astraggono le caratteristiche essenziali di un oggetto. Le classi definiscono lo stato e il comportamento di un oggetto, creando un modello atratto per rappresentare entità del mondo reale. "
        };
    
        public static void main(String[] args) {

            boolean flag = false;
            Scanner sc = new Scanner(System.in);
    
            while (!flag) {
                System.out.println("---------------------");
                System.out.println("         MENU        ");
                System.out.println("                 ");
                System.out.println("1. Visualizza domande");
                System.out.println("2. Visualizza risposte");
                System.out.println("3. Modifica risposte");
                System.out.println("4. Esci");
                System.out.println("---------------------");
    
                System.out.print("Seleziona un'opzione: ");
                int scelta = sc.nextInt();
                
                switch (scelta) {
                    case 1:
                        visualizzaDomande();
                        break;
                    case 2:
                        visualizzaRisposte();
                        break;

                    case 3:
                        modificaRisposte(sc);
                        break;

                    case 4:
                        flag = true;
                        break;

                    default:
                        break;
                }
            }
            System.out.println("Sei uscito dal programma... Arrivederci !");
            sc.close();
        }

        //Tramite un ciclo for che scorre l'array DOMANDE, mando a schermo le domande
        private static void visualizzaDomande() {
            System.out.println("Domande assegnate:");
            for (int i = 0; i < domande.length; i++) {
                System.out.println((i + 1) + ". "  + domande[i] + "\n" );
            }
            System.out.println();
        }
        //Tramite un ciclo for che scorre l'array RISPOSTE, mando a schermo le risposte
        private static void visualizzaRisposte(){
            System.out.println("Risposte: \n");
            for (int x = 0; x < risposte.length; x++){
                System.out.println((x + 1) + ". " + risposte[x]  + "\n" );
            }
            System.out.println();
        }

        
        private static void modificaRisposte(Scanner sc) {
            System.out.println("-----------------------------------------------");

            for(int x = 0 ; x < risposte.length; x++){
                System.out.println("Seleziona la risposta da modificare: ");

                int seleziona = sc.nextInt();
                String inserisci = sc.nextLine();

                if (seleziona == 1){
                    System.out.println(risposte[0] + "\n");
                    System.out.println("Inserisci la nuova risposta: ");
                    inserisci = risposte[0] = sc.nextLine();
                    System.out.println("Correzione avvenuta con successo !  \n" + "\n");
                    break;

                } else if(seleziona == 2){
                    System.out.println(risposte[1] + "\n");
                    System.out.println("Inserisci la nuova risposta: ");
                    inserisci = risposte[1] = sc.nextLine();
                    System.out.println("Correzione avvenuta con successo !  \n" + "\n");
                    break;

                }  else if(seleziona == 3){
                    System.out.println(risposte[2] + "\n");
                    System.out.println("Inserisci la nuova risposta: ");
                    inserisci = risposte[2] = sc.nextLine();
                    System.out.println("Correzione avvenuta con successo !  \n" + "\n");
                    break;

                }else if(seleziona == 4){
                    System.out.println(risposte[3] + "\n");
                    System.out.println("Inserisci la nuova risposta: ");
                    inserisci = risposte[3] = sc.nextLine();
                    System.out.println("Correzione avvenuta con successo !  \n" + "\n");
                    break;

                }else if(seleziona == 5){
                    System.out.println(risposte[4] + "\n");
                    System.out.println("Inserisci la nuova risposta: ");
                    inserisci = risposte[4] = sc.nextLine();
                    System.out.println("Correzione avvenuta con successo !  \n" + "\n");
                    break;
                }
            }
            
        }
           
}
    

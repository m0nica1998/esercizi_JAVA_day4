package main;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
	
// nel main chiedere in input 4 stringhe per nome, cognome, per la data di nascita e  comune di residenza, 1 int e numero di matricola 
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Inserisci il nome");
	String nome = scan.next();
	
	System.out.println("Inserisci il cognome");
	String cognome = scan.next();
	
	System.out.println("Inserisci la data di nascita");
	String data = scan.next();
	
	System.out.println("Inserisci il comune di residenza");
	scan.nextLine();
	String comune = scan.next();
	scan.nextLine();
	System.out.println("Inserisci la matricola");
	int mat = scan.nextInt();
	//usare il metodo concat( ) per stampare un messaggio come il seguente: “Gentile [nome] [cognome], nato il [data di nascita gg/mm/aaaa], residente a [comune], matricola n. [n matricola], siamo lieti di comunicarle la sua partecipazione al corso.”
	System.out.println("Gentile " + nome.toUpperCase().concat(" "+cognome.toLowerCase()) + "nato il " + data + "residente a " + comune + " con matricola n " + mat + " siamo lieti di comunicarla la partecipazione al corso.");
	
	//utilizzate almeno una volta ognuno dei seguenti metodi: 
	//concat(), toUpperCase(), toLoweCase() e l’operatore +
	scan.nextLine();
	//chiedere un’email in input 
	System.out.println("Inserisci una mail ");
	String email = scan.next();
	
	//effettuare un controllo sull’email con i seguenti criteri 
	//deve contenere una @ • deve contenere un . 
	if(!(email.contains("@") && email.contains(".")) ) {
		//se l’utente inserisce un’email che non rispetta i criteri va stampato un messaggio di avviso 
		System.out.println("L'email non è valida");
	}
	
	//altrimenti va stampata l’email, in lower case, togliendo eventuali spazi all’inizio   e alla fine
	else {
		System.out.println(email.toLowerCase().replace(" ",""));
	}
	//chiedere una stringa in input, verificare che contenga almeno una vocale 
	System.out.println("Inserisci una stringa");
	String str = scan.next();
	if(str.contains("a")) {
		System.out.println("la stringa contiene almeno una vocale");
	} else if(str.contains("e")) {
		System.out.println("la stringa contiene almeno una vocale");
	} else if(str.contains("i")) {
		System.out.println("la stringa contiene almeno una vocale");
	} else if(str.contains("o")) {
		System.out.println("la stringa contiene almeno una vocale");
	} else if(str.contains("u")) {
		System.out.println("la stringa contiene almeno una vocale");
	} else {
		System.out.println("la stringa non contiene vocali");
	}
	//chiedere una stringa in input, verificare che sia lunga almeno 8 caratteri 
	
	System.out.println("inserisci una stringa");
	String str1 = scan.next();
	if(str1.length() >= 8) {
		System.out.println("lq stringa contiene almeno otto caratteri");
	}
	//chiedere una stringa in input, verificare che il primo carattere sia una lettera maiuscola 
	System.out.println("inserisci una stringa");
	String str2 = scan.next();
    
	if(str2.startsWith(String.valueOf(str2.charAt(0)).toUpperCase()));
	 
	//chiedere 3 stringhe in input per dei nomi di città, i nomi vanno stampati rimpiazzando il primo carattere con lo stesso ma in maiuscolo
	System.out.println("inserisci una stringa per un nome di città");
	String str3 = scan.next();
	System.out.println("inserisci una stringa per un secondo nome di città");
	String str4 = scan.next();
	System.out.println("inserisci una stringa per un terzo nome di città");
	String str5 = scan.next();
	
	System.out.println(String.valueOf(str3.charAt(0)).toUpperCase() + str3.substring(1).toLowerCase());
	System.out.println(String.valueOf(str4.charAt(0)).toUpperCase() + str4.substring(1).toLowerCase());
	System.out.println(String.valueOf(str5.charAt(0)).toUpperCase() + str5.substring(1).toLowerCase());
	}
}

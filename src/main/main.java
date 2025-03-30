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
	
	System.out.println("Inserisci la matricola");
	int mat = scan.nextInt();
	//usare il metodo concat( ) per stampare un messaggio come il seguente: “Gentile [nome] [cognome], nato il [data di nascita gg/mm/aaaa], residente a [comune], matricola n. [n matricola], siamo lieti di comunicarle la sua partecipazione al corso.”
	System.out.println("Gentile " + nome.toUpperCase().concat(" "+cognome.toLowerCase()) + "nato il " + data + "residente a " + comune + " con matricola n " + mat + " siamo lieti di comunicarla la partecipazione al corso.");
	
	//utilizzate almeno una volta ognuno dei seguenti metodi: 
	//concat(), toUpperCase(), toLoweCase() e l’operatore +
	}
}

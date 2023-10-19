package fr.conditionwhile;
    import java.util.Scanner;
public class App {
    
    public static void main(String[] args) {
    Scanner clavier = new Scanner(System.in);
    int salaireHeures = 15;
    System.out.println("Afficher le nombre d'heures travaillées");
    int nbrheurestrav = clavier.nextInt();
    while( nbrheurestrav>42){
      System.out.println("Afficher le nombre d'heures travaillées");
      nbrheurestrav= clavier.nextInt();
    }
    int salaire = nbrheurestrav* salaireHeures;
    System.out.println("votre salaire est :"+salaire); 
    
    }
    
}

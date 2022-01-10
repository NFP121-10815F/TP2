package question1;
 
/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class FahrenheitCelsius {

    /**
     * le point d'entrée de cette application, dont le commentaire est à
     * compléter
     * 
     * @param args
     *            ...
     */
    public static void main(String[] args) {
        // pour tous les paramètres de la ligne de commande
        int fahrenheit = 0;
        float celsius = 0;
       
        for (int i=0; i<args.length;i++){
         
          System.out.println(args[i].toString() + "\u00B0F -> " + fahrenheitEnCelsius(Integer. parseInt(args[i])) + "\u00B0C");  
        }
                                            
                                                                                
    }

    /**
     * la méthode à compléter.
     * 
     * @param f
     *            la valeur en degré Fahrenheit
     * @return la conversion en degré Celsius
     */
    public static float fahrenheitEnCelsius(int f) {
         
        float celsius = ((f-32)* 5/9); 
        return celsius;  
    }

}

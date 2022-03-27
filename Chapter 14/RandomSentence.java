// Application randomly generates sentences.
import java.util.Random;

public class RandomSentence{
    public static void main( String args[]){
		Random generator = new Random();

		String article[] = { "the ", "a ", "one ", "some ", "any " };
		String noun[] = {"boy","girl","dog","town","car"};
		String verb[] = {"ran","jumped","walked","skiped"};
		String preposition[] = {"to","from","over","under","on"};


     
    for ( int j = 0; j < 20; j++ ){
        int article1 = generator.nextInt( article.length );
        int noun1 = generator.nextInt( article.length );
        int verb1 = generator.nextInt( article.length );
        int preposition1 = generator.nextInt(article.length);
        int article2 = generator.nextInt(article.length);
        int noun2 = generator.nextInt(article.length);
          
        StringBuilder buffer = new StringBuilder();

         
            buffer.append(article[article1]).append(noun[noun1]).append
                    (verb[verb1]).append(preposition[preposition1]).append
                    (article[article2]).append(noun[noun2]).append( ".\n");

         
        buffer.setCharAt(0, Character.toUpperCase( buffer.charAt( 0 ) ) );
        System.out.println( buffer.toString() );
        } 
   } 
}  
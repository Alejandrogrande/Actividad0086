import java.util.Random;
import java.util.ArrayList;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    private Random aleatorio;
    private ArrayList<String> respuestas;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        respuestas = new ArrayList<>();
        respuestas.add("Te equivocas");
        respuestas.add("Es justo alreves!");
        respuestas.add("Eso es...");
        respuestas.add("Claro...");
        respuestas.add("Justo eso!");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        Random aleatorio= new Random();
        int nuevaRespuesta = aleatorio.nextInt(respuestas.size());
        return(respuestas.get(nuevaRespuesta));
    }
}

package Aro;

/**
 * Probas de refactorización en NetBeans coa clase Aro
 * @author A21BraisFD
 */
public class Aro {

    /**
     *Constante que delimita o valor mínimo para o radio
     */
    public static final double LIMITERADIO = 0.0;

    private int coordenadaX;
    private int coordenadaY;
    private double radio;
    
    /**
     * Constructor sen parámetros da clase Aro
     */
    public Aro() {
    }

    /**
     * Constructor parametrizado da clase Aro
     * @param valorX
     * @param valorY
     * @param valorRadio
     */
    public Aro(int valorX, int valorY, double valorRadio) {
        coordenadaX = valorX;
        coordenadaY = valorY;
        setRadio(valorRadio);
    }
    
    
    /**
     * @return o valor da coordenadaX
     */
    public int getCoordenadaX() {
        return coordenadaX;
    }

    /**
     * @param coordenadaX para setear a coordenadaX
     */
    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    /**
     * @return o valor da coordenadaY
     */
    public int getCoordenadaY() {
        return coordenadaY;
    }

    /**
     * @param coordenadaY para setear a coordenadaY
     */
    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    /**
     * @return o valor do radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio para setear o radio
     */
    public void setRadio(double radio) {
        this.radio = radio < LIMITERADIO ? LIMITERADIO : radio;
    }

    /**
     * Método para obter o diámetro
     * @return un double que indica a medida do diámetro 
     */
    public double obterDiametro() {
        return getRadio() * 2;
    }

    /**
     * Método para obter o perímetro
     * @return un double co valor do perímetro
     */
    public double obterCircunferencia() {
        return Math.PI * obterDiametro();
    }

    /**
     * Método para obter a área
     * @return
     */
    public double obterSuperficie() {
        return Math.PI * getRadio() * getRadio();
    }

    @Override
    public String toString() {
        return "Centro = [" + getCoordenadaX() + "," + getCoordenadaY() + "]; Radio = " + getRadio();
    }

    /**
     * Método para engadir ás coordenadas X e Y o valor dos seguintes parámetros
     * @param trasladarX
     * @param trasladarY
     */
    public void trasladarCentro(int trasladarX, int trasladarY){
        this.setCoordenadaX(this.getCoordenadaX() + trasladarX);
        this.setCoordenadaY(this.getCoordenadaY() + trasladarY);
    }
}
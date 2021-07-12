public class CalcularInversion {
    private Integer tiempo;
    private Double capital;
    private Double interes;
    
    public CalcularInversion() {
        setTiempo(0);
        setCapital(0.0);
        setInteres(0.0);
    }
    
    public CalcularInversion(Integer tiempo, Double capital, Double interes) {
        setTiempo(tiempo);
        setCapital(capital);
        setInteres(interes);
    }
    
    public Double calcularInteresSimple() {
        Double cal = capital * (interes / 100.0) * tiempo;
        return Double.valueOf(Math.round(cal));
    }
    
    public Double calcularInteresCompuesto() {
        Double cal = capital * (Math.pow(1.0 + (interes / 100.0), tiempo) - 1);
        return Double.valueOf(Math.round(cal));
    }
    
    public Double compararInversion(Integer tiempo, Integer capital, Integer interes) {
        setTiempo(tiempo);
        setCapital(Double.valueOf(capital));
        setInteres(Double.valueOf(interes));
        Double cal = calcularInteresCompuesto() - calcularInteresSimple();
        return Double.valueOf(Math.round(cal));
    }
    
    public Double compararInversion() {
        Double cal = calcularInteresCompuesto() - calcularInteresSimple();
        return Double.valueOf(Math.round(cal));
    }
    
    private void setTiempo(Integer tiempo) {
        this.tiempo = tiempo;
    }
    
    private void setCapital(Double capital) {
        this.capital = capital;
    }
    
    private void setInteres(Double interes) {
        this.interes = interes;
    }
}
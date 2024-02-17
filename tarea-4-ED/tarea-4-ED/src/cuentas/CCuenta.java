package cuentas;

public class CCuenta {

/**
 * Clase que representa una cuenta bancaria.
 * @author Alba GPV
 * 
 */
    public String getNombre() {
        return nombre;
    }

    /**
     * modifica el nombre del titular de la cuenta
     * @param nombre
     */
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

	/**
	 * obtiene el numero de cuenta
	 * @return
	 */
    
    public String getCuenta() {
        return cuenta;
    }

	/**
	 * modifica el numero de cuenta
	 * @return
	 */	
    
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

	/**
	 * obtiene el saldo de la cuenta
	 * @return
	 */
    
    public double getSaldo() {
        return saldo;
    }

	/**
	 * modifica el numero de cuenta
	 * @return
	 */
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

	/**
	 * obtiene el tipo de interes
	 * @return
	 */
    
    
    public double getTipoInterés() {
        return tipoInterés;
    }

	/**
	 * modifica el tipo de interes
	 * @return
	 */
    
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    
     /**
     * Constructor por defecto.
     */

    public CCuenta()
    {
    }

    /**
     * Constructor con todos los valores
     * @param nom
     * @param cue
     * @param sal
     * @param tipo
     */
    
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    /**
     * obtiene el saldo de la cuenta
     * @return
     */
    
    
    
    public double estado()
    {
        return getSaldo();
    }
    /**
     * ingresa cantidad a la cuenta.
     * @param cantidad debe de ser un numero positivo.
     * @throws Exception, un caso de un numero en negativo.
     */
    
    
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

     /**
     * retira cantidad de la cuenta
     * @param cantidad debe de ser un numero positivo.
     * @throws Exception, un caso de un numero en negativo.
     */   
    
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}


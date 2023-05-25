
package Enumeracion;

/**
 *
 * @author JOSE
 */
public enum Continentes {
    Africa(53), 
    Europa(46),
    Asia(44), 
    America(34), 
    Oceania(14);
    
    private final int Paises;
    
    Continentes(int paises){
        this.Paises = paises;
                
    }
    public int getPaises(){
        return this.Paises;
    }
    
}

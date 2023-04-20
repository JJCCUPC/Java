
package muchos.a.muchos;

public class Relacion_A_Muchos {

    public static void main(String[] args) {
        Usuario u1=new Usuario("Sheol",6969);
        Usuario u2=new Usuario("Samael",3939);
        
        Software s1=new Software("Windows", 450);
        Software s2=new Software("Linux",310);
        
        u1.accesoSoftware(s2);
        u2.accesoSoftware(s1);
    }
    
}

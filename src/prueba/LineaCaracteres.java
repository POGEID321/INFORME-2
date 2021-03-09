/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba.pkg2;

/**
 *
 * @author User
 */
public class LineaCaracteres {
     public String Reemplazar(String pantalla)
    {
        LineaCaracteres letra = new LineaCaracteres();
        String cadenafinal="";
        char [] cadena = new char [pantalla.length()];
        for(int i=0;i<pantalla.length();i++)
        {
            cadena[i] = pantalla.charAt(i);
        }
        for(int i=0;i<cadena.length;i++)
        {
            if(cadena[i]=='a'||cadena[i]=='e'||cadena[i]=='i'||cadena[i]=='o'||cadena[i]=='u'||cadena[i]=='A'||cadena[i]=='E'||cadena[i]=='I'||cadena[i]=='O'||cadena[i]=='U')
            {
                cadena[i]= letra.Busqueda(pantalla);
            }
        }
        for(int i=0;i<cadena.length;i++)
        {
            cadenafinal = cadenafinal + cadena[i];
        }
        return cadenafinal;
    }
    
    public char Busqueda(String pantalla)
    {
        char [] cadena = new char [pantalla.length()];
        for(int i=0;i<pantalla.length();i++)
        {
            cadena[i] = pantalla.charAt(i);
        }
        int [] contador = new int[cadena.length];
        char letra = 0;
        for(int i=0;i<cadena.length;i++)
        {
            for(int j=0;j<cadena.length;j++)
            {
                if( cadena[i]==cadena[j] && i!=j )
                {
                    contador[i]++;
                    letra = cadena[i];
                }
            }
        }
        return letra;
    }
    
}

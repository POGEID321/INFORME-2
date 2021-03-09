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
public class CalculosEstadisticos {
     public String orden(String pantalla)
    {
        String Ordenado="";
        int temporal;
        String [] parts = pantalla.split("\\,");
        int [] numeros = new int [parts.length];
        for(int i=0;i<parts.length;i++)
        {
            numeros[i] = Integer.parseInt(parts[i]);
        }
        for(int i=0;i<numeros.length;i++)
        {
            for(int j=0;j<numeros.length;j++)
            {
                if((j+1)<numeros.length)
                {
                    if(numeros[j]>numeros[j+1])
                    {
                        temporal=numeros[j];
                        numeros[j]=numeros[j+1];
                        numeros[j+1]=temporal;
                    }
                }
            }
        }
        for(int i=0;i<numeros.length;i++)
        {
            if(i==(numeros.length-1))
            {
                Ordenado=Ordenado+String.valueOf(numeros[i]);
            }
            else
            {
                Ordenado=Ordenado+String.valueOf(numeros[i])+",";
            }
        }
        
        return Ordenado;
    }
    public String Media(String pantalla)
    {
        double sumatoria=0;
        
        String [] parts = pantalla.split("\\,");
        for(int i=0;i<parts.length;i++)
        {
            sumatoria += Integer.parseInt(parts[i]);
        }
               
        return String.valueOf(sumatoria/parts.length);
    }
    public String Varianza(String pantalla)
    {
        CalculosEstadisticos calculos = new CalculosEstadisticos();
        
        double sumatoria=0;
        
        String [] parts = pantalla.split("\\,");
        
        for(int i=0;i<parts.length;i++)
        {
            sumatoria += Math.pow((Integer.parseInt(parts[i])-Double.parseDouble(calculos.Media(pantalla))),2);
        }
        
        return String.valueOf(sumatoria/parts.length);
    }
    public String DesviacionEstandar(String pantalla)
    {
        CalculosEstadisticos calculos = new CalculosEstadisticos();
        String Desviacion;
        
        Desviacion = String.valueOf(Math.sqrt(Double.parseDouble(calculos.Varianza(pantalla))));
        
        return Desviacion;
    }
}

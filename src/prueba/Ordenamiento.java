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
public class Ordenamiento {
    public String Burbuja(String pantalla)
    {
        Ordenamiento orden= new Ordenamiento();
        String ArregloOrdenado="";
        double temporal;
        String [] parts = pantalla.split("\\,");
        double [] numero = new double [parts.length];
        for(int i=0;i<parts.length;i++)
        {
            numero[i] = Double.parseDouble(parts[i]);
        }
        for(int i=0;i<numero.length;i++)
        {
            for(int j=0;j<numero.length;j++)
            {
                if((j+1)<numero.length)
                {
                    if(numero[j]>numero[j+1])
                    {
                        temporal=numero[j];
                        numero[j]=numero[j+1];
                        numero[j+1]=temporal;
                    }
                }
            }
        }
        ArregloOrdenado = orden.Conversion(numero);
        return ArregloOrdenado;
    }
    
    public String Insercion(String pantalla)
    {
        Ordenamiento orden= new Ordenamiento();
        
        String ArregloOrdenado;
        String [] parts = pantalla.split("\\,");
        double [] numero = new double [parts.length];
        
        for(int i=0;i<parts.length;i++)
        {
            numero[i] = Double.parseDouble(parts[i]);
        }
        
        for(int i=1;i<numero.length;i++)
        {
            int contadorComparacion=i;
            double numeroEvaluado = numero[i];
            while(numero[contadorComparacion-1] > numeroEvaluado && contadorComparacion > 0)
            {
                numero[contadorComparacion] = numero[contadorComparacion-1];
                contadorComparacion--;
                if(contadorComparacion==0)
                {
                    break;
                }
            }
            numero[contadorComparacion]=numeroEvaluado;
        }
        ArregloOrdenado = orden.Conversion(numero);
        return ArregloOrdenado;
    }
    
    public String Seleccion(String pantalla)
    {
        Ordenamiento orden= new Ordenamiento();
        String ArregloOrdenado;
        String [] parts = pantalla.split("\\,");
        double [] numero = new double [parts.length];
        
        for(int i=0;i<parts.length;i++)
        {
            numero[i] = Double.parseDouble(parts[i]);
        }
        
        for(int i=0;i<numero.length;i++)
        {
            int minimo=i;
            for(int j=i;j<numero.length;j++)
            {
                if(numero[j]<numero[minimo])
                {
                    minimo=j;
                }
            }
            double temporal=numero[i];
            numero[i]=numero[minimo];
            numero[minimo]=temporal;
        }
        ArregloOrdenado = orden.Conversion(numero);
        return ArregloOrdenado;
    }
    public String OrganizarMerge(String pantalla)
    {
        Ordenamiento orden= new Ordenamiento();
        String [] parts = pantalla.split("\\,");
        double [] numero = new double [parts.length];
        double [] ordenado = new double [numero.length];
        String ArregloFinal="";
        for(int i=0;i<parts.length;i++)
        {
            numero[i] = Double.parseDouble(parts[i]);
        }
        ordenado = orden.MergeSort(numero, 0, numero.length-1);
        for(int i=0;i<parts.length;i++)
        {
            if(i==numero.length-1)
            {
                ArregloFinal = ArregloFinal + String.valueOf(ordenado[i]);
            }
            else
            {
                ArregloFinal = ArregloFinal + String.valueOf(ordenado[i])+",";
            }
        }
        return ArregloFinal;
    }
    public double[] MergeSort(double numero[],int primero,int ultimo)
    {
        Ordenamiento orden= new Ordenamiento();
        int medio;
        if(primero<ultimo)
        {
            medio=(primero+ultimo)/2;
            orden.MergeSort(numero, primero, medio);
            orden.MergeSort(numero,medio+1,ultimo);
            Mezclar(numero,primero,medio,ultimo);
        }
        return numero;
    }
    public double[] Mezclar (double numero[],int izquierda,int medio,int derecha)
    {
        int n1 = medio - izquierda + 1; 
        int n2 = derecha - medio; 
        
        double izq[] = new double [n1]; 
        double der[] = new double [n2]; 
  
        for (int i=0; i<n1; ++i) 
            izq[i] = numero[izquierda + i]; 
        for (int j=0; j<n2; ++j) 
            der[j] = numero[medio + 1+ j]; 
  
        int i = 0, j = 0; 
        int k = izquierda; 
        
        while (i < n1 && j < n2) 
        { 
            if (izq[i] <= der[j]) 
            { 
                numero[k] = izq[i]; 
                i++; 
            } 
            else
            { 
                numero[k] = der[j]; 
                j++; 
            } 
            k++; 
        }
        while (i < n1) 
        { 
            numero[k] = izq[i]; 
            i++; 
            k++; 
        }
        while (j < n2) 
        { 
            numero[k] = der[j]; 
            j++; 
            k++; 
        }
        return numero;
    }
    public String Conversion(double[] numero)
    {
        String conversion="";
        for(int i=0; i<numero.length;i++){
            if(i==numero.length-1)
            {
                conversion=conversion+String.valueOf(numero[i]);
            }
            else
            {
                conversion=conversion+String.valueOf(numero[i])+",";
            }
        }
        return conversion;
    }
}

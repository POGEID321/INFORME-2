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
public class OrdenPersonas {
    public String[][] MetodoBurbujaEdad(String matriz[][],int tamaño)
    {
        String temporal1,temporal2,temporal3;
        for(int i=0;i<tamaño;i++)
        {
           for(int j=0;j<tamaño;j++)
           {
               if((j+1)<tamaño)
               {
                   if(Integer.parseInt(matriz[j][1])>Integer.parseInt(matriz[j+1][1]))
                   {
                        temporal1=matriz[j][2];
                        temporal2=matriz[j][0];
                        temporal3=matriz[j][1];
                        matriz[j][2]=matriz[j+1][2];
                        matriz[j][0]=matriz[j+1][0];
                        matriz[j][1]=matriz[j+1][1];
                        matriz[j+1][2]=temporal1;
                        matriz[j+1][0]=temporal2;
                        matriz[j+1][1]=temporal3;
                   }
               }
            }
        }
        return matriz;
    }
    public String [][] MetodoBurbujaCedula(String matriz[][],int tamaño)
    {
        String temporal1,temporal2,temporal3;
        for(int i=0;i<tamaño;i++)
        {
           for(int j=0;j<tamaño;j++)
           {
               if((j+1)<tamaño)
               {
                   if(Integer.parseInt(matriz[j][2])>Integer.parseInt(matriz[j+1][2]))
                   {
                        temporal1=matriz[j][2];
                        temporal2=matriz[j][0];
                        temporal3=matriz[j][1];
                        matriz[j][2]=matriz[j+1][2];
                        matriz[j][0]=matriz[j+1][0];
                        matriz[j][1]=matriz[j+1][1];
                        matriz[j+1][2]=temporal1;
                        matriz[j+1][0]=temporal2;
                        matriz[j+1][1]=temporal3;
                   }
               }
            }
        }
        return matriz;
    }           
    public String [][] MetodoMergeCedula(String matriz[][],int tamaño)
    {
        OrdenPersonas ordenamiento = new OrdenPersonas();
        String [][] ordenado ;
        ordenado = ordenamiento.MergesortCedula(matriz, 0, tamaño-1);
        return ordenado;
    }
    public String[][] MergesortCedula(String matriz[][],int primero,int ultimo)
    {
        OrdenPersonas orden= new OrdenPersonas();
        int medio;
        if(primero<ultimo)
        {
            medio=(primero+ultimo)/2;
            orden.MergesortCedula(matriz, primero, medio);
            orden.MergesortCedula(matriz,medio+1,ultimo);
            MezclarCedula(matriz,primero,medio,ultimo);
        }
        return matriz;
    }
    public String [][] MezclarCedula(String matriz[][], int izquierda,int medio, int derecha)
    {
        int n1 = medio - izquierda + 1; 
        int n2 = derecha - medio; 
        
        String izq1[][] = new String [n1][3]; 
        String der1[][] = new String [n2][3];
        
        String izq2[][] = new String [n1][3]; 
        String der2[][] = new String [n2][3];
        
        String izq3[][] = new String [n1][3]; 
        String der3[][] = new String [n2][3]; 
  
        for (int i=0; i<n1; ++i) 
        {
            izq1[i][0] = matriz[izquierda + i][0]; 
            izq2[i][1] = matriz[izquierda + i][1]; 
            izq3[i][2] = matriz[izquierda + i][2]; 
        }
            
        for (int j=0; j<n2; ++j) 
        {
            der1[j][0] = matriz[medio + 1+ j][0];
            der2[j][1] = matriz[medio + 1+ j][1];
            der3[j][2] = matriz[medio + 1+ j][2];
        }
             
  
        int i = 0, j = 0; 
        int k = izquierda; 
        
        while (i < n1 && j < n2) 
        { 
            if (Double.parseDouble(izq3[i][3]) <= Double.parseDouble(der3[j][3])) 
            { 
                matriz[k][0] = izq1[i][0]; 
                matriz[k][1] = izq2[i][1];
                matriz[k][2] = izq3[i][2];
                i++; 
            } 
            else
            { 
                matriz[k][0] = der1[j][0]; 
                matriz[k][1] = der2[j][1];
                matriz[k][2] = der3[j][2]; 
                j++; 
            } 
            k++; 
        }
        while (i < n1) 
        { 
            matriz[k][0] = izq1[i][0]; 
            matriz[k][1] = izq2[i][1];
            matriz[k][2] = izq3[i][2];
            i++; 
            k++; 
        }
        while (j < n2) 
        { 
            matriz[k][0] = der1[j][0]; 
            matriz[k][1] = der2[j][1]; 
            matriz[k][2] = der3[j][2]; 
            j++; 
            k++; 
        }
        return matriz;
    }
    public String [][] MetodoMergeEdad(String matriz[][],int tamaño)
    {
        OrdenPersonas ordenamiento = new OrdenPersonas();
        String [][] ordenado;
        ordenado = ordenamiento.MergesortEdad(matriz, 0, tamaño-1);
        return ordenado;
    }
    public String[][] MergesortEdad(String matriz[][],int primero,int ultimo)
    {
        OrdenPersonas orden= new OrdenPersonas();
        int medio;
        if(primero<ultimo)
        {
            medio=(primero+ultimo)/2;
            orden.MergesortEdad(matriz, primero, medio);
            orden.MergesortEdad(matriz,medio+1,ultimo);
            MezclarEdad(matriz,primero,medio,ultimo);
        }
        return matriz;
    }
    public String [][] MezclarEdad(String matriz[][], int izquierda,int medio, int derecha)
    {
        int n1 = medio - izquierda + 1; 
        int n2 = derecha - medio; 
        
        String izq1[][] = new String [n1][3]; 
        String der1[][] = new String [n2][3];
        
        String izq2[][] = new String [n1][3]; 
        String der2[][] = new String [n2][3];
        
        String izq3[][] = new String [n1][3]; 
        String der3[][] = new String [n2][3]; 
  
        for (int i=0; i<n1; ++i) 
        {
            izq1[i][0] = matriz[izquierda + i][0]; 
            izq2[i][1] = matriz[izquierda + i][1]; 
            izq3[i][2] = matriz[izquierda + i][2]; 
        }
            
        for (int j=0; j<n2; ++j) 
        {
            der1[j][0] = matriz[medio + 1+ j][0];
            der2[j][1] = matriz[medio + 1+ j][1];
            der3[j][2] = matriz[medio + 1+ j][2];
        }
             
  
        int i = 0, j = 0; 
        int k = izquierda; 
        
        while (i < n1 && j < n2) 
        { 
            if (Double.parseDouble(izq3[i][2]) <= Double.parseDouble(der3[j][2])) 
            { 
                matriz[k][0] = izq1[i][0]; 
                matriz[k][1] = izq2[i][1];
                matriz[k][2] = izq3[i][2];
                i++; 
            } 
            else
            { 
                matriz[k][0] = der1[j][0]; 
                matriz[k][1] = der2[j][1];
                matriz[k][2] = der3[j][2]; 
                j++; 
            } 
            k++; 
        }
        while (i < n1) 
        { 
            matriz[k][0] = izq1[i][0]; 
            matriz[k][1] = izq2[i][1];
            matriz[k][2] = izq3[i][2];
            i++; 
            k++; 
        }
        while (j < n2) 
        { 
            matriz[k][0] = der1[j][0]; 
            matriz[k][1] = der2[j][1]; 
            matriz[k][2] = der3[j][2]; 
            j++; 
            k++; 
        }
        return matriz;
    }
}

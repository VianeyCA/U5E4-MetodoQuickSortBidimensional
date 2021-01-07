package metodoquicksortbidiu5e4;
public class MetodoQuicksortBidiU5E4 {

     public static void main(String[] args) {
         // TODO code application logic here
         MetodoQuicksortBidiU5E4 metodo=new MetodoQuicksortBidiU5E4();
         int A[][]={
             {8,4,3},
             {9,7,6},
             {1,5,2}
         };
         System.out.println("------------ Arreglo ------------");
         metodo.mostrar(A);
         int V[]= metodo.arreglo(A);
         metodo.Quicksort(V, 0, V.length -1);
         for (int cont=0, i = 0; i < A.length; i++) {
             for (int j = 0; j < A[i].length; j++) {
                 A[i][j]=V[cont];
                 cont++;
             }
         }
         System.out.println("---------Arreglo ordenado---------");
         metodo.mostrar(A);
     }
     
     public int [] arreglo(int A[][]){
         int V[]=new int [A.length*A[0].length];
         for (int cont = 0, i = 0; i <A.length; i++) {
             for (int j = 0; j < A[i].length; j++) {
                 V[cont]=A[i][j];
                 cont++;
             }
         }
         return V;
     }
     public void mostrar(int A[][]){
         for (int i = 0; i < A.length; i++) {
             for (int j = 0; j < A[i].length; j++) {
                 System.out.print(" "+ A[i][j]);
             }
             System.out.println("");
         }
     }
     
     public void Quicksort(int A[], int primero, int ultimo){
         int i;
         int j;
         int contador;
         int pivote;
         i = primero;
         j = ultimo;
         pivote = A[(primero + ultimo)/2]; 
         do{
             while(A[i] < pivote){
             i++;
         }
             while(A[j] > pivote){
                 j--;
             }
             if(i <= j){
                 contador = A[i];
                 A[i]=A[j];
                 A[j]=contador;
                 i++;
                 j--;
             }
         }while(i <= j);         
         if(j > primero){
             Quicksort(A, primero, j);
         }
         if(i<ultimo){
             Quicksort(A, i, ultimo);
         }
     }    
}


public class Second {

    public static void main(String[] args) {
        String letras="abcdefghijklmnop";
        char []letra= letras.toCharArray(); 
        int suma;
        int c=0;
        char m[][]= new char[4][4];
        char [] arr = new char[4];
        for (int i=0;i<4;i++){
            
            for (int j=0;j<4;j++){
                m[i][j]=letra[c];
                c++;
            }
        }
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                System.out.print(m[i][j]+" ");
                suma=i+j;
                if (suma==3)
                    arr[j]=m[i][j];
            } System.out.println();
        }
        


        
        System.out.println();
        for (int x=0;x<4;x++)
            System.out.print(arr[x]+" ");
        
        System.out.println();
        
        
    }
    
}
        

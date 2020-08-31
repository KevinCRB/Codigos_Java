
public class matriz3x3 {

    public static void main(String[] args) {
        int cont=0;
        int m[][]= new int[3][3];
        int [] arr = new int[3];
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                cont++;
                m[i][j]=cont;
            }
        }
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(m[i][j]+" ");
                if (i==j){
                    arr[j]=m[i][j];
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int x=0;x<3;x++)
            System.out.print(arr[x]+" ");
        
        System.out.println();
        
        
    }
    
}

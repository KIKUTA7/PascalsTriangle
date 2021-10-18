package fop.w3pascal;

class Pascal extends MiniJava {
    // Function for computing the first n rows of Pascal's triangle.
    public static int[][] pascal(int n) {

int b [][] = new int [n][n];
b[0][0]=1;
b[1][0]=1;
b[1][1]=1;
for (int i=2; i<n;i++)
{
    b[i][0] =1;
    b[i][i] = 1;
    for(int j=1;j<i;j++)
        b[i][j] = b[i-1][j-1] + b[i-1][j];
}
return b;
    }

    public static void main(String[] args) {
       int n=readInt("Please insert number of rows:");
       int [][] a = pascal(n);
       int i=1;
       for (int k=0;k<n;k++)
       {
           writeConsole("n="+k+"    ");
           for(int j=0;j<i;j++)
           {  writeConsole(a[k][j] + "   ");}
           i++;
           write("");
       }


    }
}

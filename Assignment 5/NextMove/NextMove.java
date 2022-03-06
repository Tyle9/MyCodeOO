public class NextMove
{
        public Move getNextMove(char board[][])
        {
                for(int i=0;i<3;i++)
                {
                        for(int j=0;j<3;j++)
                        {
                                if(board[i][j]==' ')
                                return new Move(i,j);
                        }
                }
                return null;
        }
}
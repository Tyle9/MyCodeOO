public class SmartMove extends NextMove
{
        public Move getNextMove(char board[][])
        {
                int countX=0,countO=0;
                for(int i=0;i<3;i++)
                {
                        for(int j=0;j<3;j++)
                        {
                                if(board[i][j]=='O')
                                	countO++;
                                if(board[i][j]=='X')
                                        countX++;
                        }
                        if(countO==2||countX==2)
                        for(int j=0;j<3;j++)
                        {
                                if(board[i][j]==' ')
                                return new Move(i,j);
                        }
                        countX=0;
                        countO=0;
                }
                return super.getNextMove(board);
        }
}
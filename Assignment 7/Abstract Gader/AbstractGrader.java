public abstract class AbstractGrader implements IGrader{
    protected IFilter m_filter;
    protected int[] m_grades;
    
    public AbstractGrader(int[] grades, IFilter filter) {
            this.m_filter = filter;
            this.m_grades = grades;
    }
}
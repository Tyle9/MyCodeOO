public class Mean extends AbstractGrader{
    public Mean(int[] grades, IFilter filter) {
            super(grades, filter);
    }

    @Override
    public double grade() {
            int[] grades;
            if (m_filter != null)
                    grades = m_filter.filter(m_grades);
            else
                    grades = m_grades.clone();
            double sum = 0;
            for(int index =0; index < grades.length; index++) {
                    sum += grades[index];
            }
            return sum / grades.length;
    }
}
import java.util.Arrays;

public class Median extends AbstractGrader{
        public Median(int[] grades, IFilter filter) {
                super(grades, filter);
        }

        @Override
        public double grade() {
                int[] grades;
                if (m_filter != null)
                        grades = m_filter.filter(m_grades);
                else
                        grades = m_grades.clone();
             Arrays.sort(grades);
             double medianGrade;
             if (grades.length % 2 == 0) {
                int sumMiddleGrades = grades[grades.length / 2] +
                                grades[grades.length / 2 - 1];
                medianGrade = (double)sumMiddleGrades / 2;
             } else {
                 medianGrade = (double)grades[grades.length / 2];
          }
          return medianGrade;
        }
}
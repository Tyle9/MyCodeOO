public class House implements IEstimatable {
    private int m_sqrFt;
    
    public House(int sqrFt) {
        m_sqrFt = sqrFt;
    }

    public House() {
        m_sqrFt = 0;
    }

    public double estimate() {
        if (m_sqrFt < 1000)
            return 1000 * 97;
        else
            return m_sqrFt * 97;
    }
}
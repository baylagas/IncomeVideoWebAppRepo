package com.incomeformwebapp.objects;

public class IncomeObj 
{
    private int m_iId;
    private String m_strCategory;
    private int m_iAmount;

    public IncomeObj(int p_iId, String p_strCategory, 
            int p_iAmount) 
    {
        setId(p_iId);
        setCategory(p_strCategory);
        setAmount(p_iAmount);
    }

    public int getId() {
        return m_iId;
    }

    private void setId(int p_iId) {
        m_iId = p_iId;
    }

    public String getCategory() {
        return m_strCategory;
    }

    private void setCategory(String p_strCategory) {
        m_strCategory = p_strCategory;
    }

    public int getAmount() {
        return m_iAmount;
    }

    private void setAmount(int p_iAmount) {
        m_iAmount = p_iAmount;
    }
    
}

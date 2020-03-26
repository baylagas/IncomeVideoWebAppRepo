package com.incomeformwebapp.logic;

import balcorpfw.database.DatabaseX;
import balcorpfw.logic.Logic;
import com.incomeformwebapp.objects.IncomeObj;
import java.sql.ResultSet;
import java.util.List;

public class IncomeLogic extends Logic
{

    public IncomeLogic() 
    {
    }

    public IncomeLogic(String pConnectionString) 
    {
        super(pConnectionString);
    }
    
    //su codigo comienza aca
    public List<IncomeObj> getAllIncome()
    {
        DatabaseX database = getDatabase();
        String strSql = "select * from personalfinancedb.income;";
        ResultSet result = database.executeQuery(strSql);
        
        return null;
    }
}

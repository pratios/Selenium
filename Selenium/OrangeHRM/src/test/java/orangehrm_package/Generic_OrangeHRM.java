package orangehrm_package;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class Generic_OrangeHRM {
	
	public void Run(String ClassName, String MethodName, Object ...inputargs) {
		
		Class<?>params[]= new Class[inputargs.length];
		
		for(int i=0; i<inputargs.length; i++) {
			if(inputargs[i] instanceof String) {
				params[i] = String.class;
			}
		}
		
		try {
			Class<?> cls = Class.forName(ClassName);
			Object obj	 = cls.newInstance();
			Method m = cls.getDeclaredMethod(MethodName, params);
			m.invoke(obj, inputargs);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception in generic class : "+e.getMessage());
		}
			
	}
	
	
  @Test
  public void logintoOR() {
	  
	  ReadExcel_OrangeHRM obj = new ReadExcel_OrangeHRM("C:\\Users\\Pratiksha\\Documents\\Selenium\\OrangeHRM\\OrangeHRMKeywords.xlsx", "Sheet1");
	   int r = obj.getLastRowNumberOR();
	   System.out.println(r);
	   
	   for(int i=1; i<=r; i++) {
		   String MethodName = obj.getCellValueOR(i, 0);
		   System.out.println(MethodName);
		   
		   List<Object> data = new ArrayList<>();
		   
		   for(int j=1; j<obj.getLastColumnNumberOR(i); j++) {
			   
			   if(!obj.getCellValueOR(i,j).equals("null")) {
				   System.out.println(obj.getCellValueOR(i,j));
				   String d = obj.getCellValueOR(i,j);
				   data.add(d);
			   }
		   }
		   Object []lst = new String[data.size()];
		   lst=data.toArray();
		   Run("orangehrm_package.Keywords_OrangeHRM", MethodName, lst);
	   }
  }
}

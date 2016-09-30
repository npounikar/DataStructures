import java.util.Iterator;
import java.util.List;


    public class Color {
        private String name;
    
        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    
    
    
    int compute(int n)
    {
        int result;

       if(n==1)
         return 1;

       result = compute(n-1) * n;
       return result;
    }

    public List<Color> removeBlues(List<Color> inputColors) {
       Iterator<Color> it = inputColors.iterator();
       while(it.hasNext()) {
    	   if(it.next().getName().equals("blue"))
    		   it.remove();
       }
       return null;
    }
    }
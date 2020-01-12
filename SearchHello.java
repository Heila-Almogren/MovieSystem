public class SearchHello {
	public static void main(String[] args) {
		List<String> l = new LinkedList<String>();
		l.insert("hello");
		l.insert("hello");
		l.insert("hello");
		StringEqualCond cnd = new StringEqualCond("hello");
		System.out.println(l.findFirstEle(cnd)); // prints true
                List<String> m = new LinkedList<String>(); 
                int c = 0 ; 
                m = l.findAllEle(cnd);
                m.findFirst();
                if(!m.empty())
                {
                    c= 1 ;
                while(!m.last()){
                    c++;
                    m.findNext();
                }
                
                }
                System.out.println(c);
	}
}

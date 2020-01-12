/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author heila
 */
public class LinkedList<T> implements List<T>{

    private Node<T> head;
    private Node <T> current;
    
public LinkedList () {  //varified
head = current = null;
}

    @Override    
public boolean empty(){     //varified
    return (head == null);
};

@Override
public boolean full(){      //varified
    return false;    
};

@Override
public void findFirst(){        //varified
    current = head;
};

@Override
public void findNext(){         //varified
    current = current.next();
}; 

@Override
public boolean last(){      //varified

    return (current.next() == null);
}

@Override
public T retrieve(){        //varified
    return current.data;
}; 

@Override
public void update(T e){        //varified
    current.data = e;
}; 

@Override
public void insert(T e){        //varied
    
    Node<T> tmp;
		if (empty()) {
			current = head = new Node<T> (e);
                        
		}
		else {
			tmp = current.next;
			current.next = new Node<T> (e);
			current = current.next;
			current.next = tmp;
                        
		}

    
    
    /*
    if(empty()){
        current = head = new Node<T>(e);
    }
    else{
        Node ND = new Node(e);
    Node save = current.next();
    current.setNext(ND);
    ND.setNext(save);
    }   */
};

@Override
public void remove(){       //varified
    
    		if (current == head) {
			head = head.next;
		}
		else {
			Node<T> tmp = head;

			while (tmp.next != current)
				tmp = tmp.next;

			tmp.next = current.next;
		}

		if (current.next == null)
			current = head;
		else
			current = current.next;
	}

    
    /*
    if (current == head){
        head = head.next();
    }
    else{
        Node temp = head;
        while(temp.next() != current){
        temp = temp.next();
    }
       temp.setNext(current.next()); 
        
    }
    
    
    if (current.next() == null){
        current = head;
    } else { current = current.next(); }    */
    


@Override
public boolean findFirstEle(Cond<T> cnd){       //done
    
    
        Node <T> temp = head;
        while(temp !=null){
            if (cnd.test(temp.data)){
                current = temp;
                return true;
                    }
            
            temp = temp.next;
        }
    
    
        return false; 
            
}

@Override
public List<T> findAllEle(Cond<T> cnd){     //varified
    
    List<T> x = new LinkedList<T>();
    Node <T>temp = head;
    while (temp != null){
        
        if (cnd.test(temp.data)){
            x.insert(temp.data);
        }
    temp = temp.next();
    }
    return x;       //change this later
};
}

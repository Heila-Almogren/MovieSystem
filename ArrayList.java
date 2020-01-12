/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author heila
 */
public class ArrayList<T> implements List<T>{
	private int maxsize;
	private int size;
	private int current;
	private T[] nodes;

public ArrayList(int n) {       //done
    maxsize = n;
    size = 0;
    current = -1;
    nodes = (T[]) new Object[n];
}

@Override    
public boolean empty(){     //done
    return (size == 0);
    }

@Override
public boolean full(){  //done
    return (size == maxsize);
    
};

@Override
public void findFirst(){        //done
        current = 0;
};

@Override
public void findNext(){
        current++;      //done
};

@Override
public boolean last(){      //done
    
    return (current == size -1);
};

@Override
public T retrieve(){        //done
        return nodes[current];
}; 

@Override
public void update(T e){        //done
    nodes[current] = e;
}; 

@Override
public void insert(T e){        //done
    int c = current +1;
    if (current != size && size+1!=maxsize)
    nodes[++c] = nodes[c];
    
    for (int i = c; i < size; i++){
        nodes[i+1] = nodes[i];
    }
    
    nodes[++current] = e;
    size++;
}; 

@Override
public void remove(){       //done
    
    for (int i = current; i < size; i++){
        nodes[i]=nodes[i+1];
    }
    //current;
    size--;
    
    if (size == 0)
        current = -1;
    else if (current == size)
        current = 0;
};

@Override
public boolean findFirstEle(Cond<T> cnd){

    if (size == 0) return false;
    
    for (int i = 0 ; i < size; i++){
        if (cnd.test(nodes[i])){
            current = i;
            return true;}
    }
    return false;
};

@Override
public List<T> findAllEle(Cond<T> cnd){
    
    //List<T> FAE = new ArrayList<T>(0);
    int count = 0;
    for (int i = 0 ; i < size; i++){
        if (cnd.test(nodes[i])){
            current = i;
            count++;}
    }
    
    List<T> FAE = new ArrayList<T>(count);
        for (int i = 0 ; i < size; i++){
        if (cnd.test(nodes[i]))
            FAE.insert(nodes[i]);
    }
        
        return FAE;
};
}

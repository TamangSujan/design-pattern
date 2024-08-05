package behaviour.chain_of_responsibility.implementation;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {
    private final List<Filter> filters;
    private int currentFilterIndex = 0;
    public FilterChain(){
        filters = new ArrayList<>();
    }

    public void addFilter(Filter filter){
        filters.add(filter);
    }

    public void chain(String request){
        if(currentFilterIndex == filters.size()){
            currentFilterIndex = 0;
            return;
        }
        Filter filter = filters.get(currentFilterIndex++);
        filter.filter(request, this);
    }
}

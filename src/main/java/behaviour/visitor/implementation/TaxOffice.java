package behaviour.visitor.implementation;

import java.util.LinkedList;
import java.util.List;

public class TaxOffice {
    private final List<Home> taxableHomes;
    private final Visitor taxCollector;
    public TaxOffice(Visitor taxCollector){
        this.taxCollector = taxCollector;
        taxableHomes = new LinkedList<>();
    }

    public void add(Home taxableHome){
        taxableHomes.add(taxableHome);
    }

    public void collectTax(){
        for(Home taxableHome: taxableHomes){
            taxableHome.visit(taxCollector);
        }
    }
}

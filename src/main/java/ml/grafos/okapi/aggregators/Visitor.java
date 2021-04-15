package ml.grafos.okapi.aggregators;

public interface Visitor {
	
	public void visit(FloatAvgAggregator faa);
	public void visit(TextAggregatorWriter taw);	
}

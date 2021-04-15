package ml.grafos.okapi.aggregators;

public class AggregatorDisplayVisitor implements Visitor{

	@Override
	public void visit(FloatAvgAggregator faa) {
		// TODO Auto-generated method stub
		System.out.println("Directed to the FloatAvgAggregator.");
	}

	@Override
	public void visit(TextAggregatorWriter taw) {
		// TODO Auto-generated method stub
		System.out.println("Directed to the TextAggregatorWriter.");
	}
	
}

package ml.grafos.okapi.aggregators;

/**
 * Main template of the visitor pattern class.
 * 
 * @author Muskan Sarvesh
 *
 */
public class VisitorTemplate {
	public static void visitorImplementation(String aggregator) {
		if(aggregator.equalsIgnoreCase("floatAvgAggregator")) {
			MainAggregator ma = new FloatAvgAggregator();
			ma.accept(new AggregatorDisplayVisitor());
		}
		
		else {
			MainAggregator ma = new TextAggregatorWriter();
			ma.accept(new AggregatorDisplayVisitor());
		}
	}
}

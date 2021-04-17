package ml.grafos.okapi.io.formats;

public class OutputFactory extends AbstractFactory{
	@Override
	public TextFormatForEdgeInputOutput getInputEdgeFormat(String TextEdgeOutputFormatType) {
		
		if(TextEdgeOutputFormatType.equalsIgnoreCase("EdgesWithValuesVertexOutput")) {
			  return new EdgesWithValuesVertexOutputFormat(); 
		}
		else if(TextEdgeOutputFormatType.equalsIgnoreCase("LongDouble ")) {
			return new LongDoubleTextEdgeOutputFormat();
		}
		
		else if(TextEdgeOutputFormatType.equalsIgnoreCase("LongDoubleDoubleAdjacencyListTextVertex")) {
			return new LongDoubleDoubleAdjacencyListTextVertexOutputFormat();
		}else {
			return null;
		}
	}
}


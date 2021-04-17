package ml.grafos.okapi.io.formats;

public abstract class AbstractInputFactory {
    public abstract TextFormatForEdgeInput getInputEdgeFormat(String TextEdgeInputFormatType);
}

class IntFactory extends AbstractInputFactory{
	@Override
	public TextFormatForEdgeInput getInputEdgeFormat(String type)
	{
		if(type.equalsIgnoreCase("intDouble")) {
			  return new IntDoubleTextEdgeInputFormat(); 
		}else if(type.equalsIgnoreCase("intint")) {
			  return new IntIntTextEdgeInputFormat();
		}else {
			return null;
		}
	}
}

class LongFactory extends AbstractInputFactory{
	@Override
	public TextFormatForEdgeInput getInputEdgeFormat(String type)
	{
		if(type.equalsIgnoreCase("LongFloat ")) {
			return new LongFloatTextEdgeInputFormat();
		}else if(type.equalsIgnoreCase("LongDoubleZeros ")) {
			return new LongDoubleZerosTextEdgeInputFormat();
		}else if(type.equalsIgnoreCase("LongDouble ")) {
			return new LongDoubleTextEdgeInputFormat();
		}
		else if(type.equalsIgnoreCase("LongDoubleBoolean ")) {
			return new LongDoubleBooleanEdgeInputFormat();
		}else {
			return null;
		}
	}
}

class FactoryProducer{
	public static AbstractInputFactory getFactory(boolean isInt) {
		if(isInt)
		{
			return new IntFactory();
		}
		else
		{
			return new LongFactory();
		}
	}
}
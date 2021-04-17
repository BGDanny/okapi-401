package ml.grafos.okapi.io.formats;


public class InputFactory extends AbstractFactory{
		@Override
    	public TextFormatForEdgeInputOutput getInputEdgeFormat(String type)
    	{
    		if(type.equalsIgnoreCase("intDouble")) {
    			  return new IntDoubleTextEdgeInputFormat(); 
    		}else if(type.equalsIgnoreCase("intint")) {
    			  return new IntIntTextEdgeInputFormat();
    		}if(type.equalsIgnoreCase("LongFloat ")) {
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


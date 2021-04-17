package ml.grafos.okapi.io.formats;

public class productFactory extends AbstractInputFactory {
	@Override
	public TextFormatForEdgeInput getInputEdgeFormat(String TextEdgeInputFormatType) {

		if (TextEdgeInputFormatType.equalsIgnoreCase("intDouble")) {

			return new IntDoubleTextEdgeInputFormat();

		}

		else if (TextEdgeInputFormatType.equalsIgnoreCase("intint")) {

			return new IntIntTextEdgeInputFormat();
		}

		else if (TextEdgeInputFormatType.equalsIgnoreCase("LongDoubleBoolean")) {

			return new LongDoubleBooleanEdgeInputFormat();

		}

		else if (TextEdgeInputFormatType.equalsIgnoreCase("LongDouble")) {

			return new LongDoubleTextEdgeInputFormat();

		}

		else if (TextEdgeInputFormatType.equalsIgnoreCase("LongDoubleZeros")) {

			return new LongDoubleZerosTextEdgeInputFormat();

		}

		else if (TextEdgeInputFormatType.equalsIgnoreCase("LongFloat")) {

			return new LongFloatTextEdgeInputFormat();

		} else {

			System.out.println(" The type does not exists");

			return null;
		}
	}

}

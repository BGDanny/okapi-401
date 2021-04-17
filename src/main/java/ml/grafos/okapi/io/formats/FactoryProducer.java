package ml.grafos.okapi.io.formats;

public class FactoryProducer{
	public static AbstractFactory getFactory(boolean isInput) {
		if(isInput)
		{
			return new InputFactory();
		}
		else
		{
			return new OutputFactory();
		}
	}
}

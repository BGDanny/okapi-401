package ml.grafos.okapi.io.formats;

public abstract class AbstractFactory {
	public abstract TextFormatForEdgeInputOutput getEdgeFormat(String type);
}

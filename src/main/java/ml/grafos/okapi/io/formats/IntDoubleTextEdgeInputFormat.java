/**
 * Copyright 2014 Grafos.ml
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ml.grafos.okapi.io.formats;

import java.io.IOException;
import java.util.regex.Pattern;

import org.apache.giraph.io.EdgeReader;
import org.apache.giraph.io.formats.IntNullTextEdgeInputFormat;
import org.apache.giraph.io.formats.TextEdgeInputFormat;
import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.InputSplit;
import org.apache.hadoop.mapreduce.TaskAttemptContext;

/**
 * Simple text-based {@link org.apache.giraph.io.EdgeInputFormat} for weighted
 * graphs with int ids double values.
 *
 * Each line consists of: <src id> <target id> <edge weight>
 */
public class IntDoubleTextEdgeInputFormat extends TextEdgeInputFormat<IntWritable, DoubleWritable>
		implements TextFormatForEdgeInputOutput {
	/** Splitter for endpoints */
	private static final Pattern SEPARATOR = Pattern.compile("[\t ]");

	@Override
	public EdgeReader<IntWritable, DoubleWritable> createEdgeReader(InputSplit split, TaskAttemptContext context)
			throws IOException {
		return new IntDoubleTextEdgeReader();
	}

	/**
	 * {@link org.apache.giraph.io.EdgeReader} associated with
	 * {@link IntNullTextEdgeInputFormat}.
	 */
	public class IntDoubleTextEdgeReader extends TextEdgeReaderFromEachLineProcessed<String[]> {
		@Override
		protected String[] preprocessLine(Text line) throws IOException {
			return SEPARATOR.split(line.toString());
		}

		@Override
		protected IntWritable getSourceVertexId(String[] tokens) throws IOException {
			return new IntWritable(Integer.parseInt(tokens[0]));
		}

		@Override
		protected IntWritable getTargetVertexId(String[] tokens) throws IOException {
			return new IntWritable(Integer.parseInt(tokens[1]));
		}

		@Override
		protected DoubleWritable getValue(String[] tokens) throws IOException {
			return new DoubleWritable(Double.parseDouble(tokens[2]));
		}
	}

	@Override
	public void Edgeinputouputformat() {
		// TODO Auto-generated method stub

	}
}

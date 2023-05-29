package uk.ac.gla.dcs.bigdata.studentfunctions;

import org.apache.spark.api.java.function.FlatMapFunction;
import org.apache.spark.broadcast.Broadcast;
import scala.Tuple2;
import uk.ac.gla.dcs.bigdata.studentstructures.Document;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DocumentTermCountFormatter implements FlatMapFunction<Document, Tuple2<String, Integer>> {
    @Override
    public Iterator<Tuple2<String, Integer>> call (Document doc) {
        List<Tuple2<String, Integer>> queryDocPairs = new ArrayList<>();
					for (String term : doc.getContentTermCountMap().keySet()) {

							queryDocPairs.add(new Tuple2<String, Integer>(term, (int) doc.getContentTermCountMap().get(term)));

					}
				return queryDocPairs.iterator();
    }
}

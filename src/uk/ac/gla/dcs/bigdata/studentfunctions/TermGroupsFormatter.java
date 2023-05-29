package uk.ac.gla.dcs.bigdata.studentfunctions;

import java.util.Iterator;

import org.apache.spark.api.java.function.MapGroupsFunction;

import scala.Tuple2;

public class TermGroupsFormatter implements MapGroupsFunction<String, Tuple2<String,Integer>, Tuple2<String,Integer>>{

	@Override
	public Tuple2<String, Integer> call(String key, Iterator<Tuple2<String, Integer>> values) throws Exception {
		int totalCount = 0;
		
		while (values.hasNext()) { //adds up term counts for one term/key
			Tuple2<String,Integer> ele = values.next();
			totalCount += ele._2();
		}
		
		
		return new Tuple2<String,Integer>(key,totalCount);
	}

}

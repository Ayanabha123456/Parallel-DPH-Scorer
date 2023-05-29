package uk.ac.gla.dcs.bigdata.studentfunctions;

import org.apache.spark.api.java.function.ReduceFunction;
import scala.Tuple2;

public class TermSum implements ReduceFunction<Tuple2<String,Integer>> {
    private static final long serialVersionUID = -4931804781L;

    @Override
    public Tuple2<String, Integer> call(Tuple2<String, Integer> t1, Tuple2<String, Integer> t2) throws Exception {
        return new Tuple2<String, Integer>(t1._1, (t1._2 + t2._2));
    }
}

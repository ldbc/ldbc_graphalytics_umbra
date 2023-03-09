package science.atlarge.graphalytics.umbra.test;

import science.atlarge.graphalytics.umbra.UmbraLoadComputation;

import java.sql.SQLException;
import java.sql.Statement;

public class ExampleGraphLoader {

    public static void loadDirected(Statement statement) throws SQLException {
        UmbraLoadComputation umbraLoadComputation = new UmbraLoadComputation(statement, "example-directed", true, true);
        umbraLoadComputation.load();
    }

    public static void loadUndirected(Statement statement) throws SQLException {
        UmbraLoadComputation umbraLoadComputation = new UmbraLoadComputation(statement, "example-undirected", false, true);
        umbraLoadComputation.load();
    }

    public static void loadFosdem(Statement statement) throws SQLException {
        UmbraLoadComputation umbraLoadComputation = new UmbraLoadComputation(statement, "fosdem", false, false);
        umbraLoadComputation.load();
    }

    public static void loadFosdemWeighted(Statement statement) throws SQLException {
        UmbraLoadComputation umbraLoadComputation = new UmbraLoadComputation(statement, "fosdem-weighted", false, true);
        umbraLoadComputation.load();
    }

    public static void loadFosdemDirected(Statement statement) throws SQLException {
        UmbraLoadComputation umbraLoadComputation = new UmbraLoadComputation(statement, "fosdem-directed", true, false);
        umbraLoadComputation.load();
    }

}

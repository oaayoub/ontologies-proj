package org.example.demo;

public class StringReplacement {
        public static void main(String[] args) {
            // Sample string containing the patterns to replace
            String inputString = "sparql\nSELECT ?player\nWHERE {\n  ?player rdf:type dbpedia-owl:Person .\n  ?player foaf:name ?name .\n  FILTER regex(?name, \"Cristiano\")\n}\n";

            // Replace occurrences of ``` or \n or \" with a space
            String replacedString = inputString.replaceAll("`|\\\\n|\\\\\"", " ");

            // Output the replaced string
            System.out.println("Replaced String:");
            System.out.println(replacedString);
        }
}

package collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;

// Using Iterable interface creating our own Iterable class

public class UsingIterator {
    public static void main(String[] args) {
        UrlLibrary urls = new UrlLibrary();
        for (String html : urls) {
            System.out.println(html.length());
        }
    }
}

class UrlLibrary implements Iterable<String> { // Creating a custom Iterable
    LinkedList<String> UrlList = new LinkedList<>();

    UrlLibrary() {
        UrlList.add("https://trinetramks.blogspot.com");
        UrlList.add("https://www.facebook.com");
        UrlList.add("https://www.udemy.com");
    }

    private class UrlIterator implements Iterator<String> { // creating an iterator class for custom tasks
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < UrlList.size();
        }

        @Override
        public String next() {
            StringBuilder sb = new StringBuilder();
            try {
                URL url = new URL(UrlList.get(index));

                BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
                // String line = null;

                // while ((line = br.readLine()) != null) {
                // sb.append(line);
                // sb.append("\n");
                // }

                while (br.readLine() != null) {
                    sb.append(br.readLine());
                    sb.append("\n");
                }
                br.close();
            } catch (MalformedURLException e) {
                System.out.println("URL Exception");
            } catch (IOException e) {
                System.out.println("IO Exception");
            }
            index++;
            return sb.toString();
        }

    }

    @Override
    public Iterator<String> iterator() {
        return new UrlIterator(); // Now this is a object to the inner class
    }

    // To have a normal iterator
    // @Override
    // public Iterator<String> iterator() {
    // return UrlList.iterator();
    // }
}